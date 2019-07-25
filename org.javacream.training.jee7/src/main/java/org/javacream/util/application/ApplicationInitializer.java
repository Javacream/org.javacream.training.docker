package org.javacream.util.application;

import java.sql.Connection;
import java.sql.PreparedStatement;

import javax.annotation.Resource;
import javax.enterprise.context.ApplicationScoped;
import javax.enterprise.context.Initialized;
import javax.enterprise.event.Observes;
import javax.sql.DataSource;

@ApplicationScoped
public class ApplicationInitializer {

	@Resource(mappedName="java:jboss/datasources/ExampleDS")
	private DataSource dataSource;

	public void init(@Observes @Initialized(ApplicationScoped.class) Object init) {
		try (Connection con = dataSource.getConnection()) {
			con.createStatement().execute(
					"create table StoreTable (category varchar(100), item varchar(100), stock integer, primary key (category, item))");

			PreparedStatement query = con
					.prepareStatement("insert into StoreTable (category, item, stock) values (?, ?, ?)");

			PreparedStatement booksQuery = con
					.prepareStatement("insert into Books (isbn, title, bookprice) values (?, ?, ?)");

			for (int i = 1; i <= 10; i++) {
				String isbn = "ISBN" + i;
				query.setString(1, "books");
				query.setString(2, isbn);
				query.setInt(3, i * 5);
				query.executeUpdate();

				booksQuery.setString(1, isbn);
				booksQuery.setString(2, "Title" + i);
				booksQuery.setDouble(3, 1.99 * i);
				booksQuery.executeUpdate();

			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}

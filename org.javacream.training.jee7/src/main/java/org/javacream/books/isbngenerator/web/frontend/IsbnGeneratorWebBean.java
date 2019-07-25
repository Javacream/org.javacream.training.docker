package org.javacream.books.isbngenerator.web.frontend;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import org.javacream.books.isbngenerator.api.IsbnGenerator;

@RequestScoped
@Named
public class IsbnGeneratorWebBean {
	@Inject
	private IsbnGenerator isbnGenerator;

	private String generatedIsbn;

	public String getGeneratedIsbn() {
		return generatedIsbn;
	}

	public String next() {

		generatedIsbn = isbnGenerator.next();
		return null;
	}
}

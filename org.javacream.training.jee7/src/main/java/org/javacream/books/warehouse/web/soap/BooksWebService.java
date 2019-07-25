package org.javacream.books.warehouse.web.soap;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;

import org.javacream.books.warehouse.api.Book;
import org.javacream.books.warehouse.api.BookException;
import org.javacream.books.warehouse.api.BooksService;

@ApplicationScoped
@WebService
public class BooksWebService {
	@Inject private BooksService booksService;
	
	
	public @WebResult(name="generatedIsbn")String newBook(@WebParam(name="titleOfBook")String title){
		try {
			return booksService.newBook(title);
		} catch (BookException e) {
			throw new RuntimeException(e);
		}
	}
	
	public @WebResult(name="book") Book findBookByIsbn(@WebParam(name="isbn") String isbn){
		try {
			return booksService.findBookByIsbn(isbn);
		} catch (BookException e) {
			throw new RuntimeException(e);
		}
	}
}

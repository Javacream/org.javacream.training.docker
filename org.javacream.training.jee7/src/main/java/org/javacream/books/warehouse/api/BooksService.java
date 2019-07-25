/*
 * Created on 12.07.2004
 *
 * To change the template for this generated file go to
 * Window>Preferences>Java>Code Generation>Code and Comments
 */
package org.javacream.books.warehouse.api;

import java.util.Collection;


/**
 * 
 * @author Dr. Rainer Sawitzki
 * @company Javacream
 * @mailto rainer.sawitzki@javacream.org
 *
 */
public interface BooksService{
	/**
	 * 
	 * @param createBookValue, nie null
	 * @return die erzeugte Isbn
	 * @throws BookException
	 */
	String newBook(String title) throws BookException;

	/**
	 * 
	 * @param findBookValue, nie null
	 * @return das gefundene Buch, nie null
	 * @throws BookException
	 */
	Book findBookByIsbn(String isbn) throws BookException;
	
	/**
	 * 
	 * @param bookDetailValue nie null
	 * @return das aktualisierte Buch
	 * @throws BookException
	 */
	Book updateBook(Book bookValue) throws BookException;
	
	/**
	 * 
	 * @param findBookValue nie null
	 * @throws BookException
	 */
	void deleteBookByIsbn(String isbn) throws BookException;
	
	Collection<Book> findAllBooks();
}

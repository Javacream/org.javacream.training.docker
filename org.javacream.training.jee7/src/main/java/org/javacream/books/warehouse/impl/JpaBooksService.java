package org.javacream.books.warehouse.impl;

import java.util.Collection;
import java.util.List;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.transaction.Transactional;

import org.javacream.books.isbngenerator.api.IsbnGenerator;
import org.javacream.books.warehouse.api.Book;
import org.javacream.books.warehouse.api.BookException;
import org.javacream.books.warehouse.api.BooksService;
import org.javacream.store.api.StoreService;

/**
 * @author Dr. Rainer Sawitzki
 * @company Javacream
 * @mailto rainer.sawitzki@javacream.org
 * 
 */
@ApplicationScoped
@Transactional(Transactional.TxType.REQUIRES_NEW)
public class JpaBooksService implements BooksService {

	@PersistenceContext private EntityManager entityManager;
	@Inject private IsbnGenerator isbnGenerator;
	@Inject private StoreService storeService;
	

	public String newBook(String title) throws BookException {
		String isbn = isbnGenerator.next();
		Book book = new Book();
		book.setIsbn(isbn);
		book.setTitle(title);
		entityManager.persist(book);
		return isbn;
	}

	public Book findBookByIsbn(String isbn) throws BookException {
		Book result = entityManager.find(Book.class, isbn);
		if (result == null) {
			throw new BookException(BookException.BookExceptionType.NOT_FOUND,
					isbn);
		}
		result.setAvailable(storeService.getStock("books", isbn) > 0);
		
		return result;
	}

	public List<Book> findBooksByTitle(String title) throws BookException {
		TypedQuery<Book> query = entityManager.createQuery("select b from BookEntity as b where b.title like :title", Book.class);
		query.setParameter("title", title);
		return query.getResultList();
	}

	
	public Book updateBook(Book book) throws BookException {
		entityManager.merge(book); 
		return book;
	}

	public void deleteBookByIsbn(String isbn) throws BookException {
		entityManager.remove(entityManager.getReference(Book.class, isbn));
	}


	public Collection<Book> findAllBooks() {
		TypedQuery<Book> query = entityManager.createQuery("select b from BookEntity as b", Book.class);
		return query.getResultList();
	}
	
}

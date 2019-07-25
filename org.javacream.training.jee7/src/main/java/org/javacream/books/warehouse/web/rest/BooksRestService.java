package org.javacream.books.warehouse.web.rest;

import java.util.Collection;

import javax.inject.Inject;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.javacream.books.warehouse.api.Book;
import org.javacream.books.warehouse.api.BookException;
import org.javacream.books.warehouse.api.BooksService;

@Path("books")
public class BooksRestService {
	@Inject private BooksService booksService;
	
	
	@GET @Path("{isbn}") @Produces(MediaType.TEXT_PLAIN)
	public Book findBookByIsbn(@PathParam ("isbn")String isbn){
		try{
			return booksService.findBookByIsbn(isbn);
		}
		catch(BookException be){
			throw new RuntimeException(be);
		}
	}

	@GET @Path("{isbn}") @Produces(MediaType.APPLICATION_JSON)
	public Book findBookByIsbnAsJson(@PathParam ("isbn")String isbn){
		try{
			return booksService.findBookByIsbn(isbn);
		}
		catch(BookException be){
			throw new RuntimeException(be);
		}
	}

	
	@GET  @Produces(MediaType.TEXT_PLAIN)
	public Collection<Book> findAll(){
		return booksService.findAllBooks();
	}

	@POST @Path("{title}") @Produces(MediaType.TEXT_PLAIN)
	public String newBook(@PathParam ("title")String title){
		try{
			return booksService.newBook(title);
		}
		catch(BookException be){
			throw new RuntimeException(be);
		}
	}
	@DELETE @Path("{isbn}")
	public void deleteBookByIsbn(@PathParam ("isbn")String isbn){
		try{
			booksService.deleteBookByIsbn(isbn);
		}
		catch(BookException be){
			throw new RuntimeException(be);
		}
	}

	@PUT @Path("{isbn}") @Consumes(MediaType.APPLICATION_JSON)
	public void updateBook(Book toUpdate){
		try{
			booksService.updateBook(toUpdate);
		}
		catch(BookException be){
			throw new RuntimeException(be);
		}
	}

	
}

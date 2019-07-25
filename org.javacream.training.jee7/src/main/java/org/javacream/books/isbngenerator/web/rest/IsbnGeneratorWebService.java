package org.javacream.books.isbngenerator.web.rest;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.javacream.books.isbngenerator.api.IsbnGenerator;

@Path("key")
@RequestScoped
public class IsbnGeneratorWebService {

	@Inject private IsbnGenerator isbnGenerator;
	
	@GET @Produces(MediaType.TEXT_PLAIN)
	public String nextKey(){
		return isbnGenerator.next();
	}
}

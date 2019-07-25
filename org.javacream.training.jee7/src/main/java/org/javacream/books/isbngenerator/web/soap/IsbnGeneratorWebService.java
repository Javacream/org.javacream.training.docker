package org.javacream.books.isbngenerator.web.soap;

import javax.inject.Inject;
import javax.jws.WebResult;
import javax.jws.WebService;

import org.javacream.books.isbngenerator.api.IsbnGenerator;

@WebService
public class IsbnGeneratorWebService {

	@Inject private IsbnGenerator isbnGenerator;
	
	
	public @WebResult (name="generatedKey") String next(){
		return isbnGenerator.next();
	}
}

package org.javacream.books.isbngenerator.impl;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;

import org.javacream.books.isbngenerator.api.IsbnGenerator;
import org.javacream.util.idgenerator.api.IdGeneratorService;
import org.javacream.util.idgenerator.api.IdGeneratorStrategy;

@ApplicationScoped
public class IsbnGeneratorImpl implements IsbnGenerator {

	private String prefix = "ISBN:";
	private String countryCode = "-de";
	@Inject @IdGeneratorStrategy(strategy="sequence")
	private IdGeneratorService idGeneratorService;
	public String getCountryCode() {
		return countryCode;
	}

	public void setCountryCode(String suffix) {
		this.countryCode = suffix;
	}
	public String next(){
		return prefix + idGeneratorService.next() + countryCode;
	}

	public String getPrefix(){
		return prefix;
	}
	public void setPrefix(String prefix) {
		this.prefix = prefix;
	}
}

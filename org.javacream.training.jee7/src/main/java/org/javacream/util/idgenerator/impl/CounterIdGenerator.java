package org.javacream.util.idgenerator.impl;

import javax.enterprise.context.ApplicationScoped;

import org.javacream.util.idgenerator.api.IdGeneratorService;
import org.javacream.util.idgenerator.api.IdGeneratorStrategy;

@ApplicationScoped
@IdGeneratorStrategy(strategy="sequence")
public class CounterIdGenerator implements IdGeneratorService {

	private long counter;

	@Override
	public long next() {
		return counter++;
	}
}

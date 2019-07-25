package org.javacream.util.idgenerator.impl;

import java.util.Random;

import javax.enterprise.context.ApplicationScoped;

import org.javacream.util.idgenerator.api.IdGeneratorService;
import org.javacream.util.idgenerator.api.IdGeneratorStrategy;

@ApplicationScoped
@IdGeneratorStrategy(strategy = "random")
public class RandomIdGenerator implements IdGeneratorService {

	private Random random;

	{
		random = new Random(this.hashCode() + System.currentTimeMillis());
	}

	@Override
	public long next() {
		return random.nextLong();
	}

}

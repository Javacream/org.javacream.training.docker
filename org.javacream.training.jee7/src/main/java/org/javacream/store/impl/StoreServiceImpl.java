package org.javacream.store.impl;

import javax.enterprise.context.ApplicationScoped;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.javacream.store.api.StoreService;

@ApplicationScoped
public class StoreServiceImpl implements StoreService {

	@PersistenceContext
	private EntityManager entityManager;

	public int getStock(String category, String id) {
		Query query = entityManager
				.createNativeQuery("select stock from StoreTable where category = :category and item = :item");
		query.setParameter("category", category);
		query.setParameter("item", id);
		try {
			int result = (int) query.getSingleResult();
			return result;
		} catch (RuntimeException e) {
			System.out.println(e.getMessage());
			return 0;
		}
	}

}

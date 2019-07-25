package org.javacream.store.web.frontend;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import org.javacream.store.api.StoreService;

@RequestScoped
@Named
public class StoreServiceWebBean {
	@Inject
	private StoreService storeService;

	private int stock;
	private String category;
	private String item;

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public String getItem() {
		return item;
	}

	public void setItem(String item) {
		this.item = item;
	}

	public int getStock() {
		return stock;
	}

	public String retrieveStock() {
		stock = storeService.getStock(category, item);
		return null;
	}
}

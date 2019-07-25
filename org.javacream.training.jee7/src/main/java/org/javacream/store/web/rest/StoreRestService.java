package org.javacream.store.web.rest;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.javacream.store.api.StoreService;

@Path("/store")
@ApplicationScoped
public class StoreRestService {

	@Inject private StoreService storeService;
	
	@GET
	@Produces(MediaType.TEXT_PLAIN)
	@Path("{category}/{item}")
	public String getStock(@PathParam("category") String category, @PathParam("item") String id){
		return "Stock for category=" + category + ", id=" + id + ": " + storeService.getStock(category, id);
	}
}

package com.ab.banan.resource;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/meme")
public class MemeResource {

	@GET
	@Produces({ MediaType.TEXT_PLAIN})
	public String get() {
		return "dank meme";
	}
}
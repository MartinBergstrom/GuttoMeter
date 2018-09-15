package com.ab.banan.resource;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/")
public class GetGuttStatusResource {
	
	@GET
	@Produces({ MediaType.APPLICATION_JSON})
	public String getAll() {
		return "{ \"all the gutt things\" }";
	}

}

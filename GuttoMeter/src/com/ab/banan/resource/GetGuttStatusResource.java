package com.ab.banan.resource;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import com.ab.banan.DaoConnection;

import java.awt.List;

import javax.inject.Inject;
import javax.websocket.server.PathParam;



@Path("/")
public class GetGuttStatusResource {
	
	@Inject 
	private DaoConnection connection;
			
	@GET
	@Produces({ MediaType.APPLICATION_JSON})
	public String getAll() {
		return "hi";
	}
	
	/*
	@GET
	@Produces({ MediaType.APPLICATION_JSON})
	public String getByName(String name) {
		return getByName(name); 					 
	}
	
	@GET
	@Produces({ MediaType.APPLICATION_JSON})
	public String getAllForName(String name) {
		return getAllForName(name); 					 
	}	*/

}

package com.ab.banan.resource;

import javax.inject.Inject;
import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import com.ab.banan.DaoConnection;
import com.ab.banan.Validation;
import com.google.gson.Gson;
import com.google.gson.JsonElement;
import com.google.gson.JsonParser;
import com.google.gson.JsonSyntaxException;

@Path("save")
public class SaveGuttResource {
	
	/*@Inject
	private DaoConnection connection;
	@Inject
	private Validation validation;
	*/
	
	@POST
	@Consumes({MediaType.APPLICATION_JSON})
	@Produces({MediaType.APPLICATION_JSON})
	public Response postNewGuttStatus(String body) {
		JsonParser jsonParser = new JsonParser();
		JsonElement jsonElement = null;
		try {
			jsonElement = jsonParser.parse(body);
		} catch (JsonSyntaxException jse) {
			return Response.status(400).entity("{ \"error message\" : \"" + jse.getMessage() + "\" }").build();
		}
		
		
		//connection.postNewGutt(body)
		return Response.status(201).build();
	}
	
}

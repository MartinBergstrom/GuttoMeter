package com.ab.banan.resource;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import com.ab.banan.validation.ValidationErrorCode;
import com.ab.banan.validation.ValidationUtility;
import com.google.gson.JsonElement;
import com.google.gson.JsonParser;
import com.google.gson.JsonSyntaxException;

@Path("save")
public class SaveGuttResource {
	
	/*@Inject
	private DaoConnection connection;
	*/
	
	@POST
	@Consumes({MediaType.APPLICATION_JSON})
	public Response postNewGuttStatus(String body) {
		JsonParser jsonParser = new JsonParser();
		JsonElement jsonElement = null;
		try {
			jsonElement = jsonParser.parse(body);
		} catch (JsonSyntaxException jse) {
			return Response.status(400)
					.entity("{ \"Json syntax error\" : \"" + jse.getMessage() + "\" }")
					.build();
		}
		
		ValidationErrorCode validationCode = ValidationUtility.validateJsonElement(jsonElement);
		if (!validationCode.equals(ValidationErrorCode.OK)) {
			return Response.status(400)
					.entity("{ \"Guttvalue object validation error\" : \"" + validationCode.information + "\" }")
					.build();
		}
		//connection.postNewGutt(body)
		return Response.status(201).build();
	}
	
}

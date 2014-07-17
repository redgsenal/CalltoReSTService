package com.calltoservice;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
	
@Path("/v1/status")
public class V1Status {

	@GET
	@Produces(MediaType.TEXT_HTML)
	public String getTitle(){
		return "<p>CalltoReST Web Service</p>";
	}
}
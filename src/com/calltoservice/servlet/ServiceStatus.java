package com.calltoservice.servlet;

import java.sql.SQLException;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;

import com.calltoservice.database.ServiceDBConn;
	
@Path("/status")
public class ServiceStatus {

	private static final String TITLE = "Call to Service";
	private static final String VERSION = "1.0";
	
	
	@GET
	@Produces(MediaType.TEXT_HTML)
	public String getStatus(){
		try{
			ServiceDBConn.getConn();
		}catch(SQLException se){
		}
		return this.getTitle() + getVersion();
	}
	
	@Path("/title")
	@GET
	@Produces(MediaType.TEXT_HTML)
	public String getTitle(){
		return "<p>Title: " + TITLE + "</p>";
	}
	
	@Path("/version")
	@GET
	@Produces(MediaType.TEXT_HTML)
	public String getVersion(){
		return "<p>Version: " + VERSION + "</p>";
	}
}
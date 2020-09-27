package com.praveen.rest;

import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.QueryParam;

@Path("/storedb")
public class StoreDB {
	
	@GET
	@Path("/healthCheck")
	public String getMsg() {
		return "storedb is up and running.....";
	}
	
	@GET
	public String getStatus(@QueryParam("item") String item) {
		System.out.println(" Item = " + item);
		return item+ " is avilable";
	}
}

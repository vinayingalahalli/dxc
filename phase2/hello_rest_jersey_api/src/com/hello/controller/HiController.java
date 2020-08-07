package com.hello.controller;

import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;

@Path("/hi")
public class HiController {

	@GET
	public String sayHelloGet() {
		return "HI Welcome to REST API using JERSEY with HTTP GET Request";
	}
	
	@Path("/{name}")
	@GET
	public String sayHelloGet(@PathParam("name") String name) {
		return "HI "+name+" Welcome to REST API using JERSEY with HTTP GET Request";
	}
	
	@POST
	public String sayHelloPost() {
		return "HI Welcome to REST API using JERSEY with HTTP POST Request";
	}
	@PUT
	public String sayHelloPut() {
		return "HI Welcome to REST API using JERSEY with HTTP PUT Request";
	}
	@DELETE
	public String sayHelloDelete() {
		return "HI Welcome to REST API using JERSEY with HTTP DELETE Request";
	}
}

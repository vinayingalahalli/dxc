package com.hello.controller;

import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;

@Path("/")
public class HelloController {

	@GET
	public String sayHelloGet() {
		return "Hello Welcome to REST API using JERSEY with HTTP GET Request";
	}
	
	@POST
	public String sayHelloPost() {
		return "Hello Welcome to REST API using JERSEY with HTTP POST Request";
	}
	@PUT
	public String sayHelloPut() {
		return "Hello Welcome to REST API using JERSEY with HTTP PUT Request";
	}
	@DELETE
	public String sayHelloDelete() {
		return "Hello Welcome to REST API using JERSEY with HTTP DELETE Request";
	}
}

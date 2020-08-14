package com.app.rest.controller;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class HelloController {

	@GetMapping
	public String sayHelloGet() {
		return "Hello from Spring WEB MVC REST GET";
	}
	
	@PutMapping
	public String sayHelloPut() {
		return "Hello from Spring WEB MVC REST PUT";
	}
	
	@PostMapping
	public String sayHelloPost() {
		return "Hello from Spring WEB MVC REST POST";
	}
	
	@DeleteMapping
	public String sayHelloDelete() {
		return "Hello from Spring WEB MVC REST DELETE";
	}
}

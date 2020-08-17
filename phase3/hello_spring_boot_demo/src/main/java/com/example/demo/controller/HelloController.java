package com.example.demo.controller;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

	
	@GetMapping("/")
	public String sayHelloGet() {
		return "Hello and Welcome to Spring Boot RAD Tool with GET";
	}
	
	@PostMapping("/")
	public String sayHelloPost() {
		return "Hello and Welcome to Spring Boot RAD Tool with POST";
	}
	
	@PutMapping("/")
	public String sayHelloPut() {
		return "Hello and Welcome to Spring Boot RAD Tool with PUT";
	}
	
	@DeleteMapping("/")
	public String sayHelloDelete() {
		return "Hello and Welcome to Spring Boot RAD Tool with DELETE";
	}
}

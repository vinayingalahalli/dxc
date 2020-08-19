package com.msa.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloMSA1Controller {

	@GetMapping("/")
	public String sayHello() {
		return "Hello from Microservice-1 App";
	}
}

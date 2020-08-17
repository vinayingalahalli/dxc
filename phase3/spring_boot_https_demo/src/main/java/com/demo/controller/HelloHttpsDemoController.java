package com.demo.controller;

import java.util.Date;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloHttpsDemoController {

	
	@GetMapping("/secured")
	public String testHttps() {
		System.out.println("Inside testHttps");
		return "Hello USER via HTTPS at time : "+new Date();
	}
}

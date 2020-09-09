package com.avenger.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.avenger.model.Avenger;
import com.avenger.service.AvengerService;

@RestController
public class AvengersSearchController {

	@Autowired
	private AvengerService service;
	
	@GetMapping("/avengers")
	public List<Avenger> getAllAvengers() {
		
		return service.getAllAvengers();
	}

	@GetMapping("/avengers/age/{age}")
	public List<Avenger> getAvengersByAge(@PathVariable int age) {
		
		return service.getAvengersByAge(age);
	}

	
	public List<Avenger> getAvengersBySpeciality(String speciality) {
		// TODO Auto-generated method stub
		return null;
	}

	
	public List<Avenger> getAvengersByName(String name) {
		// TODO Auto-generated method stub
		return null;
	}
}

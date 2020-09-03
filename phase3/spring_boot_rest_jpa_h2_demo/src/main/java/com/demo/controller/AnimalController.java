package com.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.demo.exception.BusinessException;
import com.demo.model.Animal;
import com.demo.service.AnimalService;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
public class AnimalController {

	@Autowired
	private AnimalService service;
	
	private MultiValueMap<String, String> map;

	@PostMapping("/animal")
	public Animal addAnimal(@RequestBody Animal animal) {

		return service.addAnimal(animal);
	}

	@PutMapping("/animal")
	public Animal updateAnimal(@RequestBody Animal animal) {

		return service.updateAnimal(animal);
	}

	@GetMapping("/animal/{id}")
	public ResponseEntity<Animal> getAnimalById(@PathVariable int id) {

		try {
			return new ResponseEntity<>(service.getAnimalById(id),HttpStatus.OK);
		} catch (BusinessException e) {
			map=new LinkedMultiValueMap<>();
			map.add("errorMessage", e.getMessage());
			return new ResponseEntity<>(null,map, HttpStatus.NOT_FOUND);
		}
	}

	@DeleteMapping("/animal/{id}")
	public void deleteAnimalById(@PathVariable int id) {
		service.deleteAnimalById(id);

	}

	@GetMapping("/animals")
	public List<Animal> getAllAnimals() {

		return service.getAllAnimals();
	}

	@GetMapping("/animals/age/{age}")
	public List<Animal> getAllAnimalsByAge(@PathVariable int age) {
		
		return service.getAllAnimalsByAge(age);
	}

	public List<Animal> getAllAnimalsByCategory(String category) {
		// TODO Auto-generated method stub
		return null;
	}
}

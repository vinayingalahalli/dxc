package com.animal.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.animal.model.Animal;
import com.animal.service.AnimalService;

@RestController
public class AnimalController {

	@Autowired
	private AnimalService service;

	@PostMapping("/animal")
	public Animal addAnimal(@RequestBody Animal animal) {

		return service.addAnimal(animal);
	}

	@PutMapping("/animal")
	public Animal updateAnimal(@RequestBody Animal animal) {

		return service.updateAnimal(animal);
	}

	@GetMapping("/animal/{id}")
	public Animal getAnimalById(@PathVariable int id) {

		return service.getAnimalById(id);
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

package com.demo.service;

import java.util.List;

import com.demo.exception.BusinessException;
import com.demo.model.Animal;

public interface AnimalService {

	public Animal addAnimal(Animal animal);
	public Animal updateAnimal(Animal animal);
	public Animal getAnimalById(int id) throws BusinessException;
	public void deleteAnimalById(int id);
	public List<Animal> getAllAnimals();
	public List<Animal> getAllAnimalsByAge(int age);
	public List<Animal> getAllAnimalsByCategory(String category);
}

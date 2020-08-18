package com.demo.service.impl;

import java.util.List;
import java.util.NoSuchElementException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.dao.AnimalRepository;
import com.demo.exception.BusinessException;
import com.demo.model.Animal;
import com.demo.service.AnimalService;

@Service
public class AnimalServiceImpl implements AnimalService {

	@Autowired
	private AnimalRepository dao;

	@Override
	public Animal addAnimal(Animal animal) {

		return dao.save(animal);
	}

	@Override
	public Animal updateAnimal(Animal animal) {

		return dao.save(animal);
	}

	@Override
	public Animal getAnimalById(int id)  throws BusinessException{
		if(id<=0) {
			throw new BusinessException("Entered id "+id+" is invalid");
		}
		Animal animal=null;
		try {
			animal=dao.findById(id).get();
		}catch(NoSuchElementException e) {
			throw new BusinessException("No animal found for the id "+id);
		}
		
		return animal;
	}

	@Override
	public void deleteAnimalById(int id) {
		dao.deleteById(id);

	}

	@Override
	public List<Animal> getAllAnimals() {
		
		return dao.findAll();
	}

	@Override
	public List<Animal> getAllAnimalsByAge(int age) {
		
		return dao.findByAge(age);
	}

	@Override
	public List<Animal> getAllAnimalsByCategory(String category) {
		// TODO Auto-generated method stub
		return null;
	}

}

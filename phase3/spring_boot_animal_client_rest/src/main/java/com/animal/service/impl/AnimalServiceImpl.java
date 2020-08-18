package com.animal.service.impl;

import java.util.List;

import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.animal.model.Animal;
import com.animal.service.AnimalService;

@Service
public class AnimalServiceImpl implements AnimalService {

	private String url="http://localhost:9200/animal/";
	private String getAllUrl="http://localhost:9200/animals/";
	private RestTemplate restTemplate=new RestTemplate();
	
	@Override
	public Animal addAnimal(Animal animal) {
		
		return restTemplate.postForObject(url, animal, Animal.class);
	}

	@Override
	public Animal updateAnimal(Animal animal) {
		restTemplate.put(url, animal);
		return animal;
	}

	@Override
	public Animal getAnimalById(int id) {
		ResponseEntity<Animal> entity=restTemplate.exchange(url+id, HttpMethod.GET,null,Animal.class);
		return entity.getBody();
	}

	@Override
	public void deleteAnimalById(int id) {
		restTemplate.delete(url+id);
		
	}

	@Override
	public List<Animal> getAllAnimals() {
		ResponseEntity<List<Animal>> entity=restTemplate.exchange(getAllUrl,
				HttpMethod.GET,
				null,
				new ParameterizedTypeReference <List<Animal>>() {
				});
		return entity.getBody();
	}

	@Override
	public List<Animal> getAllAnimalsByAge(int age) {
		ResponseEntity<List<Animal>> entity=restTemplate.exchange(getAllUrl+"age/"+age,
				HttpMethod.GET,
				null,
				new ParameterizedTypeReference <List<Animal>>() {
				});
		return entity.getBody();
	}

	@Override
	public List<Animal> getAllAnimalsByCategory(String category) {
		// TODO Auto-generated method stub
		return null;
	}

}

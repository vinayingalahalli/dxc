package com.demo.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.demo.model.Animal;

@Repository
public interface AnimalRepository extends JpaRepository<Animal, Integer> {

	public List<Animal> findByAge(int age);
}

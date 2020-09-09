package com.avenger.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.avenger.model.Avenger;

@Repository
public interface AvengerRepository extends JpaRepository<Avenger, Integer>{

	public List<Avenger> findByAge(int age);
}

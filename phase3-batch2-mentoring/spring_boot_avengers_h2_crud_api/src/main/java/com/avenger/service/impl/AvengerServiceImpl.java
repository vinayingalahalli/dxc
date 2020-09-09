package com.avenger.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.avenger.dao.AvengerRepository;
import com.avenger.model.Avenger;
import com.avenger.service.AvengerService;

@Service
public class AvengerServiceImpl implements AvengerService{

	@Autowired
	private AvengerRepository dao;

	@Override
	public Avenger addAvenger(Avenger avenger) {
		
		return dao.save(avenger);
	}

	@Override
	public Avenger updateAvenger(Avenger avenger) {
		
		return dao.save(avenger);
	}

	@Override
	public Avenger getAvengerById(int id) {
		
		return dao.findById(id).get();
	}

	@Override
	public void deleteAvengerById(int id) {
		dao.deleteById(id);
		
	}

	@Override
	public List<Avenger> getAllAvengers() {
		
		return dao.findAll();
	}

	@Override
	public List<Avenger> getAvengersByAge(int age) {
		
		return dao.findByAge(age);
	}

	@Override
	public List<Avenger> getAvengersBySpeciality(String speciality) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Avenger> getAvengersByName(String name) {
		// TODO Auto-generated method stub
		return null;
	}

}

package com.soap.service.impl;

import javax.jws.WebService;

import com.soap.service.CalculatorService;

@WebService(endpointInterface = "com.soap.service.CalculatorService")
public class CalculatorServiceImpl implements CalculatorService {

	@Override
	public String sayHello() {
		
		return "Helllloo Welcome to SOAP services using JAX-WS with RPC binding style";
	}

	@Override
	public String sayHelloByName(String name) {
	
		return "Helllloo "+name+" Welcome to SOAP services using JAX-WS with RPC binding style";
	}

	@Override
	public int add(int a, int b) {
		// TODO Auto-generated method stub
		return a+b;
	}

	@Override
	public int multiply(int a, int b) {
		// TODO Auto-generated method stub
		return a*b; 
	}

}

package com.demo.service.impl.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import com.demo.service.ValidationService;
import com.demo.service.impl.ValidationServiceImpl;

class ValidationServiceImplTest {

	private static ValidationService service;
	@BeforeAll
	public static void createService() {
		service=new ValidationServiceImpl();
	}
	
	@Test
	void testIsValidPanTrue() {
		Assertions.assertEquals(true, service.isValidPan("ABCDE1234A"));
	}
	@Test
	void testIsValidPanFalse() {
		//Assertions.assertEquals(false, service.isValidPan("ABCDE1234a"));
		Assertions.assertFalse(service.isValidPan("sdsdfdsffs"));
	}

	@Test
	void testIsValidPanEmpty() {
		Assertions.assertEquals(false, service.isValidPan(""));
	}
	
	@Test
	void testIsValidPanNull() {
		Assertions.assertEquals(false, service.isValidPan(null));
	}
	
	@Test
	void testIsVaidPrimeNumberTrue() {
		//fail("Not yet implemented");
		Assertions.assertTrue(service.isVaidPrimeNumber(3));
	}
	
	@Test
	void testIsVaidPrimeNumberFalse() {
		//fail("Not yet implemented");
		Assertions.assertFalse(service.isVaidPrimeNumber(4));
	}
	
	@Test
	void testIsVaidPrimeNumberNegativeCheck() {
		//fail("Not yet implemented");
		Assertions.assertFalse(service.isVaidPrimeNumber(-3));
	}

}

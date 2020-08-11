package com.junit.test;

import org.junit.Assert;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.junit.Hello;

public class HelloTest {
private static Hello hello;
	@BeforeAll
	public static void beforeAll() {
		hello=new Hello();
		System.out.println("I will be executed first and once only before any test case in this class");
	}
	
	@BeforeEach
	public void testBefore() {
		System.out.println("I will be executed before every test case in this class");
	}
	
//	@Test
//	public void testHello1() {
//		System.out.println("Hello from Junit Test 1");
//	}
//	
//	@Test
//	public void testHello2() {
//		System.out.println("Hello from Junit Test 2");
//	}

	
	@Test
	public void testSayHello() {
		Assert.assertEquals("Hello Junit5", hello.sayHello());
	}
	
	@Test
	public void testSayHelloByName() {
		Assert.assertEquals("Hello VINAY", hello.sayHello("Vinay"));
	}
	
	@AfterEach
	public void testAfter() {
		System.out.println("I will be executed after every test case in this class");
	}
	
	@AfterAll
	public static void afterAll() {
		System.out.println("I will be executed only one time at the end of all test cases in the class");
	}
}

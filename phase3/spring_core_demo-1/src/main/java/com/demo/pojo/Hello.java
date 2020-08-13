package com.demo.pojo;

public class Hello {

	private String message;

	public Hello() {
		System.out.println("DEFAULT constructor called");
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
		System.out.println("SETTER Called");
	}

	public Hello(String message) {
		this.message = message;
		System.out.println("PARAM constructor called");
	}
	
	public void myInit() {
		System.out.println("Overrided init() method bean is going through init()");
	}
	
	
	public void myDestroy() {
		System.out.println("Overrided destroy() method bean is going to destroy()");
	}
}

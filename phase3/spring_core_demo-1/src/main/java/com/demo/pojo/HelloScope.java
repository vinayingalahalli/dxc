package com.demo.pojo;

public class HelloScope {

	private String message;
	public HelloScope() {
		System.out.println("DEFAULT constructor called");
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
		System.out.println("SETTER Called and with message "+message);
	}

	public HelloScope(String message) {
		this.message = message;
		System.out.println("PARAM constructor called");
	}
}

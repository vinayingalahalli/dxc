package com.app.rest.model;

public class Message {

	private int id;
	private String message;
	private String sentBy;
	
	public Message() {
		// TODO Auto-generated constructor stub
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getSentBy() {
		return sentBy;
	}

	public void setSentBy(String sentBy) {
		this.sentBy = sentBy;
	}
	
}

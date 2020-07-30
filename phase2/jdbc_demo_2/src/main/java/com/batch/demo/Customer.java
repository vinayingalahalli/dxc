package com.batch.demo;

public class Customer {

	private int id;
	private String name;
	private String city;
	private String gender;
	private int age;
	private long contact;
	
	public Customer() {
		// TODO Auto-generated constructor stub
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public long getContact() {
		return contact;
	}

	public void setContact(long contact) {
		this.contact = contact;
	}

	@Override
	public String toString() {
		return "Customer [id=" + id + ", name=" + name + ", city=" + city + ", gender=" + gender + ", age=" + age
				+ ", contact=" + contact + "]";
	}

	public Customer(int id, String name, String city, String gender, int age, long contact) {
		super();
		this.id = id;
		this.name = name;
		this.city = city;
		this.gender = gender;
		this.age = age;
		this.contact = contact;
	}
	
}

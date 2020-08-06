package com.demo.model;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table
public class Employee {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private String name;
	@OneToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "aid")
	private Addresss addresss;
	
	public Employee() {
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

	public Addresss getAddresss() {
		return addresss;
	}

	public void setAddresss(Addresss addresss) {
		this.addresss = addresss;
	}

	public Employee(String name, Addresss addresss) {
		super();
		this.name = name;
		this.addresss = addresss;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", addresss=" + addresss + "]";
	}
	
	
}

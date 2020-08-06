package com.demo.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class Addresss {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int aid;
	private String streetname;
	private String city;
	private int zip;
	
	public Addresss() {
		// TODO Auto-generated constructor stub
	}

	public int getAid() {
		return aid;
	}

	public void setAid(int aid) {
		this.aid = aid;
	}

	public String getStreetname() {
		return streetname;
	}

	public void setStreetname(String streetname) {
		this.streetname = streetname;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public int getZip() {
		return zip;
	}

	public void setZip(int zip) {
		this.zip = zip;
	}

	public Addresss(String streetname, String city, int zip) {
		super();
		this.streetname = streetname;
		this.city = city;
		this.zip = zip;
	}

	@Override
	public String toString() {
		return "Addresss [aid=" + aid + ", streetname=" + streetname + ", city=" + city + ", zip=" + zip + "]";
	}
	
	
}

package com.model;

public class User {

	private int id;
	private String fname;
	private String lname;
	private long contact;
	private String email;
	private String qualification;
	private int yoq;
	private String previousOrganization;
	private String designation;
	private int yearsofexp;
	public User() {
		// TODO Auto-generated constructor stub
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	public String getLname() {
		return lname;
	}
	public void setLname(String lname) {
		this.lname = lname;
	}
	public long getContact() {
		return contact;
	}
	public void setContact(long contact) {
		this.contact = contact;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getQualification() {
		return qualification;
	}
	public void setQualification(String qualification) {
		this.qualification = qualification;
	}
	public int getYoq() {
		return yoq;
	}
	public void setYoq(int yoq) {
		this.yoq = yoq;
	}
	public String getPreviousOrganization() {
		return previousOrganization;
	}
	public void setPreviousOrganization(String previousOrganization) {
		this.previousOrganization = previousOrganization;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	public int getYearsofexp() {
		return yearsofexp;
	}
	public void setYearsofexp(int yearsofexp) {
		this.yearsofexp = yearsofexp;
	}
	@Override
	public String toString() {
		return "User [id=" + fname.hashCode()+ ", fname=" + fname + ", lname=" + lname + ", contact=" + contact + ", email=" + email
				+ ", qualification=" + qualification + ", yoq=" + yoq + ", previousOrganization=" + previousOrganization
				+ ", designation=" + designation + ", yearsofexp=" + yearsofexp + "]";
	}
	
}

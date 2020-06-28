package com.visitha.model;

public class Customer {

	private String firstname;
	private String lastname;
	
	public Customer() {
		System.out.println("in the model class");
	}

	public String getFirstname() {
		return firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

}

package com.nc.parser1;

public class Employee {

	String id;
	private String firstName;
	String lastName;
	String location;

	@Override
	public String toString() {
		return firstName + " " + lastName + "(" + id + ")" + location;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {

		this.firstName = firstName;
	}
}

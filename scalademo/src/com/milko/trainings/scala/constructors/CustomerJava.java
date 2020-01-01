package com.milko.trainings.scala.constructors;

public class CustomerJava {
	private final String fullname;
	
	public CustomerJava(String forename, String initial, String surname) {
		if (initial != null && !initial.isEmpty()) {
			this.fullname = String.format("%s %s %s", forename, initial, surname);
		} else {
			this.fullname = String.format("%s %s", forename, surname);
		}
	}
	
	public CustomerJava(String forename, String surname) {
		this(forename, "", surname);
	}
}

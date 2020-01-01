package com.milko.trainings.scala.statics;

public class CustomerJava {
	private static Integer sequenceOfIds;
	
	private final String name;
	private final String address;
	
	private Integer id;
	
	private CustomerJava(String name, String address) {
		this.name = name;
		this.address = address;
		this.id = CustomerJava.nextId();
	}

	public static CustomerJava createCustomer(String name, String address) {
		return new CustomerJava(name, address);
	}
	private static Integer nextId() {
		return sequenceOfIds++;
	}
}

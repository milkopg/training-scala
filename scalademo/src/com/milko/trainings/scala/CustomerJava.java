package com.milko.trainings.scala;

public class CustomerJava {
	private String name;
	private String address;
	private Long id;
	
	public CustomerJava(String name, String address) {
		this.name = name;
		this.address = address;
	}
	
	public void setId(Long id) {
		if (id == null)
			this.id = id;
	}
	
	@Override
	public String toString() {
		return "Customer name: " + name + " , address: "  + address + " , id:" + id;
	}
}

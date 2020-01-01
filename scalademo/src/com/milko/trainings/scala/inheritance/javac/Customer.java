package com.milko.trainings.scala.inheritance.javac;

import com.milko.trainings.scala.interfaces.javac.Customers;

public class Customer implements Comparable<Customer> {
	private Double total = 0.0;
	private final String name;
	private final String address;
	private final ShoppingBasketJava basket= new ShoppingBasketJava();
	
	public static Customer create(String name, String address, Integer years) {
		Customer customer = null;
		if (years > 2) {
			customer = new DiscountedCustomer(name, address);
		} else {
			customer = new Customer(name ,address);
		}
		return customer;
	}
	
	public Customer(String name, String address) {
		this.name = name;
		this.address = address;
	}
	
	public void add(Item item) {
		basket.add(item);
		total += item.price();
	}
	
	public Double total() {
		return basket.value();
	}

	@Override
	public int compareTo(Customer o) {
		// TODO Auto-generated method stub
		return name.compareTo(o.name);
	}
	
	public static void main(String[] args) {
		Customers customers = new Customers();
		customers.add(new Customer("Milko Galev", "Address 1"));
		customers.add(new Customer("Nora Galeva", "Address 2"));
		customers.add(new Customer("Pavel Galev", "Address 3"));
		customers.add(new DiscountedCustomer("Nataliya Galev", "Address 4"));
		
		System.out.println(customers.sort());
		
	}
}

package com.milko.trainings.scala.interfaces.javac;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

import com.milko.trainings.scala.inheritance.javac.Customer;



public class Customers implements Sortable<Customer> {
	
	private final Set<Customer> customers = new HashSet();
	
	public void add(Customer cusmomer) {
		customers.add(cusmomer);
	}

	@Override
	public Iterator<Customer> iterator() {
		return customers.iterator();
	}

}


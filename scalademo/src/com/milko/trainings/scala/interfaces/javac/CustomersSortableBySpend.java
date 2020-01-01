package com.milko.trainings.scala.interfaces.javac;

import java.util.ArrayList;
import java.util.List;

import com.milko.trainings.scala.inheritance.javac.Customer;

public class CustomersSortableBySpend extends Customers {
	@Override
	public List<Customer> sort() {
		List<Customer> customers = new ArrayList<Customer>();
		for (Customer customer: this) {
			customers.add(customer);
		}
		customers.sort((first, second) -> second.total().compareTo(first.total()));
		return customers;
	}
}

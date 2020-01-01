package com.milko.trainings.scala.inheritance.javac;

public class DiscountedCustomer extends Customer {

	public DiscountedCustomer(String name, String address) {
		super(name, address);
	}

	@Override
	public Double total() {
		// TODO Auto-generated method stub
		return super.total() * 0.9;
	}
	
	public static void main(String[] args) {
		Customer joe = new DiscountedCustomer("Joe", "128 Bullpen street");
		joe.add(new Item() {
			
			@Override
			public Double price() {
				// TODO Auto-generated method stub
				return 2.5;
			}
		});
		
		joe.add(new Item() {
			
			@Override
			public Double price() {
				// TODO Auto-generated method stub
				return 3.5;
			}
		});
		
		System.out.println("Joes's basked total is: " + joe.total());
	}
}

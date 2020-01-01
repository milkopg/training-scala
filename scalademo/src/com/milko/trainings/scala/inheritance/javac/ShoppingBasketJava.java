package com.milko.trainings.scala.inheritance.javac;

public class ShoppingBasketJava {
	
	private Double total = 0.0;

	private Item item;
	
	public void add(Item item) {
		this.item = item;
		total += item.price();
	}
	
	public double getTotal() {
		return total;
	}

	public Double value() {
		// TODO Auto-generated method stub
		return total;
	}

}

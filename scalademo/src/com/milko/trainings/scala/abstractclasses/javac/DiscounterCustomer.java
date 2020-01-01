package com.milko.trainings.scala.abstractclasses.javac;

import com.milko.trainings.scala.inheritance.javac.ShoppingBasketJava;

public class DiscounterCustomer extends AbstractCustomer {

	private final ShoppingBasketJava basket = new ShoppingBasketJava();
	
	@Override
	public Double total() {
		// TODO Auto-generated method stub
		return basket.value() * 0.9;
	}

}

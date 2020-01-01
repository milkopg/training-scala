package com.milko.trainings.scala.inheritance.scalac

import com.milko.trainings.scala.inheritance.javac.DiscountedCustomer

class Customer(val name: String, val address: String) extends Ordered[Customer] {
  private final val basket: ShoppingBasket = new ShoppingBasket
  
   def add(item: Item) {
     basket.add(item);
   } 
  
  def total: Double = {
    basket.value;
  }
  
  def create(name: String, address: String , yearsAsCustomer: Integer) {
    val customer = if (yearsAsCustomer > 2) 
      new DiscountedCustomer(name, address)
    else new Customer(name, address);
    customer;
  }
  

  def compare(that: Customer): Int = {
    name.compare(that.name);
  }
  
  override def toString: String = {
    name+ " $ " + total
  }
  
}

class DiscountedCustome(name: String, address: String) 
extends Customer(name, address) {
  override def total: Double = {
    super.total* 0.9
  }
}
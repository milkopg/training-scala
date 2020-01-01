package com.milko.trainings.scala.interfaces.scalac

import com.milko.trainings.scala.inheritance.scalac.Customer
import scala.collection.mutable.HashSet
import com.milko.trainings.scala.inheritance.scalac.DiscountedCustome

class Customers extends Sortable[Customer] {
  
  private val customers = scala.collection.mutable.Set[Customer]();
  
  def add(customer: Customer) = customers.add(customer);
  
  def iterator: Iterator[Customer] = customers.iterator;
}

object Customers {
  def main(args: Array[String]): Unit = {
    val customers = new Customers();
    customers.add(new Customer("Milko Galev", "Address 1"));
    customers.add(new Customer("Nora Galeva", "Address 2"));
    customers.add(new Customer("Pavel Galev", "Address 3"));
    customers.add(new Customer("Nataliya Galeva", "Address 4"));
    customers.add(new DiscountedCustome("Petar Galev", "Address 5"));
    
    println(customers.sort)
  }
}
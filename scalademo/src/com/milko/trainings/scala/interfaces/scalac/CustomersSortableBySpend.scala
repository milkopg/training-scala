package com.milko.trainings.scala.interfaces.scalac

import com.milko.trainings.scala.inheritance.javac.DiscountedCustomer
import com.milko.trainings.scala.inheritance.scalac.Customer
import com.milko.trainings.scala.interfaces.scalac.PricedItem

class CustomersSortableBySpend extends Customers {
  override def sort: List[Customer] =  {
    this.toList.sorted(new Ordering[Customer] {
      def compare(a: Customer, b: Customer) = b.total.compare(a.total)
    }) 
  }
  
//  implicit def OrderingToFunction[A] (function: (A, A) => Int) : Ordering[A] = {
//    new Ordering[A] {
//      def compare (a: A, b: A) = funtion.apply (a, b)
//    }
//  }

}

object CustomersSortableBySpend {
  def main(args: Array[String]): Unit = {
    val customers = new CustomersSortableBySpend();
    
    val fred = new Customer("Fred Jones", "Address 1");
    val velma = new Customer("Velma Dinkley", "Address 2");
    val daphne = new Customer("Daphne Blake", "Address 3");
    val norville = new DiscountedCustomer("Norville", "Address 4");
    
    daphne.add(new PricedItem(2.4));
    daphne.add(new PricedItem(1.4));
    
    fred.add(new PricedItem(2.75));
    fred.add(new PricedItem(2.75));
    
//    norville.add(new PricedItem(6.99));
  //  norville.add(new PricedItem(1.5));
    
    customers.add(fred);
    customers.add(velma);
    customers.add(daphne);
    //customers.add(norville)
    
    println(customers.sort)
    
    
  }
}
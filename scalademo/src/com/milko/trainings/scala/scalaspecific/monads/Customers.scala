package com.milko.trainings.scala.scalaspecific.monads

import com.milko.trainings.scala.inheritance.scalac.Customer

trait Customers extends Iterable[Customer] {
   def add (customer:Customer)
   def find(name: String): Option[Customer]
}

class CustomerSet extends Customers {

  val customers = collection.mutable.Set[Customer]()

  def add(customer: Customer): Unit = {
    ???
  }

  def find(name: String): Option[Customer] = {
    for (customer <- customers) {
      if (customer.name == name)
        return Some(customer)
    }
    None
  }
  
  def findNull(name: String): Customer = {
    for (customer <- customers) {
      if (customer.name == name)
        return customer
    }
    null
  }

  def iterator: Iterator[Customer] = customers.iterator
}

object CustomerSet {
  def main(args: Array[String]): Unit = {
    val customers = new CustomerSet();
    //safety check
    val basketValue: Option[Double] = customers.find("Albert").map(customer=> customer.total)
    println(basketValue);
   
    //throw NullPointer
    //val basetValueNull: Double = customers.findNull("Albert").total
    
  //  val x: Double = basketValue.get; //could throw an Exception
   // println("x" + x)
    
    val y: Double = customers.find("Missing")  match {
      case Some(customer) => customer.total //avoids exception
      case None => 0.0
    }
    println("y: " + y)
   
    val usCustomers = Set("Albert", "Betriz", "Carrol", "Dave");
    val usCust = usCustomers.map(customers.find(_).map(_.total)).flatten.sum;
    println("usCust:" + usCust);
    
    println(usCustomers.flatMap(name => customers.find(name)).map(_.total).sum);
  }
}
package com.milko.trainings.scala.scalaspecific.unapply

class Customer(val name: String, val address: String)

object Customer {
  def unapply(customer: Customer): Option[(String, String)] = Some((customer.name), (customer.address));
  
  def main(args: Array[String]): Unit = {
    val customer = new Customer("Bob", "1 Church street");
    
    customer match {
      case Customer(name, address) => println(name + " " + address);
      
    }
    
  }
}
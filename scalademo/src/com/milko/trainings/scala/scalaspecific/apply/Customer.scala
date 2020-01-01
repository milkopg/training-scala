package com.milko.trainings.scala.scalaspecific.apply

class Customer(name: String, address: String) {
  override def toString():String = {
    name + " " +  address
  }
}

object Customer {
  
  def apply (name: String, address: String) = new Customer(name, address);
  def apply (name: String) = new Customer(name, "No known address");
  
  def main(args: Array[String]): Unit = {
    println(Customer.apply("Nora Galeva", "Plovdiv 4000"));
    println(Customer("Rob Randal" , "14 The Arches"));
    println(Customer.apply("Milko Galev"))
  }
}
package com.milko.trainings.scala.statics

class CustomerScala private(val name: String , val address: String) {
  private val id = CustomerScala.nextId();
}

object CustomerScala {
   def apply(name: String, address: String) {
     new CustomerScala(name, address)
   } 
  
  private var sequenceOfIds = 0;
  
  private def nextId()= {
    sequenceOfIds+=1;
    sequenceOfIds
  }
  
  def main(args: Array[String]): Unit = {
   var c = CustomerScala.apply("Bob Fossil", "1 London Road")
   println(c)
   println(new CustomerScala("Bob Fossil", "1 London Road"))
  }
}
package com.milko.trainings.scala.constructors


class CustomerScala (forename: String, initial: String = "", surname: String){
  val fullname = if (initial != null && !initial.isEmpty())
    forename + " " + initial + ". " + surname;
  else
    forename + " " + surname
//  def this (forename: String, surname: String) {
  //  this(forename, "", surname);
 // }
}

object CustomerScala {
   def main(args: Array[String]) {
   val c1 =  new CustomerScala("Bob", "J", "Smith")
   println(c1)
   
   val c2 = new CustomerScala("Bob", surname = "Smith");
   print(c2)
  }
}


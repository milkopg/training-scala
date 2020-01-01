package com.milko.trainings.scala.scalaspecific.apply

object ArrayExample {
  val numerals = Array("I", "II", "III", "IV", "V", "VI", "VII");
  
  numerals(2) = "TWO";
  numerals.update(3, "Three");
  
  def main(args: Array[String]): Unit = {
    for (i <-0 to numerals.length-1) {
      println(i + " = " + numerals.apply(i));
    }
  }
}
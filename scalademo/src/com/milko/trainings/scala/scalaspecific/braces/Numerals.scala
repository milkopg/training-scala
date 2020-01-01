package com.milko.trainings.scala.scalaspecific.braces

object Numerals {
  def main(args: Array[String]): Unit = {
    val numerals = List("I", "II", "III", "IV", "V");
    
    numerals.foreach(print(_));
    println()
    numerals.foreach{
      print(_)
     };
  }
}
package com.milko.trainings.scala.scalaspecific.curryfunctions

object Add {
  def add (x: Int, y: Int): Int= x+y
   
  def add2 (x: Int) (y: Int): Int = x+y
  
  def main(args: Array[String]): Unit = {
   println( add(1,2))
   println(add2(1)(2));
   
   
   //2 functions as val
   val f= add2(1) _;
   println(f(2))
  }
}
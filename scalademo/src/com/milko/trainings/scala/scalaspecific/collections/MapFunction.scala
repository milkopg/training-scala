package com.milko.trainings.scala.scalaspecific.collections

import java.util.Calendar

object MapFunction {
  def age(birthYear: Int) = {
    Calendar.getInstance.get(Calendar.YEAR) - birthYear;
  }
  
  def main(args: Array[String]): Unit = {
    val birthdays = List(1982, 1985, 2013, 2019);
    
    println(birthdays.map(age));
    
    val inline = birthdays.map(year => Calendar.getInstance.get(Calendar.YEAR) - year);
    println("inline: " + inline);
    
    val wildcard = birthdays.map(Calendar.getInstance.get(Calendar.YEAR) - _);
    println("wildcard: "+ wildcard);
    
  }
}
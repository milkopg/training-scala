package com.milko.trainings.scala.scalaspecific.collections

import java.util.Calendar

object FlatMap {
  
  def ages (birthYear: Int): List[Int] = {
    val today = Calendar.getInstance.get(Calendar.YEAR)
    List(today - 1 - birthYear, today - birthYear, today + 1 - birthYear)
  }
  
  def main(args: Array[String]): Unit = {
     val birthdays = List(1982, 1985, 2013, 2019);
     
     println(birthdays.map(ages))
     println(birthdays.flatMap(ages));
  }
}
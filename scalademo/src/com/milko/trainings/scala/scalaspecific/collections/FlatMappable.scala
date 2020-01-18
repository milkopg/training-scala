package com.milko.trainings.scala.scalaspecific.collections

class FlatMappable[A](elements: A*) {
  def flatMap[B] (f:A =>List[B]): List[B] = {
    val result = collection.mutable.MutableList[B]() 
    elements.foreach{
     f.apply(_).foreach{
       result += _
     }
    }
    result.toList
  }
}

object FlatMappable {
  def oddNumbers(end: Int): List[Int]= {
    val odds = collection.mutable.MutableList[Int]();
    for (i <- 0 to end) {
      if (i % 2 != 0) odds +=i
    }
    odds.toList
  }
  
  def main(args: Array[String]): Unit = {
   val mappable = new FlatMappable(1, 2, 10);
   val result = mappable.flatMap(oddNumbers)
   println(result)
  }
}
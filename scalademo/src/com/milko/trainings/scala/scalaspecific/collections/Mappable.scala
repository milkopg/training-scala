package com.milko.trainings.scala.scalaspecific.collections

class Mappable[A](elements: A*) {
  def map[B] (f:A =>B): List[B] = {
    val result = collection.mutable.MutableList[B]() 
    elements.foreach{
      result+= f.apply(_)
    }
    result.toList
  }
}

object Mappable {
  def main(args: Array[String]): Unit = {
    val numbers = List(1, 2, 54, 4)
    val mappable = new Mappable(numbers:_*)
    val result = mappable.map(_*2);
    println(result);
  }
}
package com.milko.trainings.scala.scalaspecific.monads

object Flatten {
  def main(args: Array[String]): Unit = {
    val x = List(List(1, 2) , List(3), List(4, 5));
    println(x.flatten);
    
    val y = List(Some("A"), None,Some("B"));
    println(y.flatten);
  }
}
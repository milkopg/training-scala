package com.milko.trainings.scala.lowerbounds.scalac

class LowerBounds {
  def addNumbers(numbers: List[_ >: Int]) {
    for (i <-0 to 99) {
      //....
    }
  }
}
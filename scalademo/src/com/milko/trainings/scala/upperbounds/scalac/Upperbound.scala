package com.milko.trainings.scala.upperbounds.scalac

object Upperbound {
  def printAnimals(animals: List[_ <: Animal]) {
    for (animal <- animals) {
      println(animal);
    }
  }
}
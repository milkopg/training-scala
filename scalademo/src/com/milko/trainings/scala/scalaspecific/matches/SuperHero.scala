package com.milko.trainings.scala.scalaspecific.matches

class Person(val name: String)

case class SuperHero2 (heroName: String, alterEgo: String, powers: List[String]) extends Person(alterEgo) {
  
}

object SuperHero2 {
  def main(args: Array[String]): Unit = {
    val hero = new Person("Joe Public");
    
    hero match {
      case SuperHero2(_, "Bruce Wayne", _) => println("I'm a Batman");
      case SuperHero2(_, _,_ ) => println("???") ;
      case _ => println("I'm a civilian, don't shoot"); //without wildcard there is an expection
    }
  }
}
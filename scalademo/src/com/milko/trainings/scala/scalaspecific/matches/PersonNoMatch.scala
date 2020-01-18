package com.milko.trainings.scala.scalaspecific.matches


case class SuperHero (heroName: String, alterEgo: String, powers: List[String]) {
  
}

object SuperHero {
  def main(args: Array[String]): Unit = {
    val hero = new SuperHero("Batman", "Bruce Wayne" , List("Intellect", "Speed", "Agility", "Power"));
    
    hero match {
      case SuperHero(_, "Bruce Wayne", _) => println("I'm a Batman");
      case SuperHero(_, _,_ ) => println("???") ;
    }
  }
}
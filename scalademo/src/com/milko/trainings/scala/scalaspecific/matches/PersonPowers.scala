package com.milko.trainings.scala.scalaspecific.matches

class Person3(val name: String)

case class SuperHero3 (heroName: String, alterEgo: String, powers: List[String]) extends Person3 (alterEgo){
  
}

object SuperHero3 {
  def main(args: Array[String]): Unit = {
    val batman = new SuperHero3("Batman", "Bruce Wayne" , List("Intellect", "Speed", "Agility", "Power"));
    val cap = new SuperHero3("Capitain America", "Steve Rogers", List("Tactics", "Speed", "Shield"));
    val jayne = new Person3("Jayne Doe");
    
    def nameFor(person: Person3) {
      person match {
        case hero: SuperHero3 => hero.alterEgo
        case person: Person3 => person.name
      }
    }
    
    println("Batman's Alter ego is: " + nameFor(batman));
    println("Captain America's Alter ego is: " + nameFor(cap));
    println("Jayne's Alter ego is: " + nameFor(jayne));
    
    
    
 
  }
}
package com.milko.trainings.scala.scalaspecific.apply

class Directory {
  private val numbers = scala.collection.mutable.Map(
    "Athos" -> "8347 23432",
    "Aramis" -> "5655 5656",
    "Porthos" -> "3243 43434",
    "D`Artagnian" -> "42343 432432"
  );
  
  def apply(name: String) = {
    numbers.get(name)
  }
  
  def update(name: String, number: String) {
    numbers.update(name , number);
    
  }
  
  def update(areaCode: Int, newAreaCode: String) {
      numbers.foreach(entry => {
        if (entry._2.startsWith(areaCode.toString()))    
          numbers(entry._1) = entry._2.replace(areaCode.toString(), newAreaCode)
      }
      
    )
  }
  
     override def  toString = numbers.toString();
}

object Directory {
  def main(args: Array[String]): Unit = {
    val yellowPages = new Directory();
    println("Athos phone number" + yellowPages("Athos"));
    
    yellowPages.update("Athos", "Unlisted");
    println("Athos phone number" + yellowPages("Athos"));
    
    yellowPages("Unlisted") = "Unlisted2";
     println("Athos phone number" + yellowPages("Unlisted2"));
     
     yellowPages(3243) = "7555";
     println(yellowPages)
  }
}
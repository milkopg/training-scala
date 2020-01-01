package com.milko.trainings.scala.loops.scalac

object Foreach {
  def main(args: Array[String]): Unit = {
    (0 to 9).foreach (i => println(i));
    println("\n\n\n")
    (0 to 9).foreach (println(_));
  }
}
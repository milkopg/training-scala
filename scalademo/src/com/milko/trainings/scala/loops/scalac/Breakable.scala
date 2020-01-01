package com.milko.trainings.scala.loops.scalac

import scala.util.control.Breaks._

object Breakable {
  def main(args: Array[String]): Unit = {
    breakable {
      for (i <-0 to 100) {
        println(i)
        
        if (i == 10) 
          break()
      }
    }
  }
}
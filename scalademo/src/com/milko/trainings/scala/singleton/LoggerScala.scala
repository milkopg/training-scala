package com.milko.trainings.scala.singleton

import java.util.logging.Level

object LoggerScala {
  def log(level: Level, string: String) {
    printf("%s %s%n", level, string);
  }
  
  def main(args: Array[String]): Unit = {
    LoggerScala.log(Level.INFO, "Scala version");
  }
}
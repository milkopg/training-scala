package com.milko.trainings.scala.exceptions.scalac

import java.net.URL
import java.io.BufferedReader
import java.io.InputStreamReader
import scala.util.control.Exception.Catch
import java.net.MalformedURLException
import java.io.IOException

object Exceptions {
  def main(args: Array[String]): Unit = {
    try {
      val url = new URL("http://baddotrobot.com");
      val reader = new BufferedReader(new InputStreamReader(url.openStream()));
      
        try {
         var line = reader.readLine();
         while (line != null) {
          line = reader.readLine();
          println(line)
          }
         }finally {
          reader.close()
        } 
      
    } catch {
      case e: MalformedURLException => println("Bad url")
      case e: IOException => println("Problem reading data: " + e.getMessage)
    } 
  
  }
  
}
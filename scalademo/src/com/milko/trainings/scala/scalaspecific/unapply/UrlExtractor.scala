package com.milko.trainings.scala.scalaspecific.unapply

import java.net.URL
import java.net.MalformedURLException

object UrlExtractor {
  def unapply (string: String) : Option[(String, String)] = {
    try {
      val url = new URL(string);
      Some((url.getProtocol), url.getHost);
    } catch {
      case _: MalformedURLException => None
    }
  }
  
  def main(args: Array[String]): Unit = {
    val url = "http://baddotrobot.com" match {
      case UrlExtractor(protocol, host) => println(protocol + " " + host);
    }
  }
}
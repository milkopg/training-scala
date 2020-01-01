package com.milko.trainings.scala.interfaces.scalac

import java.nio.CharBuffer

trait Readable {
   def read(buffer:CharBuffer): Int
}
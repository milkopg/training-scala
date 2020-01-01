package com.milko.trainings.scala.interfaces.scalac

import java.io.File
import java.nio.CharBuffer

class FileReader(file:File) extends Readable with AutoCloseable{
  override def read(buffer:CharBuffer):Int = {
    val linesRead: Int = 0;
    linesRead;
  }
  
  override def close:Unit = ???
}
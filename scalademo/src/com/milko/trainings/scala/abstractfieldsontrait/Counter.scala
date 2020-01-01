package com.milko.trainings.scala.abstractfieldsontrait

trait Counter {
  protected var count: Int;
  def increment()
}

class IncrementByOne extends Counter {
  var count: Int = 0
  
  override def increment(): Unit = {
    count+=1
  }

}

class ExponentialIncrementer(rate: Int) extends Counter {
  var count: Int = 1

  def increment(): Unit = {
    if (count == 0) count = 1 else count*= rate;
  }

}
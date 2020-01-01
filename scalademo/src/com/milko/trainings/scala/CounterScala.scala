package com.milko.trainings.scala

class CounterScala {
  private var count = 0;
  
  def increment() {
    count+=1;
  }
  
  def getCount = count;
}
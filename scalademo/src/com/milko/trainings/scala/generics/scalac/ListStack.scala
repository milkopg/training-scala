package com.milko.trainings.scala.generics.scalac

class ListStack[T] extends Stack[T] {
  
  private var elements: List[T] = List();
  
  override def pop: T = {
    if (elements.isEmpty)
      throw new IndexOutOfBoundsException()
      
    val head = elements.head;
    elements = elements.tail;
    head;
  }

  def push(t: T): Unit = {
    elements = t+:elements;
  }
}

  
  object ListStack {
   def main(args: Array[String]) : Unit = {
    val stack = new ListStack[String];
    stack.push("C");
    stack.push("B");
    stack.push("A");
    
    println(stack.pop)
    println(stack.pop)
    println(stack.pop)
    
    
    }
  }
  

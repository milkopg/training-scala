package com.milko.trainings.scala.inheritance.scalac

class ShoppingBasket {
  var total : Double =0; 
  
  def add(item: Item) = {
    total += item.price
  }

  def value = {
    total
  }
}
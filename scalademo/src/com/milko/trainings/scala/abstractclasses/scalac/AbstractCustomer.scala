package com.milko.trainings.scala.abstractclasses.scalac

import com.milko.trainings.scala.inheritance.scalac.ShoppingBasket

abstract class AbstractCustomer {
  def total: Double
}

class DiscountedCustomer extends AbstractCustomer {
  private final val basket= new ShoppingBasket;
  def total: Double = {
    basket.value * 0.9
  }
}
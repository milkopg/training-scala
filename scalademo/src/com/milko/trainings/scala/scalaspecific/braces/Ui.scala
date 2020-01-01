package com.milko.trainings.scala.scalaspecific.braces

class Ui {
  var basket =1;
  def updateUiELements() {
    runInUiTread {
      applyDiscountToBasket(basket)
      updateCustomerBasket(basket);
    }
    runInThreadGroup("customer", updateCustomerBasket(basket))
  }

  def runInUiTread (function: => Unit) = {
    new Thread() {
      override def run(): Unit = function
    }.start()
  }
  
  def runInThreadGroup(group: String, function: => Unit) {
    new Thread(new ThreadGroup(group), new Runnable() {
      def run() : Unit = function
    }).start()
  }

  
  def applyDiscountToBasket(basket: Any) = {
    ???
  }

  def updateCustomerBasket(basket: Any) = {
    ???
  }
}
package com.milko.trainings.scala.generics.scalac

trait Stack[T] {
  def push(t:T)
  def pop: T
}
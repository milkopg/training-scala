package com.milko.trainings.scala.interfaces.scalac

trait Sortable[A <: Ordered[A]] extends Iterable [A] {
   def sort: Seq[A] = {
     this.toList.sorted
   }
}
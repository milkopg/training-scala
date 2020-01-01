package com.milko.trainings.scala

class CustomerScala(val name: String, val address: String) {
 private var _id = "";
 
 def id = _id;
 def id_(value: String) {
   if (_id.isEmpty) {
     _id = value;
   }
 }
 
// override def id_(value: String) ={
//   if (id.isEmpty()) {
//     this.id = value;
//   }
// }
 
  override def toString():String = {
    "Customer name: " + name + " , address: "  + address + " , id: " + id;
  }
}

object CustomerScala {
  def main(args: Array[String]){
    val eric = new CustomerScala("Eric", "29 Aracia Road");
    eric._id = "00001";
//    eric.id_=("00001");
    println(eric);
    eric._id = "00002";
    println(eric)
  }
}


object ScalaDemo  {
  def main (args:Array[String]) {
    println("Hello "  + args.toList);
    (0 to 100).foreach(println(_));
  }
  
}
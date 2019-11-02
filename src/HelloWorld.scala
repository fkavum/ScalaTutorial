

object HelloWorld {

  // kinda constant
  val name:String = "Pat Cook"
  
  var age:Int = 22
  
  
  // String, Int, Double, Char, Boolean, Unit, Tupple
  
  val t =(1,2.7,"hi there")
  val (a,b,c) = t
  
  // 0. indexi verir
  println(t._1)
  
  def main(args: Array[String]):Unit = {
     println("Hello World")

  }
}
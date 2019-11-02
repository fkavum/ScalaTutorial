

object HelloWorld {

  // kinda constant
  val name:String = "Pat Cook"
  val value = 42
  var age:Int = 22
  
  
  // String, Int, Double, Char, Boolean, Unit, Tupple
  
  val t =(1,2.7,"hi there")
  val (a,b,c) = t
  
  // 0. indexi verir
  println(t._1)
  
  def main(args: Array[String]):Unit = {
     println("Hello World")

  }
  
  // This is an expression
  val message = name + " is " + (age+1) + " years old."
  // Yukarıdaki ile aynı sonucu verir.
  val messages2 = s"$name is ${age+1} years old."
  val str = s"The second element of t is ${t._2}."
  
  
  value.+(age)
  value + age
  
  value.min(age)
  value min age +5
  // same as because + operator has higher presidence
  value min (age +5)
  
  // *5 is for repeating  it returns true btw if we exclude *5 
  name == "Pat Cook"*5
  
}
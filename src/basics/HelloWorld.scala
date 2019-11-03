

package basics

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
     
     var i = 0
     while(i<10){
       println(i)
       i += 1
     }
     if (age < 18){
       println("No admit")
     }else{
       println("Come on in")
     }
     
      val response = if (age < 18){
       "No admit"
     }else{
       "Come on in"
     }
      
      println(if (age < 18)"No admit"else"Come on in")
      
      for (i <- 1 to 10){ // 1 and 10 included
        println(i)
      }
      
      for (i <- 1 until 10; if i%3 == 0 || i%5 == 0; j<- 'a' to 'c'){
        println(i + " " + j)
      }
      
      // To make for loop as an expression we put yield
       val stuff =  for (i <- 1 until 10; if i%3 == 0 || i%5 == 0; j<- 'a' to 'c')
       yield{
        i -> j
      }
       
        val stuff2 =  for {i <- 1 until 10
          if i%3 == 0 || i%5 == 0
          j<- 'a' to 'c'}
       yield{
        i -> j
      }
       
       println(stuff)
      
       
       val fizzbuzz = for (i <- 1 to 20) yield {
         (i%3 , i%5) match {
           case(0,0) if i<25 => "fizzbuzz"
              case(0,_) => "fizz"
                 case(_,0) => "buzz"
                    case _ => i.toString()
         }
       }
       
       val str = "123a"
       val num = try{ str.toInt
       }catch{
         // num = 0 yapıyor
         case ex:NumberFormatException => 0
       }
      
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
  
  val square = (x:Double) => x*x
  val square2:Double => Double = x => x*x
  val twice:Double => Double = _*2
  val lt: (Double,Double) => Boolean = _<_
  //def square (x:Double):Double = x*x
  
  
  
}
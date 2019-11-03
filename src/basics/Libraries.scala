package basics


import scala.io.StdIn._

object Libraries {
  
  
  def main(args: Array[String]):Unit ={
    
    println("What is your name?")
    val name = readLine()
    
    println("How old are you")
    
    val age = readInt()
    
    
  }
  
  /*
   * Arrays - List - Tabulate - Fill
   * val asd = Array(1,2,3)
   * val asd = List (1,2,3)
   * 
   * 'b' :: asd
   * 
   * //100 tane elemanı 0 ile doldur.
   * Array.fill(100)(0)
   *  Array.fill(100)(math.random)
   *  List.fill(5)(io.StdIn.readLine)
   *  
   *  Array.tabulate(10)(i=>i*i)
   *  new Array[Int](20)
   *  
   *  
   */
  
  
}
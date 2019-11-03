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
   *  1 to 10 by 2
   *  
   *  
   *  a.drop(2)
   *  a.dropRight(2)
   *  a.head
   *  a.tail
   *  a.last
   *  a.length
   *  // iki array verir ilki 3 uzunluğunda olcak şekilde
   *  a.splitAt(3)
   *  --- İlk 3 yada son 3 elemanı list olarak verir
   *  a.take(3)
   *  a.takeRight(3)
   *  // 2. idex dahil 5. index hariç yeni array
   *  a.slice(2,5)
   *  
   *  3. index dahil 3 elemanı yok eder arayada 98,99 yerleştirir
   *  a.patch(3,Array(98,99),3)
   *  
   *  // A nın içinde diff teki olmayan elemanları verir.
   *  a.diff(Array(1,2,3,4))
   *  a.intersect (array(1,2,3)) -> difin tam tersi
   *  a.distinct -> unique değerler kalır bitek.
   *  
   *  
   *  a.union
   *  a.max
   *  a.product
   *  a.sorted
   *  a.mkString
   *  a.mkString(", ")
   *  
   *  a.zip()
   *  a.zipWithIndex
   *  
   *  -----------------------------------
   *  a.foreach(println)
   *  a.map(_*2)
   *  a.map(i => i*2)
   *   // True olan ları döndürür
   *  a.filter(_<5)
   *  a.filter(_%5==0)
   *  
   *  a.count(_%2 == 0)
   *  a.exists(_<5)  --> true folse 
   *  a.forall(x<10) --> return true or false
   *  
   *  
   *  
   *  a.find(_%4 == 0 )  --> return Option[Int] = Some(8)  --> RETURN TYPE IS IMPORTANT
   *  a.partition(_<5) --> tupple return eder ikiye ayırır true false değerine göre
   *  
   *  a.reduce(_+_)  --> sum verir
   *  
   *  a.minBy(_.length)
   */
  
  
}
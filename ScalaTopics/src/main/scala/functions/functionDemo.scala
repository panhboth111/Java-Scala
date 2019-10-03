package functions

object functionDemo {
  def main(args: Array[String]): Unit = {
    println(add(10,20))
    greet()
  }
  def greet(): Unit ={
    println("Hello")
  }
  def add(a:Int,b:Int)=a+b
}
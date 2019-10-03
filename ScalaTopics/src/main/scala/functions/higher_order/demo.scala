package functions.higher_order

object demo {
  def main(args: Array[String]): Unit = {
    var result = operation(10,20,(a,b)=>a+b)
    println(result)
  }
  def operation(a:Int,b:Int,opt:(Int,Int)=>Int)= opt(a,b)
}

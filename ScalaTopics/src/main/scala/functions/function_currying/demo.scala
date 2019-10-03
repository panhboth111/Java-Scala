package functions.function_currying

object demo {
  def main(args: Array[String]): Unit = {
    println(add(10)(20))
    var res = add(10)
    println(res(30))
  }
  def add(a:Int)=(b:Int)=>a+b
}

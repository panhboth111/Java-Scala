package functions.anonymous_function

object demo {
  def main(args: Array[String]): Unit = {
    var add = (a:Int,b:Int)=>a+b
    //when we only need the variables once, we should use wild card instead
    var add2 = (_:Int)+(_:Int)
    println(add(10,20))
    println(add(10,20))
  }
}

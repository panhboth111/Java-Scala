package functions.closure

object demo extends App{
  //pure
  val pi = 3.14
  def circleArea(r:Double)= pi*r*r
  println(s"area: ${circleArea(3.5)}")
  //impure
  var multiplier = 2
  def multiply(a:Int)=a*multiplier
  println(s"result: ${multiply(10)}")
}

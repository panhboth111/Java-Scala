package functions.function_composition

object andThenDemo extends App{
  val increment = (a:Int) => a+1
  val double = (a:Int) => a*2
  println((increment andThen double)(1))
}

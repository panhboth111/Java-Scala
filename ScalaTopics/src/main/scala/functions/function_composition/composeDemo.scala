package functions.function_composition

object composeDemo extends App{
  val add = (a:Int)=>a+10
  val mul = (a:Int)=>a*2
  println((add compose mul)(10))
}

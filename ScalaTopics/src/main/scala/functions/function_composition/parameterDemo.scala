package functions.function_composition

object parameterDemo extends App{
  val increment = (_:Int) + 1
  //this is the same as 'val increment = (a:Int) => a+1'
  val triple = (_:Int) * 3
  //this is the same as 'val triple = (a:Int) => a*3'
  val divide = (_:Int)/5
  //this is the same as 'val divide = (a:Int) => a/5'
  println(divide(triple(increment(12))))

}

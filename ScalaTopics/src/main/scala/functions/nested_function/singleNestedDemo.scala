package functions.nested_function

object singleNestedDemo extends App{
  def changing(a:Int,option:String):Int={
    def increment()=a+1
    def decrement()=a-1
    return if(option.toLowerCase=="increment") increment() else decrement()
  }
  println(changing(10,"increment"))
}

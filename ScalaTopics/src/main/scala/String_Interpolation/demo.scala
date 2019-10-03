package String_Interpolation

object demo extends App{
  var name:String = "John"
  var age:Int = 19
  //s
  println(s"name:${name},age:${age}")
  //f
  println(f"name:$name%s,age:$age%d")
  //raw
  println(raw"hello ! \n")
}

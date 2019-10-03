package constructors

object primaryConstructorDemo extends App{
  var a = new A("John",19)
}
class A(var name:String,var age:Int){
  println("The constructor is invoked")
}


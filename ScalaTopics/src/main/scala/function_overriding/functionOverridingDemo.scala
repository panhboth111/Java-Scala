package function_overriding

object functionOverridingDemo extends App{

}
class A{
  def greet(): Unit ={
    println("Good morning")
  }
}
class B extends A{
  override def greet(): Unit ={
    println("good afternoon")
  }
}

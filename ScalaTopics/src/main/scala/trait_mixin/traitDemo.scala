package trait_mixin

object traitDemo extends App {
  var John = new Person("John",19)
  John.greet()
}
trait MyT{
  def greet
  def instantiated()=println("I've been instantiated")
}
trait MyT2{
  def skill
}
class Person(var name:String,var age:Int) extends MyT with MyT2{
  override def greet()= println(s"Hello! my name is $name")
  override def skill: Unit = println("Sleeping....")
  instantiated()
}

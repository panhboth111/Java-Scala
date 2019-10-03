package constructors

object auxiliaryConstructorDemo extends App{
  var John = new  Person("John")
  var Jim = new Person("Jim",19)
  var Jack = new Person("Jack",19,1.88)
  John.display()
  Jim.display()
  Jack.display()
}
class Person(var name:String){
  var age:Int = 0
  var height:Double = 0
  def this(name:String,age:Int){
    this(name)
    this.age = age
  }
  def this(name:String,age:Int,height:Double){
    this(name)
    this.age = age
    this.height = height
  }
  def display()={
    println(s"name: $name,age: $age, height:$height")
  }
}

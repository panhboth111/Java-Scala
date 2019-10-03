package classes_objects

object class_obect_Demo extends App{
  var John = new Person("John",19)
  John.intro()
}
class Person(name:String,age:Int){
  def intro():Unit = println(s"$name,$age")
}

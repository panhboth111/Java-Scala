package constructors

object constructorInheritance extends App{
  var y = new Y(199,"D")
  println(y.name)
}
class X(var name:String,var age:Int){
  def this(){
    this("None",0)
  }
  def this(name:String){
    this(name,0)
  }
}
class Y(var score:Int, var grade:String) extends X(){

}
package function_overloading

object functionOverloadingDemo extends App{

}
class Addition{
  def add(a:Int,b:Int)=a+b
  def add(a:Int,b:Int,c:Int)=a+b+c
  def add(a:Int,b:String)=a+b
  def add(a:String,b:Int)=a+b
}


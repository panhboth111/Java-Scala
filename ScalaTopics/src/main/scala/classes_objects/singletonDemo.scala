package classes_objects

object singletonDemo extends App{
  println(BMW.color)
  BMW.startDrving()
}

object BMW{
  var color = "black"
  var speed = 199
  def startDrving()={
    println("start!")
  }
}

package Arrays

object ArraysDemo2 extends App{
  var scores = new Array[Double](5)
  println("Enter scores: ")
  for(i<-0 until 5) scores(i) = scala.io.StdIn.readDouble()
  println(s"Total score: ${scores.sum}")
  println(s"highest score: ${scores.max}")
  println(s"lowest score: ${scores.min}")
}

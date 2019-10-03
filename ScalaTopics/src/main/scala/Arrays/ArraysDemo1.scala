package Arrays
import Array._
object ArraysDemo1 extends App{
  var scores = Array(10,8,6,9,5)
  //iterating through arrays
  println("using foreach")
  scores.foreach(s=>println(s))
  println("using for loop")
  for(i<-scores) println(i)
  println("using indexing")
  for(i<- 0 until scores.length) println(scores(i))
  //appending
  scores ++= Array(8)
  scores.foreach(n=>println(n))
  //map
  var scores2 = scores.map(s=>s+1)
  //filter
  var pass = scores.filter(s=>s>5)
  //concat
  var all = concat(scores2,pass)
  all.foreach(n=>println(n))
}

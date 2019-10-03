package tuple

object Tuples extends App{
  val items = (1,true,"hi",99.5)
  //access element
  println(items._1) //first index
  //pattern matching
  var (a,b,c,d) = items
  println(s"$a, $b, $c, $d ")
  //iterating
  for(i<- items.productIterator) println(i) //using for loops
  items.productIterator.foreach(n=>println(n)) //using for each
  //converting tuple to string
  //println(items.toString())
}

import scala.collection.immutable

//Data Structure

//Many ways to accomplish same results

//Seq Examples
val seq1 = Seq(1, 2, 3, 4, 5)

seq1.head
seq1.tail

for (element <- seq1) println(element)
seq1.foreach(element => println(element))

for (element <- seq1 if element < 3) yield element
seq1.filter(element => element < 3)

for (element <- seq1) yield element + 1
seq1.map(_ + 1) //Underscore will be replaced by element

//Recursions
def seqMapExample(seq: Seq[Int], f: Int => Int): Seq[Int] = {
  seq match {
    case Nil => Nil //Last element of List,Seq its Nill
    case x :: xs => f(x) +: seqMapExample(xs, f) //x is the head and xs is the tail of the list
  }
}

seqMapExample(seq1, x => x + 1)

def seqFilterExample(seq: Seq[Int], f: Int => Boolean): Seq[Int] = {
  seq match {
    case Nil => Nil
    case x :: xs if f(x) => x +: seqFilterExample(xs, f)
    case _ => seqFilterExample(seq.tail, f)
  }
}

seqFilterExample(seq1, _ < 3)

//Set Examples

//Think Set as (Int => Boolean)
//type Set = Int => Boolean
//If element is in the set then true will be returned

val set1 = Set(1, 2, 3, 4, 3, 4) //3,4 Duplications will be removed
//Set cannot have sorted elements

set1(4) // True

set1(5) // False

set1.map(_ + 1).filter(_ < 4)

//Range Example
val range1 = 1 to 10 by 3

for (i <- range1) print(i)

val d: Seq[Int] = for (i <- 1 to 5 by 2) yield i

//Map Example
val map1 = Map(1 -> "Hello", 2 -> "World", 3 -> "from", 4 -> "Mars")

for (i <- 1 to 4) print(map1(i) + " ")

val map2 = Map(1 -> "H", 2 -> "W", 1 -> "e", 1 -> "y", 3 -> "!", 3 -> "! :", 2 -> "or", 3 -> "p", 2 -> "ld")

val groupedByKeyMap = map2.groupBy(_._1)

map2.mkString(" ")


// Data structures

//Most Poppulat Lists
// The hierarchy of Lists in Scala  https://www.47deg.com/blog/adventures-with-scala-collections/
//Sequence
val seq = Seq(1,2,3,4) :+ 4
val seq1: Seq[Int] = 1 :: 2 :: 3 :: 4 :: Nil
//List
val list = 0 :: List(1,2,3,4)
val list2 = list :+ 4
val list3 = 1 :: 2 :: 3 :: 4 :: Nil
//Array
val array = 0 +: Array(1,2,3,4) :+ 5
//Set
val set =  Set(1,2,3,4) + 3 + 4 + 5
//Range
val range = 1 to 10
val range1 = 1 to 12 by 3
//Stream
val stream = 4 #:: Stream(1,2,3,4,5)
val stream1 = 1 #:: 2 #:: 4 #:: Stream.Empty
//Map
val map = Map("1"->1,"2" -> 2, "3" -> 3, "4" -> 4)


set(2)


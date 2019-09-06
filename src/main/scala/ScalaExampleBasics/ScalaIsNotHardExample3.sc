
//Lists - Sequences

//Most Popular Lists
// The hierarchy of Lists in Scala  https://www.47deg.com/blog/adventures-with-scala-collections/
//Traversable is the most abstract list
val traversable = Traversable(1, 2, 3, 4)
//Iterable the less abstract List extends Traversable
val x: Iterable[Int] = Iterable(1, 2, 3, 4, 5)
//Sequence less abstract extends Iterable
val seq = Seq(1, 2, 3, 4) :+ 4
val seq1: Seq[Int] = 1 :: 2 :: 3 :: 4 :: Nil
//List less abstract extends Seq
val list = 0 :: List(1, 2, 3, 4)
val list2 = list :+ 4
val list3 = 1 :: 2 :: 3 :: 4 :: Nil
//Set Unique Elements List extends Iterable
val set = Set(1, 2, 3, 4) + 3 + 4 + 5
//Range extends from IndexedSeq which extends from Seq
val range = 1 to 10
val range1 = 1 to 12 by 3
//Map (Key, Value) Pairs extends Iterable
val map = Map("1" -> 1, "2" -> 2, "3" -> 3, "4" -> 4)
//Array
val array = 0 +: Array(1, 2, 3, 4) :+ 5
//Stream Lazy Evaluation List
val stream = 4 #:: Stream(1, 2, 3, 4, 5)
val stream1 = 1 #:: 2 #:: 4 #:: Stream.Empty



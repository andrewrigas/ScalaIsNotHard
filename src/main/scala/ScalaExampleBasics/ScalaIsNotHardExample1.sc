
//Basic Examples

//Scala Immutable vs Mutable
val x = 14
var d = 3
d = x + d

//X cannot be modified constant value
//x = x + d


/*
Data Type  Definition
Boolean    true or false
Byte       8-bit signed two's complement integer (-2^7 to 2^7-1, inclusive)
-128 to 127
Short      16-bit signed two's complement integer (-2^15 to 2^15-1, inclusive)
32,768 to 32,767
Int        32-bit two's complement integer (-2^31 to 2^31-1, inclusive)
2,147,483,648 to 2,147,483,647
Long       64-bit two's complement integer (-2^63 to 2^63-1, inclusive)
-9,223,372,036,854,775,808 to +9,223,372,036,854,775,807
Float      32-bit IEEE 754 single-precision float
  1.40129846432481707e-45 to 3.40282346638528860e+38 (positive or negative)
Double     64-bit IEEE 754 double-precision float
  4.94065645841246544e-324d to 1.79769313486231570e+308d (positive or negative)
Char       16-bit unsigned Unicode character (0 to 2^16-1, inclusive)
0 to 65,535
String a sequence of Chars
*/
//Scala in-build Data types
val bool: Boolean = true
val byte: Byte = 12.byteValue
val short: Short = 1.shortValue
val int: Int = 3
val long: Long = 1234567890l
val float: Float = 3.14159265f
val char: Char = 'a'
val double: Double = 3.14159265
val string: String = "Hello World!"

//Extra Big Data Types
val bigInt: BigInt = BigInt(1234567890)
val bigDecimal: BigDecimal = BigDecimal(123456.789)


//Print Examples
println("Here is a mess: " + short + bool + char + double + bigInt)

println(f"Pi is about $float%.3f")
println(f"Zero padding on the left: $byte%05d")

println(s"I can use the s prefix to use variables like $short $bool $char")

// Substituting expressions (with curly brackets):
println(s"The s prefix isn't limited to variables; I can include any expression. Like ${1+2}")


// Using regular expressions:
val theUltimateAnswer: String = "To life, the universe, and everything is 42."

val pattern = """.* ([\d]+).*""".r
val pattern(answerString) = theUltimateAnswer
val answer = answerString.toInt
println(answer)


//If examples
if (1 > 3) println("Impossible!") else println("The world makes sense.")

if (1 > 3) {
  println("Impossible!")
} else {
  println("The world makes sense.")
}

//Match - Case example
val number = 3
number match {
  case 1 => println("One")
  case 2 => println("Two")
  case 3 => println("Three")
  case _ => println("Something else")
}


//For-loop Example
for (x <- 1 to 4) {
  val squared = x * x
  println(squared)
}

//While-loop Example
// While loops
var w = 5
while (w >= 0) {
  println(w)
  w -= 1
}

//Do-While example (Same line commands need ';')
w = 0
do { println(w); w+=1 } while (w <= 5)


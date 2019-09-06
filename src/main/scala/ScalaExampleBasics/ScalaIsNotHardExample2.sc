//Functional Examples

//Square Function
def Square(x: Int): Int = {
  x * x
}

//Cube function
def Cube(x: Int): Int = {
  x * x * x
}

//Input a value and a funcitons
def Transform(x: Int, f: Int => Int): Int = {
  f(x)
}

val x = 2

//Pass a function to a function
val squareResult = Transform(x, Square)
val cubeResult = Transform(x, Cube)

//Labda or Anonymous Functions
Transform(10, x => x / 2)

//Tuples
def TransformTuple(x: Int, y: Int, f: (Int, Int) => Int) = f(x, y)

//Create a Type for Data Type or Anonymous Functions
type JustAnotherNameForInt = Int
type F = (JustAnotherNameForInt, Int) => Int

def TransformTuple2(t: (Int, Int), f: F) = f(t._1, t._2)

TransformTuple(10, 15, (x, y) => x + y)

val tuple: (JustAnotherNameForInt, JustAnotherNameForInt) = (9, 2)
TransformTuple2(tuple, (x, y) => x - y)

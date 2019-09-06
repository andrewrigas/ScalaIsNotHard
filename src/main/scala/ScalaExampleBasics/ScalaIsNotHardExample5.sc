
import scala.util.{Try, Success, Failure}
import scala.concurrent.{Await, Future}
import scala.concurrent.duration._
import scala.concurrent.ExecutionContext.Implicits.global
//Useful Monad's

//Briefly a Monad is simply a way to wrapping things and
//provide methods to do operations on the wrapped stuff without unwrapping it.
//List - Seq are monad's but lets discover more useful monad's

//Option
val maybeInt: Option[Int] = Option(1)
val maybeString: Option[String] = Option("Hey")
val maybeBool: Option[Boolean] = Some(true)
val maybeSomething: Option[Nothing] = None

//Handle Options
def tryToGet[T](maybe: Option[T]) = {
  maybe match {
    case Some(_) => "I got something"
    case None => "I got nothing"
  }
}

tryToGet(maybeBool)
tryToGet(maybeSomething)

//Useful User
def arithmeticException(num: Int, divisor: Int): Option[Int] = {
  try {
    Some(num / divisor)
  } catch {
    case e: ArithmeticException => None
  }
}

def tryToInt(num: String) = {
  try {
    Some(num.toInt)
  } catch {
    case _ => None
  }
}

arithmeticException(10, 1)
arithmeticException(10, 0)

tryToInt("10")
tryToInt("12sasd").getOrElse(0) //If None return 0

//Either

val stringOrInt1: Either[String, Int] = Right(2)
val stringOrInt2: Either[String, Int] = Left("Hey")
val stringOrInt3: Either[String, Int] = if (1 == 9) Right(4) else Left("Yoo")

//Try
val tryGetInt1: Try[Int] = Try("12".toInt)
val tryGetInt2: Try[Int] = Try("Gio".toInt)
val tryGetInt3: Int = Try("Gio".toInt).getOrElse(0)

//Handle Try
def getIntMaybe(num: String) = {
  Try(num.toInt) match {
    case Success(value) => value
    case Failure(exception) => {
      println(s"Exception raised: ${exception.getMessage}")
      0
    }
  }
}

getIntMaybe("12")
getIntMaybe("a")

//Future
val futureInt1: Future[Int] = Future.successful(10001)

//Concurrent
val longFuture: Future[Long] = Future {
  Thread.sleep(500)
  1 + 1
}

futureInt1.onComplete{
    case Success(value) => println(value)
    case Failure(_) => println("Not Completed")
}

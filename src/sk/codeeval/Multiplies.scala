package sk.codeeval

/**
 * Created by vander on 3/16/15.
 */
object Multiplies extends App {
  var lines = Array[String]("13,8", "47,16")

  for (l <- lines) {
    var nums = l.split(",").map(_.toInt)
    println(Stream.from(2).find(_*nums(1) >= nums(0)).get * nums(1))
  }
}

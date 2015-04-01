/**
 * User: vander
 * Date: 3/16/15
 * Time: 10:03 PM
 */
object WordToDigit extends App {
  val lines = Array[String](
    "zero;two;five;seven;eight;four",
    "three;seven;eight;nine;two"
  )

  for (l <- lines) {
    println(l.split(';').map(convert).mkString)
  }

  def convert(literal: String): Int = literal match {
    case "zero" => 0
    case "one" => 1
    case "two" => 2
    case "three" => 3
    case "four" => 4
    case "five" => 5
    case "six" => 6
    case "seven" => 7
    case "eight" => 8
    case "nine" => 9
  }
}

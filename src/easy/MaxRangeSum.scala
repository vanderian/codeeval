package easy

/**
 * Created by vander on 3/16/15.
 */
object MaxRangeSum extends App {
  var lines = Array[String](
    "5;7 -3 -10 4 2 8 -2 4 -5 -2",
    "6;-4 3 -10 5 3 -7 -3 7 -6 3",
    "3;-7 0 -45 34 -24 7"
  )

  def process(s: String): String = {
    val sp = s.split(";")
    math.max(sp(1).split(" ").map(_.toInt).sliding(sp(0).toInt).map(_.sum).max, 0).toString
  }

  print(lines.map(process).mkString("\n"))
}

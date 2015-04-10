package easy

/**
 * Created by vander on 3/16/15.
 */
object Details extends App {
  var lines = Array[String](
    "XX.Y.Y,XXX..Y,X..YY,XX..Y",
    "XXX.YYYY,X...Y..Y,XX..YYYY,X.....YY,XX....YY",
    "XX...YY,X....YY,XX..YYY,X..YYYY",
    "XXYY,X..Y,XX.Y"
  )

  def process(s: String): String = {
    s.split(",").map(row => row.takeWhile(_ != 'Y').count(_ == '.')).min.toString
  }

  print(lines.map(process).mkString("\n"))
}

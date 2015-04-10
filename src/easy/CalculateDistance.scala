package easy

/**
 * User: vander
 * Date: 3/16/15
 * Time: 10:03 PM
 */
object CalculateDistance extends App {
  val lines = Array[String](
    "(25, 4) (1, -6)",
    "(47, 43) (-25, -11)"
  )

  for (l <- lines) {
    val s = l.substring(1, l.length - 1).split(java.util.regex.Pattern.quote(") ("))
    val left = s(0).split(", ").map(_.toInt)
    val right = s(1).split(", ").map(_.toInt)

    println(distance(left(0), left(1), right(0), right(1)))
  }

  def distance(x1: Int, y1: Int, x2: Int, y2: Int): Int = {
    math.sqrt(math.pow(x1 - x2, 2) + math.pow(y1 - y2, 2)).toInt
  }
}



/**
 * Created with IntelliJ IDEA.
 * User: vander
 * Date: 3/16/15
 * Time: 10:03 PM
 * To change this template use File | Settings | File Templates.
 */
object MultiplyLists extends App {
  val lines = Array[String](
    "9 0 6 | 15 14 9",
    "5 | 8",
    "13 4 15 1 15 5 | 1 4 15 14 8 2"
  )

  for (l <- lines) {
    val left = l.split(" \\| ")(0).split(" ").map(_.toInt)
    val right = l.split(" \\| ")(1).split(" ").map(_.toInt)
    println((0 to left.length - 1).map(i => left(i) * right(i)).mkString(" "))
  }
}

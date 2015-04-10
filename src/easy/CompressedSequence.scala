package easy

/**
 * User: vander
 * Date: 3/16/15
 * Time: 10:03 PM
 */
object CompressedSequence extends App {
  val lines = Array[String](
    "40 40 40 40 29 29 29 29 29 29 29 29 57 57 92 92 92 92 92 86 86 86 86 86 86 86 86 86 86",
    "73 73 73 73 41 41 41 41 41 41 41 41 41 41",
    "1 1 3 3 3 2 2 2 2 14 14 14 11 11 11 2",
    "7"
  )

  for (l <- lines) {
    val s = l.split(" ").map(_.toInt).toList
    println(count(s, s(0)).mkString(" "))
  }

  def count(s: List[Int], d: Int): List[String] = {
    def iter(s: List[Int], d: Int, sum: Int, acc: scala.collection.mutable.ListBuffer[String]): List[String] = s match {
      case List() =>
        acc += sum + " " + d
        acc.toList
      case head :: tail =>
        if (head == d) {
          iter(tail, d, sum + 1, acc)
        } else {
          acc += sum + " " + d
          iter(tail, head, 1, acc)
        }
    }
    iter(s, d, 0, scala.collection.mutable.ListBuffer.empty)
  }
}

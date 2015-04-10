package easy

/**
 * User: vander
 * Date: 3/16/15
 * Time: 10:03 PM
 */
object LowestUnique extends App {
  val lines = Array[String](
    "3 3 9 1 6 5 8 1 5 3",
    "9 2 9 9 1 8 8 8 2 1 1"
  )

  for (l <- lines) {
    val nums = l.split(" ").map(_.toInt)
    val results = nums.toSet.filter(unique => nums.count(_ == unique) == 1)
    println(if (results.isEmpty) "0" else nums.indexOf(results.min) + 1)
  }
}

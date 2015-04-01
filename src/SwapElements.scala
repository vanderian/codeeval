

/**
 * Created with IntelliJ IDEA.
 * User: vander
 * Date: 3/16/15
 * Time: 10:03 PM
 * To change this template use File | Settings | File Templates.
 */
object SwapElements extends App {
  val lines = Array[String](
    "1 2 3 4 5 6 7 8 9 : 0-8",
    "1 2 3 4 5 6 7 8 9 10 : 0-1, 1-3"
  )

  for (l <- lines) {
    val list = l.split(" : ")(0).split(" ")
    val moves = l.split(" : ")(1).split(", ")
    println(moves.foldLeft(list)((acc, move) => {
      val m = move.split("-").map(_.toInt)
      val tmp = acc(m(0))
      acc.updated(m(0), acc(m(1))).updated(m(1), tmp)
    }).mkString(" "))
  }
}

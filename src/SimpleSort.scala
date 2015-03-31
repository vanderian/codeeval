/**
 * User: vander
 * Date: 3/16/15
 * Time: 10:03 PM
 */
object SimpleSort extends App {
  val lines = Array[String](
    "70.920 -38.797 14.354 99.323 90.374 7.581",
    "-37.507 -3.263 40.079 27.999 65.213 -55.552"
  )

  lines.foreach(l => println(l.split(" ").map(_.toDouble).sorted.map("%.3f".format(_)).mkString(" ")))
}

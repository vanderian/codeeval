package easy

/**
 * User: vander
 * Date: 3/16/15
 * Time: 10:03 PM
 */
object PenultimateWord extends App {
  val lines = Array[String](
    "some line with text",
    "another line"
  )

  lines.foreach(l => println(l.split(" ").takeRight(2).head))
}

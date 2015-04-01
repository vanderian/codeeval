/**
 * User: vander
 * Date: 3/16/15
 * Time: 10:03 PM
 */
object CapitalizeWords extends App {
  val lines = Array[String](
    "Hello world",
    "javaScript language",
    "a letter",
    "1st thing"
  )

  lines.foreach(l => println(l.split(" ").map(_.capitalize).mkString(" ")))
}

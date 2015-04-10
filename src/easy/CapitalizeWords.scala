package easy

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

  for (l <- lines) {
    val s = l.split(" ")
    println(s.map(_.capitalize).mkString(" "))
  }
  lines.foreach(l => println(l.split(" ").map(_.capitalize).mkString(" ")))
}

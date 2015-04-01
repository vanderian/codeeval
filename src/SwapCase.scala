/**
 * User: vander
 * Date: 3/16/15
 * Time: 10:03 PM
 */
object SwapCase extends App {
  val lines = Array[String](
    "Hello world",
    "JavaScript language",
    "a letter",
    "1st thing"
  )

  lines.foreach(l => println(l.split(" ").toList.map(swapCaseString).mkString(" ")))

  def swapCaseString(s: String): String = {
    s.toList.map(swapCase).mkString("")
  }

  def swapCase(c: Char): Char = c.isLower match {
    case true => c.toUpper
    case false => c.toLower
  }
}

package moderate

/**
 * Created by vander on 3/16/15.
 */
object MthToLastElement extends App {
  val lines = "a b c d 5\ne f g h 2".split("\n").iterator

  def process(s: String): String = {
    val sp = s.split(" ")
    val pos = sp.last.toInt
    if (pos > sp.length-1) return ""
    sp.dropRight(1).takeRight(pos).head
  }

  print(lines.map(process).filter(!_.isEmpty).mkString("\n"))
}
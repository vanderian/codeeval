package moderate

/**
 * Created by vander on 3/16/15.
 */
object LowestCommonAncestor extends App {
  val lines = "8 52\n3 29".split("\n").iterator

  def process(s: String): String = {
    val sp = s.split(" ").map(_.toInt)
    ""
  }

  print(lines.map(process).mkString("\n"))
}
package easy


/**
 * Created with IntelliJ IDEA.
 * User: vander
 * Date: 3/16/15
 * Time: 10:03 PM
 * To change this template use File | Settings | File Templates.
 */
object MatrixRotation extends App {
  val lines = Array[String](
    "a b c d",
    "a b c d e f g h i j k l m n o p",
    "a b c d e f g h i"
  )

  def process(s: String): String = {
    val sp = s.split(" ")
    val len = math.sqrt(sp.length).toInt
    Array.tabulate(len, len)((r, c) => c + r*len).transpose.map(_.map(d => sp(d)).mkString(" ").reverse).mkString(" ")
  }

  print(lines.map(process).mkString("\n"))
}

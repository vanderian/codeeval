package moderate

/**
 * Created by vander on 3/16/15.
 */
object LongestLines extends App {
  val lines = "2\nHello World\nCodeEval\nQuick Fox\nA\nSan Francisco".split("\n").iterator

  val count = lines.next().toInt
  print(lines.toList.sortWith(_.length > _.length).take(count).mkString("\n"))
}
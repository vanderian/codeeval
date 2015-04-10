/**
 * Created by vander on 3/16/15.
 */
object ReadMore extends App {
  var lines = Array[String](
    "Tom exhibited.",
    "Amy Lawrence was proud and glad, and she tried to make Tom see it in her face - but he wouldn't look.",
    "Tom was tugging at a button-hole and looking sheepish.",
    "Two thousand verses is a great many - very, very great many.",
    "123456789A123456789B123456789C123456789D 23456789E1234 6"
  )

  print(lines.map(process).mkString("\n"))

  def process(s: String): String = s.length match {
    case l if l > 55 =>
      val t = s.take(40)
      t.reverse.dropWhile(c => t.contains(" ") && c != ' ').reverse.trim + "... <Read More>"
    case _ => s
  }
}

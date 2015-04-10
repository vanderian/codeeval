package easy

/**
 * Created by vander on 3/16/15.
 */
object WithoutRepetitions extends App {
  var lines = Array[String](
    "But as he spake he drew the good sword from its scabbard, and smote a heathen knight, Jusssstin of thee Iron Valley.",
    "No matttter whom you choose, she deccccclared, I will abide by your decision."
  )

  print(lines.map(process).mkString("\n"))

  def process(l: String): String = {
    def iter(list:List[Char], last: Char, acc: String): String = list match {
      case List() => acc
      case h::t if h == last => iter(t, h, acc)
      case h::t => iter(t, h, acc + h)
    }

    iter(l.toList, 0, "")
  }
}

package easy



/**
 * Created with IntelliJ IDEA.
 * User: vander
 * Date: 3/16/15
 * Time: 10:03 PM
 * To change this template use File | Settings | File Templates.
 */
object LetterCasePercentageRation extends App {
  val lines = Array[String](
    "thisTHIS",
    "AAbbCCDDEE",
    "N",
    "UkJ"
  )

  for (l <- lines) {
    val len = l.length
    val format = "lowercase: %.2f uppercase: %.2f"
    val ur = l.filter(_.isLower).length.toFloat / l.length.toFloat * 100
    println(format.format(ur, 100 - ur))
  }
}

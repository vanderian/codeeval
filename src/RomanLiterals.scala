

/**
 * Created with IntelliJ IDEA.
 * User: vander
 * Date: 3/16/15
 * Time: 10:03 PM
 * To change this template use File | Settings | File Templates.
 */
object RomanLiterals extends App {
  val lines = Array[String](
    "159",
    "296",
    "3992"
  )

  val literals = Vector(Vector("I", "IV", "V", "IX"), Vector("X", "XL", "L", "XC"), Vector("C", "CD", "D", "CM"), Vector("M"))

  lines.foreach(l =>
    println(toRoman(l))
  )

  def toRoman(num: String): String = {
    def iter(chars: List[Char], index: Int, acc: String): String = chars match {
      case List() => acc
      case head::tail =>
        val s = getLiteral(head.asDigit, index)
        iter(tail, index - 1, acc + s)
    }
    iter(num.toList, num.length - 1, "")
  }

  def getLiteral(decimal: Int, index:Int): String = {
    def iter(num: Int, acc: String): String = num match {
      case 0 => acc
      case x if (1 to 3).contains(x) => iter(x-1, acc + literals(index)(0))
      case 4 => iter(0, acc + literals(index)(1))
      case x if (5 to 8).contains(x) => iter(x-5, acc + literals(index)(2))
      case 9 => iter(0, acc + literals(index)(3))
    }
    iter(decimal, "")
  }
}

import scala.collection.mutable

/**
 * Created with IntelliJ IDEA.
 * User: vander
 * Date: 3/16/15
 * Time: 10:03 PM
 * To change this template use File | Settings | File Templates.
 */
object Main extends App {
  val lines = Array[String](
    "6",
    "153",
    "351",
    "1634",
    "2131",
    "370"
  )
  lines.foreach(l =>
    println(if (isArmstrong(l)) "True" else "False")
  )

  def makeFunc(l: String) = {
    val s = l.split(" ")
    s(0) match {
      case "SetRow" => setRow(s(1).toInt, s(2).toInt) _
      case "SetCol" => setCol(s(1).toInt, s(2).toInt) _
      case "QueryRow" => queryRow(s(1).toInt) _
      case "QueryCol" => queryCol(s(1).toInt) _
    }
  }

  def setCol(col: Int, v: Int)(matrix: Array[Array[Int]]) = matrix.updated(col, matrix(col).map(old => v))

  def setRow(row: Int, v: Int)(matrix: Array[Array[Int]]) = matrix.map(_.updated(row, v))

  def queryCol(col: Int)(matrix: Array[Array[Int]]) = {
    println(matrix(col).sum)
    matrix
  }

  def queryRow(row: Int)(matrix: Array[Array[Int]]) = {
    println(matrix.map(_(row)).sum)
    matrix
  }

  def iter(pairs: List[Int], value: Int, acc: Int): Int = pairs match {
    case List() => acc
    case head :: rest => iter(rest, value - 1, acc + (value * head))
  }

  def isArmstrong(num: String): Boolean = {
    val pow = num.length
    num.toCharArray.map(_.asDigit).map(math.pow(_, pow).toInt).sum == num.toInt
  }

  class Hex(val s: String) {
    def hex = Integer.parseInt(s, 16)
  }

  implicit def conv(hex: String): Hex = new Hex(hex)

  def count(num: Int, str: String): Int = {
    def iter(str: String, acc: Int): Int = str match {
      case "" => acc
      case _ =>
        val r = if (str.head.asDigit == num) acc + 1 else acc
        iter(str.drop(1), r)
    }
    iter(str, 0)
  }

  def sum(number: Int): Int = {
    def iter(num: Int, acc: Int): Int = num match {
      case 0 => acc
      case _ =>
        val d = num % 10
        val n = num / 10
        iter(n, d * d + acc)
    }
    iter(number, 0)
  }

}

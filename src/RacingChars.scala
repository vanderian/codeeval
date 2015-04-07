/**
 * Created with IntelliJ IDEA.
 * User: vander
 * Date: 3/16/15
 * Time: 10:03 PM
 * To change this template use File | Settings | File Templates.
 */
object RacingChars extends App {
  val lines = Iterator[String](
    "#########_##",
    "########C_##",
    "#######_####",
    "######_#C###",
    "#######_C###",
    "#######_####",
    "######C#_###",
    "######C_####",
    "#######_####",
    "#######_####"
  )

  val ln = lines.toList
  var last = getPos(ln(0))
  for (l <- ln) {
    val pos = getPos(l)
    val c = getChar(last, pos)
    println(l.patch(pos, c::List.empty, 1))
    last = pos
  }

  def getChar(l: Int, c: Int): Char = l compare c match {
    case 0 => '|'
    case d if d > 0 => '/'
    case d if d < 0 => '\\'
  }

  def makeLine(p: Int, c: Char): String = {
    (0 to 11).map(d => if (d == p) c else '#').mkString
  }

  def getPos(s: String): Int = {
    if (s.contains('C')) s.indexOf('C') else s.indexOf('_')
  }
}

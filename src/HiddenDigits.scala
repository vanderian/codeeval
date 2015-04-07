/**
 * User: vander
 * Date: 3/16/15
 * Time: 10:03 PM
 */
object HiddenDigits extends App {
  val lines = Array[String](
    "abcdefghik",
    "Xa,}A#5N}{xOBwYBHIlH,#W",
    "(ABW>'yy^'M{X-K}q,",
    "5649484131"
  )

  val decode = Map(
    'a' -> 0,
    'b' -> 1,
    'c' -> 2,
    'd' -> 3,
    'e' -> 4,
    'f' -> 5,
    'g' -> 6,
    'h' -> 7,
    'i' -> 8,
    'j' -> 9,
    '1' -> 1,
    '2' -> 2,
    '3' -> 3,
    '4' -> 4,
    '5' -> 5,
    '6' -> 6,
    '7' -> 7,
    '8' -> 8,
    '9' -> 9,
    '0' -> 0
  )
  for (l <- lines) {
    val s = l.toCharArray.map(decode.getOrElse(_, "")).mkString
    println(if (s.isEmpty) "NONE" else s)
  }
}

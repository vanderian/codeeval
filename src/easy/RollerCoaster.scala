package easy

/**
 * User: vander
 * Date: 3/16/15
 * Time: 10:03 PM
 */
object RollerCoaster extends App {
  val lines = Array[String](
    "To be, or not to be: that is the question.",
    "Whether 'tis nobler in the mind to suffer.",
    "The slings and arrows of outrageous fortune.",
    "Or to take arms against a sea of troubles."
  )

  for (l <- lines) {
    val s = l.toCharArray
    var lastUpper = false
    for (i <- 0 to l.length - 1) {
      if (s(i).isLetter) {
        s(i) = swapCase(lastUpper, s(i))
        lastUpper = !lastUpper
      }
    }
    println(s.mkString)
  }

  def swapCase(upper: Boolean, c: Char): Char = upper match {
    case false => c.toUpper
    case true => c.toLower
  }
}

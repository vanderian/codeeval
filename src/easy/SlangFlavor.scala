package easy

/**
 * Created by vander on 3/16/15.
 */
object SlangFlavor extends App {
  var lines = Array[String](
    "Lorem ipsum dolor sit amet. Mea et habeo doming praesent. Te inani utroque recteque has, sea ne fugit verterem!",
    "Usu ei scripta phaedrum, an sed salutatus definiebas? Qui ut recteque gloriatur reformidans. Qui solum aeque sapientem cu.",
    "Eu nam nusquam quaestio principes."
  )

  val slang = Array[String](
    ", yeah!",
    ", this is crazy, I tell ya.",
    ", can U believe this?",
    ", eh?",
    ", aw yea.",
    ", yo.",
    "? No way!",
    ". Awesome!"
  )

  val it = Stream.continually(slang.toStream).flatten.iterator

  def process(s: String): String = {
    def iter(s: String, changed: Boolean, acc: StringBuilder): String = s match {
      case "" => acc.toString()
      case _ =>
        val i = s.indexWhere(isPunct)
        acc.append(s.substring(0, i)).append(if (changed) it.next() else s.charAt(i))
        iter(s.substring(i + 1), !changed, acc)
    }
    iter(s, false, StringBuilder.newBuilder)
  }

  def isPunct(c: Char): Boolean = {
    c == '.' || c == '?' || c == '!'
  }

  print(process(lines.mkString("\n")))
}

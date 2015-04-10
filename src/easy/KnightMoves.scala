package easy

/**
 * Created by vander on 3/16/15.
 */
object KnightMoves extends App {
  var lines = Array[String](
    "g2",
    "a1",
    "d6"
  )

  case class KnightPos(c: Int, r: Int) {
    def move: List[KnightPos] = {
      for {
        KnightPos(cf, rf) <- List(
          KnightPos(c + 2, r - 1), KnightPos(c + 2, r + 1),
          KnightPos(c - 2, r - 1), KnightPos(c - 2, r + 1),
          KnightPos(c + 1, r - 2), KnightPos(c + 1, r + 2),
          KnightPos(c - 1, r - 2), KnightPos(c - 1, r + 2)
        )
        if (1 to 8).contains(cf) && (1 to 8).contains(rf)
      } yield KnightPos(cf, rf)
    }
    def print: String = {
      (c + 96).toChar + f"$r%d"
    }
  }

  def process(s: String): String = {
    KnightPos(s(0).toInt -96, s(1).asDigit).move.map(k => k.print).sorted.mkString(" ")
  }

  print(lines.map(process).mkString("\n"))
}

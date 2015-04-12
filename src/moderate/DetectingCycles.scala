package moderate

/**
 * Created by vander on 3/16/15.
 */
object DetectingCycles extends App {
  val lines = "2 0 6 3 1 6 3 1 6 3 1\n3 4 8 0 11 9 7 2 5 6 10 1 49 49 49 49\n1 2 3 1 2 3 1 2 3".split("\n").iterator

  def brent(nums: List[Int]): List[Int] = {

    var power, lam = 1
    var t = 0
    var h = 1
    while (h < nums.length && nums(t) != nums(h)) {
      if (power == lam) {
        t = h
        power = power * 2
        lam = 0
      }
      h = h + 1
      lam = lam + 1
    }

    if (h == nums.length) return List()

    t = 0
    h = lam
    while (nums(t) != nums(h)) {
      h = h + 1
      t = t + 1
    }

    nums.slice(t, t+lam)
  }

  def iter(nums: List[Int]): List[Int] = nums match {
    case List() => List()
    case h::t =>
      val b = brent(t)
      if (!b.isEmpty) b else iter(t)
  }

  def process(s: String): List[Int] = {
    s.split(" ").map(_.toInt).toList
  }

  print(lines.map(process).map(l => iter(0::l)).map(_.mkString(" ")).mkString("\n"))
}
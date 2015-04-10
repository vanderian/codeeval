package easy

/**
 * Created by vander on 3/17/15.
 */
object PrimesSum {
  def main(args: Array[String]) {
    print((2 to Int.MaxValue).view.filter(p => (2 to Math.sqrt(p.toDouble).toInt).forall(d => p % d != 0)).take(1000).sum)
  }
}

/**
 * Created by vander on 3/17/15.
 */
object PrimePalindrome {
  def main(args: Array[String]) {
    val result = (2 to 1000).reverse.find(p => p.toString.reverse == p.toString
      && (2 to Math.sqrt(p.toDouble).toInt).forall(d => p % d != 0))
    print(result.get)
  }
}

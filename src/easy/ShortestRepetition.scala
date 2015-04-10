package easy



/**
 * Created with IntelliJ IDEA.
 * User: vander
 * Date: 3/16/15
 * Time: 10:03 PM
 * To change this template use File | Settings | File Templates.
 */
object ShortestRepetition extends App {
  val lines = Array[String](
    "abcabcabcabc",
    "bcbcbcbcbcbcbcbcbcbcbcbcbcbc",
    "dddddddddddddddddddd",
    "adcdefg"
  )

  for (l <- lines) {
    println((1 to l.length).find(n => l.split(l.take(n)).length == 0).get)
  }
}

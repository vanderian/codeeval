package easy



/**
 * Created with IntelliJ IDEA.
 * User: vander
 * Date: 3/16/15
 * Time: 10:03 PM
 * To change this template use File | Settings | File Templates.
 */
object SplitTheNumber extends App {
  val lines = Array[String](
    "3413289830 a-bcdefghij",
    "776 a+bc",
    "12345 a+bcde"
  )

  for (l <- lines) {
    val s = l.split(" ")
    if (s(1).contains('+')) {
      val p = s(1).indexOf('+')
      val sp = s(0).splitAt(p)
      println(sp._1.toInt + sp._2.toInt)
    } else {
      val p = s(1).indexOf('-')
      val sp = s(0).splitAt(p)
      println(sp._1.toInt - sp._2.toInt)
    }
  }
}

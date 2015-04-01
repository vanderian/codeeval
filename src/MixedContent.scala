

/**
 * Created with IntelliJ IDEA.
 * User: vander
 * Date: 3/16/15
 * Time: 10:03 PM
 * To change this template use File | Settings | File Templates.
 */
object MixedContent extends App {
  val lines = Array[String](
    "8,33,21,0,16,50,37,0,melon,7,apricot,peach,pineapple,17,21,24,13,14,43,41",
    "8,33,21,0,16,50,37,0,17,21,24,13,14,43,41",
    "melon,apricot,peach,pineapple"
  )

  for (l <- lines) {
    val s = l.split(",").partition(_ matches "\\d+")
    println(List(s._2.mkString(","), s._1.mkString(",")).filter(_.length > 0).mkString("|"))
  }
}

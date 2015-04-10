package easy

/**
 * Created with IntelliJ IDEA.
 * User: vander
 * Date: 3/16/15
 * Time: 10:03 PM
 * To change this template use File | Settings | File Templates.
 */
object TheMajorElement extends App {
  val lines = Array[String](
    "92,19,19,76,19,21,19,85,19,19,19,94,19,19,22,67,83,19,19,54,59,1,19,19",
    "92,11,30,92,1,11,92,38,92,92,43,92,92,51,92,36,97,92,92,92,43,22,84,92,92",
    "4,79,89,98,48,42,39,79,55,70,21,39,98,16,96,2,10,24,14,47,0,50,95,20,95,48,50,12,42"
  )

  for (l <- lines) {
    val s = l.split(",").map(_.toInt)
    val len = s.length / 2
    val res = s.toSet.find(d => s.count(_ == d) > len)
    println(res.getOrElse("None"))
  }
}

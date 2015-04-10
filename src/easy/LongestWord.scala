package easy

/**
 * Created with IntelliJ IDEA.
 * User: vander
 * Date: 3/16/15
 * Time: 10:03 PM
 * To change this template use File | Settings | File Templates.
 */
object LongestWord extends App {
  val lines = Array[String](
    "some line with text",
    "another text"
  )

  for (l <- lines) {
    println(l.split(" ").map(w => (w, w.length)).sortWith(_._2 > _._2)(0)._1)
  }
}

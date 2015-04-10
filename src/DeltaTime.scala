/**
 * User: vander
 * Date: 3/16/15
 * Time: 10:03 PM
 */
object DeltaTime extends App {
  val lines = Array[String](
    "14:01:57 12:47:11",
    "13:09:42 22:16:15",
    "08:08:06 08:38:28"
  )

  for (l <- lines) {
    val s = l.split(" ")
    val res = math.abs(getSeconds(s(1)) - getSeconds(s(0)))
    println(format(res))
  }

  def getSeconds(s: String): Int = {
    val i = s.split(":").map(_.toInt)
    i(0)*3600 + i(1)*60 + i(2)
  }

  def format(seconds: Int): String = {
    val h = seconds / 3600
    val tmp = seconds % 3600
    val m = tmp / 60
    val s = tmp % 60
    "%02d:%02d:%02d".format(h, m, s)
  }
}


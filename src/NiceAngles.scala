/**
 * User: vander
 * Date: 3/16/15
 * Time: 10:03 PM
 */
object NiceAngles extends App {
  val lines = Array[String](
    "330.39991833",
    "0.001",
    "14.64530319",
    "0.25"
  )

  for (l <- lines) {
    val angle = l.toDouble
    val sec = (angle - angle.toLong) * 3600
    println("%d.%02d\'%02d\"".format(angle.toLong, (sec / 60).toInt, (sec % 60).toInt))
  }
}

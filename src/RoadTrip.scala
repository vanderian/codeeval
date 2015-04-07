/**
 * User: vander
 * Date: 3/16/15
 * Time: 10:03 PM
 */
object RoadTrip extends App {
  val lines = Array[String](
    "Rkbs,5453; Wdqiz,1245; Rwds,3890; Ujma,5589; Tbzmo,1303;",
    "Ramytdb,2683; Voclqmb,5236;"
  )

  for (l <- lines) {
    val sorted = l.dropRight(1).split("(; )?\\w+,").filter(!_.isEmpty).map(_.toInt).sorted
    var last = 0
    val res = scala.collection.mutable.ListBuffer.empty[Int]
    for (d <- sorted) {
      res += d - last
      last = d
    }
    println(res.mkString(","))
  }
}

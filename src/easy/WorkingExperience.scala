package easy

/**
 * User: vander
 * Date: 3/16/15
 * Time: 10:03 PM
 */
object WorkingExperience extends App {
  val lines = Array[String](
    "Feb 2004-Dec 2009; Sep 2004-Jul 2008",
    "Aug 2013-Mar 2014; Apr 2013-Aug 2013; Apr 2013-Aug 2013; Jun 2014-Aug 2015; Apr 2003-Nov 2004; Apr 2014-Jan 2015",
    "Mar 2003-Jul 2003; Dec 2003-Jan 2004; Nov 2003-Dec 2003; Nov 2003-Feb 2004; Apr 1999-Nov 1999",
    "Apr 1992-Dec 1993; Feb 1996-Sep 1997; Jan 2002-Jun 2002; Sep 2003-Apr 2004; Feb 2010-Nov 2011",
    "Feb 2004-May 2004; Jun 2004-Jul 2004"

  )

  for (l <- lines) {
    val s = l.split("; ").map(region)
    val len = s.length - 1
    for (i <- 0 to len) {
      val head = s(i)
      for (j <- 0 to len) {
        if (i != j) {
          val item = s(j)
          if (head._1 <= item._1 && head._2 >= item._2) {
            s.update(j, (0, 0))
          } else if (head._1 <= item._1 && head._2 < item._2 && head._2 - 1 >= item._1) {
            s.update(j, (head._2, item._2))
          } else if (head._1 > item._1 && head._2 >= item._2 && head._1 <= item._2 - 1) {
            s.update(j, (item._1, head._1))
          }
        }
      }
    }
//    println(s.map(t => t._2 - t._1).mkString(" "))
//    println(s.map(t => t._2 - t._1).sum)
    println(s.map(t => t._2 - t._1).sum / 12)
  }

  def region(s: String): (Int, Int) = {
    val dates = s.split('-').map(date)
    (dates(0), dates(1) + 1)
  }

  def date(s: String): Int = {
    val d = s.split(" ")
    convert(d(0)) + d(1).toInt * 12
  }

  def convert(literal: String): Int = literal match {
    case "Jan" => 0
    case "Feb" => 1
    case "Mar" => 2
    case "Apr" => 3
    case "May" => 4
    case "Jun" => 5
    case "Jul" => 6
    case "Aug" => 7
    case "Sep" => 8
    case "Oct" => 9
    case "Nov" => 10
    case "Dec" => 11
  }
}

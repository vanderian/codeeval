/**
 * User: vander
 * Date: 3/16/15
 * Time: 10:03 PM
 */
object BigData extends App {
  val lines = Array[String](
    "3.1415926",
    "1.41421356",
    "01-01-1970",
    "2.7182818284",
    "4 8 15 16 23 42"
  )

  val symbols =
      "-**----*--***--***---*---****--**--****--**---**--\n" +
      "*--*--**-----*----*-*--*-*----*-------*-*--*-*--*-\n" +
      "*--*---*---**---**--****-***--***----*---**---***-\n" +
      "*--*---*--*-------*----*----*-*--*--*---*--*----*-\n" +
      "-**---***-****-***-----*-***---**---*----**---**--\n" +
      "--------------------------------------------------"

  val bigData = (0 to 9).flatMap(d => {
    val s = symbols.split("\n")
    val range = d * 5
    (0 to 5).map(i => s(i).substring(range, range + 5))
  }).map(_.mkString)

//  println(bigData.mkString)

  for (l <- lines) {
    val nums = l.toCharArray.filter(_.isDigit)
    val res = (0 to 5).map(d => {
      nums.map(i => bigData(i.asDigit*6 + d)).mkString
    })
    println(res.mkString("\n"))
  }
}


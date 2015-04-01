/**
 * User: vander
 * Date: 3/16/15
 * Time: 10:03 PM
 */
object FindAWriter extends App {
  val lines = Array[String](
    "osSE5Gu0Vi8WRq93UvkYZCjaOKeNJfTyH6tzDQbxFm4M1ndXIPh27wBA rLclpg| 3 35 27 62 51 27 46 57 26 10 46 63 57 45 15 43 53",
    "3Kucdq9bfCEgZGF2nwx8UpzQJyHiOm0hoaYP6ST1WM7Nks5XjrR4IltBeDLV vA| 2 26 33 55 34 50 33 61 44 28 46 32 28 30 3 50 34 61 40 7 1 31"
  )

  for (l <- lines) {
    val chars = l.split('|')(0).toList
    val nums = l.split('|')(1).split(" ").filter(!_.isEmpty).map(_.toInt)

    println(nums.map(n => chars(n - 1)).mkString)
  }
}

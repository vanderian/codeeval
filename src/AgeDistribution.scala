/**
 * User: vander
 * Date: 3/16/15
 * Time: 10:03 PM
 */
object AgeDistribution extends App {
  val lines = Array[String](
    "0",
    "19"
  )

  print(lines.map(d => convert(d.toInt)).mkString("\n"))

  def convert(num: Int): String = num match {
    case d if d < 0 || d > 100 => "This program is for humans"
    case d if d >= 0 && d <= 2 => "Still in Mama\'s arms"
    case d if d >= 3 && d <= 4 => "Preschool Maniac"
    case d if d >= 5 && d <= 11 => "Elementary school"
    case d if d >= 12 && d <= 14 => "Middle school"
    case d if d >= 15 && d <= 18 => "High school"
    case d if d >= 19 && d <= 22 => "College"
    case d if d >= 23 && d <= 65 => "Working for the man"
    case d if d >= 66 && d <= 100 => "The Golden Years"
  }
}

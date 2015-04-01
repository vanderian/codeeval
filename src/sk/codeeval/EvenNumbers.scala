package sk.codeeval

/**
 * Created by vander on 3/16/15.
 */
object EvenNumbers extends App {
  var lines = Array[String](
    "701",
    "4123",
    "2936"
  )

  print(lines.map(_.toInt).map(n => if(n % 2 == 0) "1" else "0").mkString("\n"))
}

package easy

/**
 * Created by vander on 3/16/15.
 */
object WordsReverse extends App {
  var lines = Array[String]("Hellow This Is", "World Fire Last")

  for (l <- lines) {
    println(l.split(" ").reverse.mkString(" "))
  }
}

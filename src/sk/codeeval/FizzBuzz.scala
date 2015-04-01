package sk.codeeval

/**
 * Created by vander on 3/16/15.
 */
object FizzBuzz extends App {
  var lines = Array[String]("3 5 10", "2 7 15")

  for (l <- lines) {
    var nums = l.split(" ") map (_.toInt)
    var f = nums(0)
    var b = nums(1)

    for (i <- 1 to nums(2)) {
      if (i != 1) {
        print(" ")
      }
      if (i % f == 0 && i % b == 0) {
        print("FB")
      } else if (i % f == 0) {
        print("F")
      } else if (i % b == 0) {
        print("B")
      } else {
        print(i.toString)
      }

    }
    println()
  }
}

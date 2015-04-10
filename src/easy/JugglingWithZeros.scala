package easy



/**
 * Created with IntelliJ IDEA.
 * User: vander
 * Date: 3/16/15
 * Time: 10:03 PM
 * To change this template use File | Settings | File Templates.
 */
object JugglingWithZeros extends App {
  val lines = Array[String](
    "00 0 0 00 00 0",
    "0 0",
    "00 0 0 000 00 0000000 0 000",
    "0 000 0 0000 0 00 0 000000 0 0000 0 0000 0 00 0 0 0 000000 0 000000 0 000000 0 0 0 000 0 0 0 000 0 0 0 00000 0 00 0 00000 0 000000 0 0000 0 0000 0 0000 0 000000 00 0 0 0 00 00 0 000 00 0000 0 00 00 00 0 0000 00 0 0 0 00 00 0 00 00 00 0 00 00 0 0 0 00 0",
    "0 00000 0 00 0 000000 0 000000 0 000000 0 000000 0 00 0 00 0 0000 0 0 0 000 0 000 0 0000 0 0 0 0 0 000000 0 000000 0 000 0 000000 00 0 0 0"
  )

  for (l <- lines) {
    val it = l.split(" ").iterator
    val binary = scala.collection.mutable.StringBuilder.newBuilder
    while (it.hasNext) {
      it.next() match {
        case "0" => binary.append(it.next())
        case "00" => binary.append("1" * it.next().length)
      }
    }

    println(java.lang.Long.parseLong(binary.toString(), 2))
  }
}

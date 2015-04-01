package sk.codeeval

/**
 * Created by vander on 3/16/15.
 */
object JsonMenuIds extends App {
  var lines = Array[String](
    "{\"menu\": {\"header\": \"menu\", \"items\": [{\"id\": 27}, {\"id\": 0, \"label\": \"Label 0\"}, null, {\"id\": 93}, {\"id\": 85}, {\"id\": 54}, null, {\"id\": 46, \"label\": \"Label 46\"}]}}",
    "{\"menu\": {\"header\": \"menu\", \"items\": [{\"id\": 81}]}}",
    "{\"menu\": {\"header\": \"menu\", \"items\": [{\"id\": 70, \"label\": \"Label 70\"}, {\"id\": 85, \"label\": \"Label 85\"}, {\"id\": 93, \"label\": \"Label 93\"}, {\"id\": 2}]}}"
  )

  val Id = """(\d+)""".r.unanchored

  for (l <- lines) {
    println(l.split("""\{|\}""").filter(_.contains("label"))
      .map(s => {
      val Id(id, _*) = s
      id.toInt
    }).sum)

  }
}

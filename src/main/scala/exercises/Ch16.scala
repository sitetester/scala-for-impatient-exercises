package exercises

import scala.io.Source

object Ch16 {

  def exercise6(path: String): Unit = {
    val html = Source
      .fromResource(path)
      .getLines()
      .mkString

    val pattern = "<a href=(\"[/a-z]+\")>([a-z]+)<".r

    for (m <- pattern.findAllMatchIn(html)) {
      println(s"href=${m.group(1)}, text=${m.group(2)}")
    }
  }
}

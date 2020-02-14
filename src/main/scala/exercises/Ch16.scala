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

  def exercise7(map: Map[String, String]): String = {

    map match {
      case m: Map[String, String] =>
        val h = m.head
        val l = m.last

        s"<dl><dt>${h._1}</dt><dd>${h._2}</dd><dt>${l._1}</dt><dd>${l._2}</dd></dl>"
    }
  }
}

package exercises

import java.io.{BufferedWriter, File, FileWriter}

import scala.io.Source

object Ch9 {

  def exercise1(path: String): Unit = {
    val lines = Source.fromResource(path).getLines()
    val contents = lines.toList.reverse.mkString("\n")

    val reversedPath = "src/test/resources/ch9/reversed.txt"
    val file = new File(reversedPath)
    val bw = new BufferedWriter(new FileWriter(file))
    bw.write(contents)
    bw.close()
  }

  def exercise3(path: String): Unit = {
    Source
      .fromResource(path)
      .getLines()
      .toList
      .flatMap(l => {
        l.split("\\s").filter(_.length > 12)
      })
      .foreach(println(_))
  }

  def exercise4(path: String): Unit = {
    val contents = Source
      .fromResource(path)
      .getLines()
      .toList
      .head
      .toString
      .split(" ")
      .toList
      .map(_.toFloat)

    val (sum, avg, max, min) =
      (contents.sum, contents.sum / contents.size, contents.max, contents.min)

    println(sum, avg, max, min)
  }

}

package exercises

import java.io.{BufferedWriter, File, FileWriter}

import scala.io.Source

object Ch9 {

  def exercise1(path: String): Unit = {
    val lines = Source.fromResource(path).getLines()
    val contents = lines.toList.reverse.mkString("\n")

    val reversedPath = "src/test/resources/txt/reversed.txt"
    val file = new File(reversedPath)
    val bw = new BufferedWriter(new FileWriter(file))
    bw.write(contents)
    bw.close()
  }

}

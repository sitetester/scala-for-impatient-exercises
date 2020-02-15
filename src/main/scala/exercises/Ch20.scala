package exercises

import java.time.LocalDateTime
import java.time.format.DateTimeFormatter

object Ch20 {

  def exercise3(ints: String): List[Int] = ints.split(", ").map(_.toInt).toList

  def exercise4(date: String): LocalDateTime = {
    val formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss")
    LocalDateTime.parse(date, formatter)
  }

}

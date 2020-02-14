package exercises

import scala.collection.mutable.ListBuffer

object Ch13 {

  def exercise1_indexes(str: String): List[(Char, String)] = {
    var l = List[(Char, List[Int])]()

    for (c <- str) {
      if (!l.exists(_._1 == c)) {
        l = l :+ (c, charCountList(c, str))
      }
    }

    l.map(x => (x._1, "{" + x._2.mkString(",") + "}"))
  }

  def charCountList(c: Char, str: String): List[Int] = {
    val lb = ListBuffer[Int]()

    for ((v, i) <- str.zipWithIndex) {
      if (v == c) {
        lb += i.toInt
      }
    }

    lb.toList
  }

}

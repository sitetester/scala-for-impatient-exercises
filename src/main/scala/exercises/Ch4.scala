package exercises
import java.util.Calendar

import scala.collection.immutable.SortedMap
import scala.collection.mutable

object Ch4 {

  def exercise2(path: String): Unit = {
    val source = io.Source.fromResource(path)

    val wordCount = mutable.LinkedHashMap[String, Int]()

    for (l <- source.getLines()) {
      l.split("\\s+")
        .foreach(w => {
          if (wordCount.contains(w)) {
            wordCount(w) += 1
          } else {
            wordCount(w) = 1
          }
        })
    }

    println(wordCount)
  }

  def exercise3(path: String): Unit = {
    val source = io.Source.fromResource(path)

    var wordCount = SortedMap[String, Int]()

    for (l <- source.getLines()) {
      l.split("\\s+")
        .foreach(w => {
          if (wordCount.contains(w)) {
            wordCount = wordCount.updated(w, wordCount(w) + 1)
          } else {
            wordCount = wordCount + (w -> 1)
          }
        })
    }

    println(wordCount)
  }

  def exercise6(): Unit = {
    val m = mutable.LinkedHashMap[String, Int]()

    m("Monday") = Calendar.MONDAY
    m("Tuesday") = Calendar.TUESDAY
    m("Wednesday") = Calendar.WEDNESDAY
    m("Thursday") = Calendar.THURSDAY
    m("Friday") = Calendar.FRIDAY
    m("Saturday") = Calendar.SATURDAY
    m("Sunday") = Calendar.SUNDAY

    println(m)
  }

  def exercise7(): String = {
    var table = ""
    val props = java.lang.System.getProperties

    var keys = Map[String, Int]()
    props.forEach((k, v) => {
      keys = keys + (k.toString -> k.toString.length)

      val spacing = 30
      val diffSpacing = spacing - k.toString.length
      table += s"$k ${" " * diffSpacing} | $v\n"
    })

    println("Longest key: " + keys.maxBy(_._2) + "\n")
    println(table)

    table
  }

  def exercise8_minMax(xs: Seq[Int]): (Int, Int) = (xs.min, xs.max)

  def exercise9_lteqgt(xs: Array[Int], v: Int): (Int, Int, Int) = {
    (xs.count(_ < v), xs.count(_ == v), xs.count(_ > v))
  }

  def exercise10_zip(s1: String, s2: String): List[(Char, Char)] = {
    s1.zip(s2).toList
  }

}

package exercises

import scala.collection.mutable.ListBuffer

object Ch3 {

  def exercise1(n: Int): Seq[Int] = {
    val r = scala.util.Random
    (0 to r.nextInt(n)).toList
  }

  def exercise2(): Seq[Int] = {
    val a = (1 to 5).toList
    val ints = ListBuffer[Int]()

    for ((v, i) <- a.zipWithIndex if i < (a.length - 1)) {
      if (i % 2 == 0) {
        ints += a(i + 1)
      } else {
        ints += v - 1
      }
    }

    ints += a.last
    ints.toList
  }

  def exercise3(): Seq[Int] = {
    val a = (1 to 5).toList

    var xs = for ((v, i) <- a.zipWithIndex if i < (a.length - 1))
      yield {
        if (i % 2 == 0) {
          a(i + 1)
        } else {
          v - 1
        }
      }

    xs = xs :+ a.last
    xs
  }

  def exercise4(a: Seq[Int]): Seq[Int] = {
    val xs = a.partition(_ > 0)
    xs._1 ++ xs._2
  }

  def exercise5(a: Array[Double]): Double = {
    a.sum / a.length
  }

  def exercise6(a: Seq[Int]): Seq[Int] = {
    a.reverse
  }

  def exercise7(a: Seq[Int]): Seq[Int] = {
    a.distinct
  }

  def exercise8(a: ListBuffer[Int]): Seq[Int] = {

    // one way
    val negatives = a.filter(_ < 0)
    for (n <- negatives.tail.reverse) {
      a.remove(a.indexOf(n))
    }

    // 2nd way
    // val negatives = a.filter(_ < 0).tail
    // a.filter(!negatives.contains(_))
    a
  }

  def exercise10(): Array[String] = {
    val timezones = java.util.TimeZone.getAvailableIDs

    timezones
      .filter(_.startsWith("America/"))
      .map(s => s.substring(s.indexOf('/') + 1))
      .sorted
  }
}

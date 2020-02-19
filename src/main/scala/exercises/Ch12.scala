package exercises

object Ch12 {

  // IDE warns `Replace reduce with max`
  def exercise2(a: Seq[Int]): Int = a.reduceLeft(_ max _)

  def exercise5(x: Int => Int, a: Seq[Int]): Int = {
    a.map(x).max
  }

  def exercise6_largestAt(x: Int => Int, a: Seq[Int]): Int = {
    a.map(x).zipWithIndex.max._2 + 1
  }

  def exercise8_corresponds(s: Seq[String])(a: Seq[Int]): Boolean = {
    s.map(_.length) == a
  }
}

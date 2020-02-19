package exercises

object Ch12 {

  // IDE warns `Replace reduce with max`
  def exercise2(a: Seq[Int]): Int = a.reduceLeft(_ max _)
}

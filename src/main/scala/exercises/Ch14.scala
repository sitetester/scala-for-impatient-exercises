package exercises

object Ch14 {

  def exercise2_swap(n1: Int, n2: Int): (Int, Int) = {
    n1 match {
      case n1 => (n2, n1)
    }
  }

  def exercise3_swap(a: Array[Int]): Array[Int] = {
    a match {
      case a if a.length >= 2 =>
        val s = a.slice(2, a.length)

        val swapped = Array(a(1), a(0))
        if (s.length > 0) {
          val c = swapped ++ s
          return c
        }

        swapped

      case _ => a
    }
  }
}

package exercises

object Ch4 {

  def exercise7(): String = {
    var table = ""
    val props = java.lang.System.getProperties

    props.forEach((k, v) => {
      val spacing = 30
      val diffSpacing = spacing - k.toString.length
      table += s"$k ${" " * diffSpacing} | $v\n"
    })

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

package exercises

object Ch2 {

  def exercise5_countdown(n: Int): Unit = {
    (n to 0 by -1).foreach(println)
  }

  def exercise6(str: String): Unit = {

    // one way
    val longs = for (c <- str) yield c.toLong
    println(longs.product)

    // 2nd way
    println(str.foldLeft(1L)(_ * _.toInt))

    // 3rd way
    var x = 1L
    for (c <- str) yield x *= c.toInt
    println(x)

    // 4th way
    var product = 1L
    for (c <- str) {
      product *= c.toInt
    }
    println(product)

    // 5th way
    println(str.map(_.toLong).product)

    // 6th way
    println(str.foldLeft(1L)(_ * _))

    // 7th way
    println(str.map(_.toLong).reduceLeft(_ * _)) // my IDE warns `Replace reduce with product`

    // 8th way
    println(str.map(_.toLong).scanLeft(1L)(_ * _).last)

    // 9th way
    println(str.map(_.toLong).reduce((x, y) => x * y)) // my IDE warns `Replace reduce with product`
  }

  def exercise9(str: String): Long = {
    var product = str.head.toLong
    if (str.tail.length > 0) {
      product *= exercise9(str.tail)
    }
    product
  }
}

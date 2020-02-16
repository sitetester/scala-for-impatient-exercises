package exercises

object Ch5 {

  def exercise1(): Unit = {
    val c = new Counter()
    c.incrementBy(Int.MaxValue)
      .increment()
      .show()
  }
}

class Counter {
  var value = 0L // must be initialized as LONG to avoid `int overflow`

  def increment(): this.type = {
    value += 1
    this
  }

  def incrementBy(by: Int): this.type = {
    value = by
    this
  }

  def show(): this.type = {
    println(value)
    this
  }
}

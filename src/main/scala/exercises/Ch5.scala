package exercises

object Ch5 {

  def exercise1(): Unit = {
    val c = new Counter()
    c.incrementBy(Int.MaxValue)
      .increment()
      .show()
  }

  def exercise2(): Unit = {
    // using object
    val ba = new BankAccount
    val balance = ba
      .deposit(1000)
      .withdraw(500)
      .balance

    println(balance)

    // without object
    println(
      (new BankAccount)
        .deposit(100)
        .withdraw(10)
        .balance
    )
  }

  def exercise3(): Unit = {
    val time1 = new Time(19, 30)
    val b1 = time1.before(new Time(15, 30))
    println(b1)

    val time2 = new Time(15, 30)
    val b2 = time2.before(new Time(19, 30))
    println(b2)
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

class BankAccount {

  private var _balance = 0L

  def deposit(amount: Long): this.type = {
    _balance += amount
    this
  }

  def withdraw(amount: Long): this.type = {
    _balance -= amount
    this
  }

  def balance: Long = _balance
}

class Time(hrs: Int, min: Int) {

  val time: Int = (hrs.toString + min.toString).toInt

  def before(other: Time): Boolean = {
    val otherTime = (other.hours.toString + other.minutes.toString).toInt

    time < otherTime
  }

  def hours: Int = hrs

  def minutes: Int = min

}

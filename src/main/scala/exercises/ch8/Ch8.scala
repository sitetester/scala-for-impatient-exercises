package exercises.ch8

object Ch8 {

  def exercise1(): Unit = {
    val bankAccount = new BankAccount(100)
    bankAccount.deposit(50)
    bankAccount.withdraw(10)
    println(bankAccount.currentBalance)

    val ca = new CheckingAccount(100)
    ca.deposit(50)
    ca.withdraw(10)
    println(ca.currentBalance)
  }

  def exercise5(): Unit = {
    val point = new Point(3, 4)
    println(point)

    val labeledPoint = new LabeledPoint("some label", 3, 4)
    println(labeledPoint)
  }

  def exercise7(): Unit = {
    // constructs a square with a given corner point and width
    val square1 = new Square(2, 3, 10)
    println(square1)

    // constructs a square with corner (0, 0) and a given width
    val square2 = new Square(10)
    println(square2)

    // constructs a square with corner (0, 0) and width 0
    val square3 = new Square()
    println(square3)
  }

  def exercise11(): Unit = {
    case class Point(x: Int, y: Int)
    println(Point(2, 3))
  }
}

class BankAccount(initialBalance: Double) {

  protected var balance: Double = initialBalance

  def currentBalance: Double = balance

  def deposit(amount: Double): Double = {
    balance += amount
    balance
  }

  def withdraw(amount: Double): Double = {
    balance -= amount
    balance
  }
}

class CheckingAccount(initialBalance: Double)
    extends BankAccount(initialBalance) {

  override def deposit(amount: Double): Double = {
    balance += amount - 1
    balance
  }

  override def withdraw(amount: Double): Double = {
    balance -= amount + 1
    balance
  }
}

class Point(x: Int, y: Int)

class LabeledPoint(label: String, x: Int, y: Int) extends Point(x, y)

class Square(x: Int, y: Int, width: Int, height: Int)
    extends java.awt.Rectangle {

  def this(x: Int, y: Int, width: Int) {
    this(x, y, width, 0)
  }

  override def toString: String = {
    s"${this.x}, ${this.y}, ${this.width}, ${this.height}"
  }

  def this(width: Int) {
    this(0, 0, width, 0)
  }

  def this() {
    this(0, 0, 0, 0)
  }
}

package exercises

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

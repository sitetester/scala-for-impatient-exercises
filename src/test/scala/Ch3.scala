import exercises.Ch3
import org.scalatest.flatspec.AnyFlatSpec

import scala.collection.mutable.ListBuffer

class Ch3 extends AnyFlatSpec {

  it should "exercise1" in {
    val a = Ch3.exercise1(10)
    assert(a.nonEmpty)
    assert(a.head == 0)
    assert(a.last <= 10)
  }

  it should "exercise2" in {
    assert(Ch3.exercise2().nonEmpty)
  }

  it should "exercise3" in {
    assert(Ch3.exercise3().nonEmpty)
  }

  it should "exercise4" in {
    val a = List(-4, 1, 2, 3, -1, 0, -2)
    assert(Ch3.exercise4(a) == List(1, 2, 3, -4, -1, 0, -2))
  }

  it should "exercise5" in {
    val a = Array(1.2, 3.4, 4.5)
    assert(Ch3.exercise5(a) == 3.033333333333333)

    val b = Array(1.2, 1.3, 1.4)
    assert(Ch3.exercise5(b) == 1.3)
  }

  it should "exercise6" in {
    assert(Ch3.exercise6(List(1, 2, 3)) == List(3, 2, 1))
  }

  it should "exercise7" in {
    val a = Ch3.exercise7(List(1, 1, 2, 2, 3))
    assert(a.count(_ == 1) == 1)
    assert(a.count(_ == 2) == 1)
  }

  it should "exercise8" in {
    val a = Ch3.exercise8(ListBuffer(51, -42, 30, -4, 25, -51, 8, 42))
    assert(a == List(51, -42, 30, 25, 8, 42))
  }

  it should "exercise10" in {
    val americanTimezones = Ch3.exercise10()
    assert(americanTimezones.nonEmpty)
    assert(americanTimezones.head.toLowerCase.startsWith("a"))
  }
}

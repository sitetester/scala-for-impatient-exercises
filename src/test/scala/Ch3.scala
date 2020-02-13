import exercises.Ch3
import org.scalatest.flatspec.AnyFlatSpec

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

  it should "exercise6" in {
    assert(Ch3.exercise6(List(1, 2, 3)) == List(3, 2, 1))
  }

  it should "exercise7" in {
    val a = Ch3.exercise7(List(1, 1, 2, 2, 3))
    assert(a.count(_ == 1) == 1)
    assert(a.count(_ == 2) == 1)
  }

  it should "exercise10" in {
    val americanTimezones = Ch3.exercise10()
    assert(americanTimezones.nonEmpty)
    assert(americanTimezones.head.toLowerCase.startsWith("a"))
  }
}

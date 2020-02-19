import exercises.Ch12
import org.scalatest.flatspec.AnyFlatSpec

class Ch12 extends AnyFlatSpec {

  it should "exercise2" in {
    assert(Ch12.exercise2(Array(1, 3, 5, 7, 9)) == 9)
    assert(Ch12.exercise2(Array(10, 30, 50)) == 50)
  }

  it should "exercise5" in {
    assert(Ch12.exercise5(x => 10 * x - x * x, 1 to 10) == 25)
    assert(Ch12.exercise5(x => x * x, 1 to 10) == 100)
    assert(Ch12.exercise5(x => x + x, 1 to 10) == 20)
    assert(Ch12.exercise5(x => scala.math.pow(x, 3).toInt, 1 to 10) == 1000)
  }

  it should "exercise6" in {
    assert(Ch12.exercise6_largestAt(x => 10 * x - x * x, 1 to 10) == 5)
  }
}

import exercises.Ch4
import org.scalatest.flatspec.AnyFlatSpec

class Ch4 extends AnyFlatSpec {

  it should "exercise7" in {
    assert(Ch4.exercise7().nonEmpty)
  }

  it should "exercise8" in {
    assert(Ch4.exercise8_minMax(List(1, 2, 3, 4, 5)) == (1, 5))
    assert(Ch4.exercise8_minMax(List(10, 2, 3, 4, 1)) == (1, 10))
  }

  it should "exercise9" in {
    assert(Ch4.exercise9_lteqgt(Array(4, 1, 2, 3, 4, 5), 4) == (3, 2, 1))
  }
}

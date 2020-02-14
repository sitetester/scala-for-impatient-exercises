import exercises.Ch14
import org.scalatest.flatspec.AnyFlatSpec

class Ch14 extends AnyFlatSpec {

  it should "exercise2_swap" in {
    assert(Ch14.exercise2_swap(1, 2) == (2, 1))
    assert(Ch14.exercise2_swap(10, 5) == (5, 10))
  }

}

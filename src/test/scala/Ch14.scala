import exercises.Ch14
import org.scalatest.flatspec.AnyFlatSpec

class Ch14 extends AnyFlatSpec {

  it should "exercise2_swap" in {
    assert(Ch14.exercise2_swap(1, 2) == (2, 1))
    assert(Ch14.exercise2_swap(10, 5) == (5, 10))
  }

  it should "exercise3_swap" in {

    // returns REVERSED array for length >=2
    assert(Ch14.exercise3_swap(Array(1, 2)) sameElements Array(2, 1))

    assert(Ch14.exercise3_swap(Array(1, 2, 3)) sameElements Array(2, 1, 3))

    assert(
      Ch14.exercise3_swap(Array(1, 2, 3, 4)) sameElements Array(2, 1, 3, 4)
    )

    // returns SAME array otherwise
    assert(Ch14.exercise3_swap(Array(1)) sameElements Array(1))
  }

}

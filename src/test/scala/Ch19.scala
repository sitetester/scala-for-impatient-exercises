import exercises.Ch19
import org.scalatest.flatspec.AnyFlatSpec

class Ch19 extends AnyFlatSpec {

  it should "exercise6" in {
    assert(Ch19.exercise6(Array(1, 3, 5), 5) == Right(2))
    assert(Ch19.exercise6(Array(1, 3, 5), 7) == Left(2))
  }
}

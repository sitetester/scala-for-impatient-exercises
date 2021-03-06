import exercises.{Ch19, Multiplier}
import org.scalatest.flatspec.AnyFlatSpec

class Ch19 extends AnyFlatSpec {

  it should "exercise1" in {
    Ch19.exercise1()
  }

  it should "exercise6" in {
    assert(Ch19.exercise6(Array(1, 3, 5), 5) == Right(2))
    assert(Ch19.exercise6(Array(1, 3, 5), 7) == Left(2))
  }

  it should "exercise8" in {
    val a = Ch19.exercise8_printValues(new Multiplier, 3, 6)
    assert(a == Seq(9, 16, 25, 36))
  }
}

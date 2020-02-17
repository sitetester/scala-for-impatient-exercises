import exercises.Ch6
import org.scalatest.flatspec.AnyFlatSpec

class Ch6 extends AnyFlatSpec {

  it should "exercise1" in {
    assert(Ch6.exercise1_inchesToCentimeters(1) == 2.54)
    assert(Ch6.exercise1_gallonsToLiters(1) == 3.7854)
    assert(Ch6.exercise1_milesToKilometers(1) == 1.60934)
  }
}

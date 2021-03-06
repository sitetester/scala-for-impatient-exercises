import exercises.{Ch6, PlayingCard, Point}
import org.scalatest.flatspec.AnyFlatSpec

class Ch6 extends AnyFlatSpec {

  it should "exercise1" in {
    assert(Ch6.exercise1_inchesToCentimeters(1) == 2.54)
    assert(Ch6.exercise1_gallonsToLiters(1) == 3.7854)
    assert(Ch6.exercise1_milesToKilometers(1) == 1.60934)
  }

  it should "exercise2" in {
    assert(Ch6.exercise2_inchesToCentimeters(1) == 2.54)
    assert(Ch6.exercise2_gallonsToLiters(1) == 3.7854)
    assert(Ch6.exercise2_milesToKilometers(1) == 1.60934)
  }

  it should "exercise4" in {
    assert(Ch6.exercise4().isInstanceOf[Point])
  }

  it should "exercise6" in {
    Ch6.exercise6()
  }

  it should "exercise7" in {
    assert(Ch6.exercise7(PlayingCard.Hearts))
    assert(Ch6.exercise7(PlayingCard.Diamonds))
  }
}

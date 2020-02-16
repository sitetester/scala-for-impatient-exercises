import org.scalatest.flatspec.AnyFlatSpec

class Ch2 extends AnyFlatSpec {

  it should "exercise5" in {
    exercises.Ch2.exercise5_countdown(10)
  }

  it should "exercise6" in {
    exercises.Ch2.exercise6("Hello")
  }
}

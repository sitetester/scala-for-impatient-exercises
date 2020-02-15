import exercises.Ch9
import org.scalatest.flatspec.AnyFlatSpec

class Ch9 extends AnyFlatSpec {

  it should "exercise1" in {
    Ch9.exercise1("ch9/dummy.txt")
  }

  it should "exercise3" in {
    Ch9.exercise3("ch9/dummy.txt")
  }

  it should "exercise4" in {
    Ch9.exercise4("ch9/only_floating_point_numbers.txt")
  }

}

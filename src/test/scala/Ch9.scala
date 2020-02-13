import exercises.Ch9
import org.scalatest.flatspec.AnyFlatSpec

class Ch9 extends AnyFlatSpec {

  it should "exercise1" in {
    Ch9.exercise1("txt/dummy.txt")
  }

  it should "exercise3" in {
    Ch9.exercise3("txt/dummy.txt")
  }

  it should "exercise4" in {
    Ch9.exercise4("txt/only_floating_point_numbers.txt")
  }

}

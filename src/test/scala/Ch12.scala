import exercises.Ch12
import org.scalatest.flatspec.AnyFlatSpec

class Ch12 extends AnyFlatSpec {

  it should "exercise2" in {
    assert(Ch12.exercise2(Array(1, 3, 5, 7, 9)) == 9)
    assert(Ch12.exercise2(Array(10, 30, 50)) == 50)
  }
}

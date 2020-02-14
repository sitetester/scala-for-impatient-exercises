import exercises.Ch13
import org.scalatest.flatspec.AnyFlatSpec

class Ch13 extends AnyFlatSpec {

  it should "exercise1" in {
    val result = Ch13.exercise1_indexes("Mississippi")

    assert(result.head.toString() == "(M,{0})")
    assert(result.filter(_._1 == 'i').head.toString() == "(i,{1,4,7,10})")
    assert(result.last.toString() == "(p,{8,9})")
  }
}

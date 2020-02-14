import exercises.Ch16
import org.scalatest.flatspec.AnyFlatSpec

class Ch16 extends AnyFlatSpec {

  it should "exercise6" in {
    Ch16.exercise6("ch16/exercise6_1.html")
  }

  it should "exercise7" in {
    val m = Map("A" -> "1", "B" -> "2")
    assert(
      Ch16.exercise7(m) == "<dl><dt>A</dt><dd>1</dd><dt>B</dt><dd>2</dd></dl>"
    )

  }
}

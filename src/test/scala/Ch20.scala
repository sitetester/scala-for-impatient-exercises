import java.time.LocalDateTime

import exercises.Ch20
import org.scalatest.flatspec.AnyFlatSpec

class Ch20 extends AnyFlatSpec {

  it should "exercise8" in {
    val date = "2020-02-15 08:15:30"
    assert(Ch20.exercise4(date).isInstanceOf[LocalDateTime])
  }
}

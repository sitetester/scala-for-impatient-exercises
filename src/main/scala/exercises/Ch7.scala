package exercises

import exercises.com.ComExample
import exercises.com.horstmann.impatient.ImpatientExample
import exercises.horstmann.HorstmannExample
import exercises.impatient.ImpatientExample2

object Ch7 {

  def packageScopeDemo(): Unit = {
    ImpatientExample.showPath()

    println()
    ComExample.showPath()
    HorstmannExample.showPath()
    ImpatientExample2.showPath()
  }

}

package exercises

import exercises.ch7.com.ComExample
import exercises.ch7.com.horstmann.impatient.ImpatientExample
import exercises.ch7.horstmann.HorstmannExample
import exercises.ch7.impatient.ImpatientExample2

object Ch7 {

  def packageScopeDemo(): Unit = {
    ImpatientExample.showPath()

    println()
    ComExample.showPath()
    HorstmannExample.showPath()
    ImpatientExample2.showPath()
  }

}

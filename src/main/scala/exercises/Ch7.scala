package exercises

import java.util.{HashMap => JavaHashMap}

import exercises.ch7.com.ComExample
import exercises.ch7.com.horstmann.impatient.ImpatientExample
import exercises.ch7.horstmann.HorstmannExample
import exercises.ch7.impatient.ImpatientExample2

import scala.collection.JavaConversions._
import scala.collection.mutable.{LinkedHashMap => ScalaLinkedHashMap}

object Ch7 {

  def exercise1_packageScopeDemo(): Unit = {
    ImpatientExample.showPath()

    println()
    ComExample.showPath()
    HorstmannExample.showPath()
    ImpatientExample2.showPath()
  }

  def exercise6(): Unit = {

    val capitalCities = new JavaHashMap[String, String]()

    capitalCities.put("England", "London")
    capitalCities.put("Germany", "Berlin")
    capitalCities.put("Norway", "Oslo")
    capitalCities.put("USA", "Washington DC")

    println(capitalCities)

    val scalaMap = ScalaLinkedHashMap[String, String]()
    for (me <- capitalCities.entrySet) {
      scalaMap(me.getKey) = me.getValue
    }

    println(scalaMap)
  }

  def exercise9(): Unit = {
    val name = System.getProperty("user.name")
    println("Name: " + name)

    println("Enter password:")
    val password = scala.io.StdIn.readLine()
    if (password != "secret") {
      Console.err.println("Password is not `secret`")
    } else {
      println("Congrats! Valid password.")
    }
  }
}

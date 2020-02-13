package exercises

object Ch4 {

  def exercise7(): String = {
    var table = ""
    val props = java.lang.System.getProperties

    props.forEach((k, v) => {
      val spacing = 30
      val diffSpacing = spacing - k.toString.length
      table += s"$k ${" " * diffSpacing} | $v\n"
    })

    println(table)

    table
  }
}

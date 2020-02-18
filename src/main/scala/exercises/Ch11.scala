package exercises

import java.nio.file.{Path, Paths}

object Ch11 {

  def exercise9(): Unit = {
    val pathComponents = PathComponentsExtractor(Paths.get("demo/demo.txt"))
    println("after apply, we have - " + pathComponents)

    println("Extracting data using `unapply` method...")
    val (dir, fileName) = (pathComponents.dir, pathComponents.fileName)
    println(dir, fileName)
  }
}

case class PathComponents(var dir: String, fileName: String)

object PathComponentsExtractor {

  def apply(path: Path): PathComponents = {
    PathComponents(path.getParent.toString, path.getFileName.toString)
  }

  def unapply(pathComponents: PathComponents): Some[(String, String)] = {
    Some(pathComponents.dir, pathComponents.fileName)
  }
}

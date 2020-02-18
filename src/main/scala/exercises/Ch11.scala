package exercises

import java.nio.file.{Path, Paths}

object Ch11 {

  def exercise9(): Unit = {
    val pathComponents = PathDirAndFileExtractor(Paths.get("demo/demo.txt"))
    println("after apply, we have - " + pathComponents)

    println("Extracting data using `unapply` method...")
    val (dir, fileName) = (pathComponents.dir, pathComponents.fileName)
    println(dir, fileName)
  }

  def exercise10(): Unit = {
    val pathComponents = PathComponentsExtractor(
      Paths.get("/home/cay/readme.txt")
    )

    println("after apply, we have - " + pathComponents)
    println("Extracting data using `unapply` method...")
    pathComponents.foreach(println(_))
  }
}

case class PathDirAndFile(var dir: String, fileName: String)

case class PathComponents(fileName: Seq[String])

object PathDirAndFileExtractor {

  def apply(path: Path): PathDirAndFile = {
    PathDirAndFile(path.getParent.toString, path.getFileName.toString)
  }

  def unapply(dirAndFile: PathDirAndFile): Some[(String, String)] = {
    Some(dirAndFile.dir, dirAndFile.fileName)
  }
}

object PathComponentsExtractor {

  def apply(path: Path): Seq[String] = {
    var s = path.toString
    if (s.startsWith("/")) {
      s = s.substring(1)
    }

    s.split("/").toSeq
  }

  def unapply(pathComponents: PathComponents): Some[Seq[String]] = {
    Some(pathComponents.fileName)
  }
}

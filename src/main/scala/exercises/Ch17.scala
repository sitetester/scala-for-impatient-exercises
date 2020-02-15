package exercises

import scalaj.http.Http

import scala.collection.mutable.ListBuffer
import scala.concurrent.ExecutionContext.Implicits.global
import scala.concurrent.Future
import scala.io.Source
import scala.util.{Failure, Success}

object Ch17 {

  def exercise9(url: String): Unit = {
    val html = loadUrl(url)

    val pattern = "<a href=\"([/a-z]+)\">[a-z]+<".r

    val links = ListBuffer[String]()
    for (m <- pattern.findAllMatchIn(html)) {
      links += m.group(1)
    }

    // this is just to reduce requests and for debugging/demonstration purpose
    // otherwise, `links` variable is not needed
    val partialLinks = links.take(5)
    val htmlFutures = for (link <- partialLinks) yield {
      {
        val url = "https://cooljugator.com" + link
        fetchServerHeader(url)
      }
    }

    val singleFuture = Future.sequence(htmlFutures)
    singleFuture.onComplete {
      case Success(result) =>
        result.foreach(tuple => {
          println(s"${tuple._1} --- ${tuple._2}")
        })

      case Failure(e) => println(s"Failure. ${e.getMessage}")
    }

    // keep the main thread active while waiting for for launched requests
    // adjust this value as per number of launched requests
    Thread.sleep(5000)
  }

  def loadUrl(url: String): String = {
    val bufferedSource = Source.fromURL(url)
    bufferedSource.getLines().mkString
  }

  def fetchServerHeader(url: String): Future[(String, String)] = Future {
    val header = Http(url)
      .method("HEAD")
      .asString
      .headers("Server")
      .head

    (url, header)
  }

}

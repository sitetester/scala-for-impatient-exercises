package exercises

object Ch19 {

  // TODO: Use an infix type as the return type ?
  def exercise6(a: Array[Int], v: Int): Either[Int, Int] = {
    if (a.contains(v)) {
      Right(a.indexOf(v))
    } else {

      if (v > a.last) {
        return Left(a.indexOf(a.last))
      } else if (v < a.head) {
        return Left(a.indexOf(a.head))
      } else {
        // TODO: replace with binary search for large array to get optimized solution
        for (av <- a) {
          if (av >= v) {
            return Right(a.indexOf(av))
          }
        }
      }

      Left(-1)
    }
  }
}

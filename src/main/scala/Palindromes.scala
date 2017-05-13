
object Palindromes {

  def main(args: Array[String]): Unit = {
    val textToCheck = "abbaab"
    val preparedText = prepare(textToCheck)
    val p = new Array[Int](preparedText.length)
    var center = 0
    var right = 0
    for (i <- 1 until preparedText.length) {
      val mirror = 2 * center - i
      if (i < right)
        p(i) = math.min(right - i, p(mirror))

      while (preparedText.charAt(i + (1 + p(i))) == preparedText.charAt(i - (1 + p(i))))
        p(i) += 1

      if (i + p(i) > right) {
        center = i
        right = i + p(i)
      }
    }

    for (el <- p)
      println(el)
  }

  def prepare(textToCheck: String) : Array[Char] = {
    new Array[Char](10)
  }

}

object Solution {
  def solution(s: String): Int = {
    val preparedText = prepare(s)
    val p = new Array[Int](preparedText.length)
    var center = 0
    var right = 0
    for (i <- 1 until preparedText.length - 1) {
      val mirror = 2 * center - i
      if (i < right)
        p(i) = math.min(right - i, p(mirror))

      while (preparedText(i + (1 + p(i))) == preparedText(i - (1 + p(i))))
        p(i) += 1

      if (i + p(i) > right) {
        center = i
        right = i + p(i)
      }
    }

    def printAlgoOutput = {
      for (el <- preparedText.indices) {
        print(preparedText(el))
      }
      println()
      for (el <- preparedText.indices) {
        print(p(el))
      }
      println()
    }

//    printAlgoOutput

    countPalindromes(p)
  }

  def prepare(textToCheck: String) : Array[Char] = {
    val preparedArray = new Array[Char](2 * textToCheck.length + 3)
    preparedArray(0) = '$'
    preparedArray(2 * textToCheck.length + 2) = '@'
    for (i <- 0 until textToCheck.length) {
      preparedArray(2 * i + 1) = '#'
      preparedArray(2 * i + 2) = textToCheck.charAt(i)
    }
    preparedArray(2 * textToCheck.length + 1) = '#'

    preparedArray
  }

  def countPalindromes(palindromes: Array[Int]) : Int = {
    var count = 0
    for (i <- palindromes.indices) {
      count += palindromes(i) / 2
    }

    count
  }

}

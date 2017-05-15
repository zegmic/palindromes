
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

    countPalindromes(p)
  }

  def prepare(textToCheck: String) : Array[Char] = {
    val mappedChars = textToCheck.flatMap(char => Array('#', char))
    val preparedText = '$' + mappedChars + "#@"
    preparedText.toCharArray
  }

  def countPalindromes(palindromes: Array[Int]) : Int = {
    palindromes.reduceLeft((total, element) => total + element / 2)
  }
}

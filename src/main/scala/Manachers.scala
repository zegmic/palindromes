
class Manachers(s: String) {
  val preparedText = prepare(s)
  val p = new Array[Int](preparedText.length)
  var center = 0
  var right = 0
  var i = 1

  def countPalindromes() = {
    while (indexWithinText) {
      if (indexWithinRightBoundary) {
        setLocalPalindromeLengthToMinFromMirrorOrBoundaryIndexBased()
      }

      while (localPalindromeExpands()) {
        increaseLocalPalindromeLength()
      }

      if (localPalindromeOutsideRight()) {
        updateCenterAndRightBoundary()
      }

      proceedWithNextPosition()
    }

    countTotalNumberOfPalindromes()
  }

  private def proceedWithNextPosition() = {
    i += 1
  }

  private def setLocalPalindromeLengthToMinFromMirrorOrBoundaryIndexBased() = {
    p(i) = math.min(right - i, p(mirror))
  }

  private def indexWithinRightBoundary = {
    i < right
  }

  private def increaseLocalPalindromeLength() = {
    p(i) += 1
  }

  private def updateCenterAndRightBoundary() = {
    center = i
    right = i + p(i)
  }

  private def indexWithinText = {
    i < preparedText.length - 1
  }

  private def mirror = 2 * center - i

  private def localPalindromeOutsideRight() = {
    i + p(i) > right
  }

  private def localPalindromeExpands() = {
    preparedText(i + (1 + p(i))) == preparedText(i - (1 + p(i)))
  }

  private def prepare(textToCheck: String) : Array[Char] = {
    val mappedChars = textToCheck.flatMap(char => Array('#', char))
    val preparedText = '$' + mappedChars + "#@"
    preparedText.toCharArray
  }

  private def countTotalNumberOfPalindromes() : Int = {
    p.reduceLeft((total, element) => total + element / 2)
  }


}

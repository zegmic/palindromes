import org.scalatest._

class SolutionSpec extends FlatSpec with Matchers {
  "Solution" should "return no palindromes in an empty string" in {
    val empty = ""
    val palindromesCount = Solution.solution(empty)
    palindromesCount should be (0)
  }

  it should "return no palindromes in a single char string" in {
    val empty = "a"
    val palindromesCount = Solution.solution(empty)
    palindromesCount should be (0)
  }

  it should "return one palindrome in a double char string" in {
    val empty = "aa"
    val palindromesCount = Solution.solution(empty)
    palindromesCount should be (1)
  }

  it should "return one palindrome in a odd number of chars string" in {
    val empty = "aba"
    val palindromesCount = Solution.solution(empty)
    palindromesCount should be (1)
  }

  it should "return two palindromes in found chars string" in {
    val empty = "abba"
    val palindromesCount = Solution.solution(empty)
    palindromesCount should be (2)
  }

  it should "return correct number of palindromes for a longer string" in {
    val empty = "abaabc"
    val palindromesCount = Solution.solution(empty)
    assert(palindromesCount == 3)
  }

}

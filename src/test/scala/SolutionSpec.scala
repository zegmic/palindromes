import org.scalatest._

class SolutionSpec extends FlatSpec {
  "Solution" should "return no palindromes in an empty string" in {
    val empty = ""
    val palindromesCount = Solution.solution(empty)
    assert(palindromesCount == 0)
  }

  it should "return no palindromes in a single char string" in {
    val empty = "a"
    val palindromesCount = Solution.solution(empty)
    assert(palindromesCount == 0)
  }

  it should "return one palindrome in a double char string" in {
    val empty = "aa"
    val palindromesCount = Solution.solution(empty)
    assert(palindromesCount == 1)
  }

  it should "return one palindrome in a odd number of chars string" in {
    val empty = "aba"
    val palindromesCount = Solution.solution(empty)
    assert(palindromesCount == 1)
  }

  it should "return two palindromes in found chars string" in {
    val empty = "abba"
    val palindromesCount = Solution.solution(empty)
    assert(palindromesCount == 2)
  }

}
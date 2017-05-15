import org.scalatest._

class SolutionSpec extends FlatSpec with Matchers {
  "Solution" should "calculate no palindromes in an empty string" in {
    val empty = ""
    val palindromesCount = Solution.solution(empty)
    palindromesCount should be (0)
  }

  it should "calculate no palindromes in a single char string" in {
    val empty = "a"
    val palindromesCount = Solution.solution(empty)
    palindromesCount should be (0)
  }

  it should "calculate one palindrome in a double char string" in {
    val empty = "aa"
    val palindromesCount = Solution.solution(empty)
    palindromesCount should be (1)
  }

  it should "calculate one palindrome in a odd number of chars string" in {
    val empty = "aba"
    val palindromesCount = Solution.solution(empty)
    palindromesCount should be (1)
  }

  it should "calculate two palindromes in found chars string" in {
    val empty = "abba"
    val palindromesCount = Solution.solution(empty)
    palindromesCount should be (2)
  }

  it should "calculate correct number of palindromes for a longer string" in {
    val empty = "abaabc"
    val palindromesCount = Solution.solution(empty)
    palindromesCount should be (3)
  }

  it should "calculate correct number of palindromes for a more complicated string" in {
    val empty = "abaabcbaaab"
    val palindromesCount = Solution.solution(empty)
    palindromesCount should be (10)
  }

  it should "calculate correct number of palindromes for a string based on already tested string" in {
    val empty = "abaabcbaaabaa"
    val palindromesCount = Solution.solution(empty)
    palindromesCount should be (13)
  }

  it should "calculate correct number of palindromes for an even more complicated string" in {
    val empty = "abaabcbaaabdd"
    val palindromesCount = Solution.solution(empty)
    palindromesCount should be (11)
  }

  it should "calculate correct number of palindromes for a string that contains already tested string" in {
    val empty = "abaabcbaaabddb"
    val palindromesCount = Solution.solution(empty)
    palindromesCount should be (12)
  }

  it should "calculate no palindromes in a longer string" in {
    val empty = "abcdefghijklmnoprstuwyz"
    val palindromesCount = Solution.solution(empty)
    palindromesCount should be (0)
  }

}

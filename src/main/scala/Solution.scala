
object Solution {
  def solution(s: String): Int = {
    if (s.length > 100000000) {
      return -1
    }

    new Manachers(s).countPalindromes()
  }

}

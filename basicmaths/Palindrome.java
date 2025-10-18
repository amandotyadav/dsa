package basicmaths;

public class Palindrome {
  static boolean isPalindrome(int n) {
    int revNum = 0, temp = n, digit;
    while (temp > 0) {
      digit = temp % 10;
      revNum = (revNum * 10) + digit;
      temp = temp / 10;
    }
    return revNum == n;
  }

  public static void main(String[] args) {
    System.out.println(isPalindrome(123));
  }
}

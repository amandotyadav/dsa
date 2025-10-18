package basicmaths;

public class ReverseNumber {
  static int reverseNumber(int n) {
    int revNum = 0, ld;
    boolean isPos;
    if (n < 0) {
      isPos = false;
      n = Math.abs(n);
    } else {
      isPos = true;
    }

    while (n > 0) {
      ld = n % 10;
      revNum = (revNum * 10) + ld;
      n = n / 10;
    }

    return isPos ? revNum : -revNum;
  }

  public static void main(String[] args) {
    System.out.println(reverseNumber(-345));
  }
}
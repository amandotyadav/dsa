package basicmaths;

public class CountDigits {
  static int method1(int n) {
    int count = 0;
    while (n > 0) {
      count++;
      n /= 10;
    }
    return count;
  }

  static int method2(int n) {
    int count = (int) (Math.log10(n) + 1);
    return count;
  }

  static void extractDigits(int n) {
    int digit;
    while (n > 0) {
      digit = n % 10;
      System.out.println(digit);
      n /= 10;
    }
  }

  public static void main(String[] args) {
    extractDigits(2523);
  }
}

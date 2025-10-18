package basicmaths;

public class GCD {
  // Euclidean algorithm = gcd(num1, num2) is equal to gcd(num1 - num2, num2) or
  // more efficiently gcd(num1 % num2, num2) where num1 > num2
  static int calculateGcd(int num1, int num2) {
    while (num1 > 0 && num2 > 0) {
      if (num1 > num2)
        num1 = num1 % num2;
      else
        num2 = num2 % num1;
    }

    if (num1 == 0)
      return num2;
    return num1;
  }

  public static void main(String[] args) {
    System.out.println(calculateGcd(12, 9));
  }
}

package basicmaths;

public class Prime {
  static boolean isPrime(int n) {
    int count = 0;
    for (int i = 1; i * i <= n; i++) {
      if (n % i == 0) {
        count++;
        if ((n / i) != i)
          count++;
      }
    }
    return count == 2;
  }

  public static void main(String[] args) {
    System.out.println(isPrime(-7));
  }
}

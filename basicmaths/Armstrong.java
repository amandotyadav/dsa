package basicmaths;

public class Armstrong {
  static boolean isArmstrong(int n) {
    if (n < 0)
      return false;
    if (n == 0)
      return true;

    int totalDigits = (int) (Math.log10(n) + 1);
    int digit, armNum = 0, temp = n;
    while (temp > 0) {
      digit = temp % 10;
      armNum = armNum + (int) Math.pow(digit, totalDigits);
      temp = temp / 10;
    }
    return armNum == n;
  }
}

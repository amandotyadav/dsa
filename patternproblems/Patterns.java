package patternproblems;

import java.util.*;

public class Patterns {
  // Rectangular Star Pattern
  static void pattern1(int n) {
    for (int i = 0; i < n; i++) {
      for (int j = 0; j < n; j++) {
        System.out.print("*");
      }
      System.out.println();
    }
  }

  // Right-Angled Triangle Pattern
  static void pattern2(int n) {
    for (int i = 0; i < n; i++) {
      for (int j = 0; j <= i; j++) {
        System.out.print("*");
      }
      System.out.println();
    }
  }

  // Right-Angled Number Pyramid
  static void pattern3(int n) {
    for (int i = 0; i < n; i++) {
      for (int j = 0; j <= i; j++) {
        System.out.print(j + 1 + " ");
      }
      System.out.println();
    }
  }

  // Right-Angled Number Pyramid - II
  static void pattern4(int n) {
    for (int i = 0; i < n; i++) {
      for (int j = 0; j <= i; j++) {
        System.out.print(i + 1 + " ");
      }
      System.out.println();
    }
  }

  // Inverted Right Pyramid
  static void pattern5(int n) {
    for (int i = 1; i <= n; i++) {
      for (int j = 1; j <= n - i + 1; j++) {
        System.out.print("* ");
      }
      System.out.println();
    }
  }

  // Inverted Numbered Right Pyramid
  static void pattern6(int n) {
    for (int i = 1; i <= n; i++) {
      for (int j = 1; j <= n - i + 1; j++) {
        System.out.print(j + " ");
      }
      System.out.println();
    }
  }

  // Star Pyramid
  static void pattern7(int n) {
    for (int i = 1; i <= n; i++) {
      for (int j = 1; j <= n - i; j++) {
        System.out.print(" ");
      }
      for (int j = 1; j <= 2 * i - 1; j++) {
        System.out.print("*");
      }
      System.out.println();
    }
  }

  // Inverted Star Pyramid
  static void pattern8(int n) {
    for (int i = 1; i <= n; i++) {
      for (int j = 1; j < i; j++) {
        System.out.print(" ");
      }
      for (int j = 1; j <= (2 * (n - i) + 1); j++) {
        System.out.print("*");
      }
      System.out.println();
    }
  }

  // Diamond Star Pattern
  static void pattern9(int n) {
    pattern7(n);
    pattern8(n);
  }

  // Half Diamond Star Pattern
  static void pattern10(int n) {
    for (int i = 1; i <= 2 * n - 1; i++) {
      int stars = i > n ? (2 * n - i) : i;

      for (int j = 1; j <= stars; j++) {
        System.out.print("*");
      }
      System.out.println();
    }
  }

  // Binary Number Triangle Pattern
  static void pattern11(int n) {
    int flag;
    for (int i = 1; i <= n; i++) {
      flag = i % 2 == 0 ? 0 : 1;
      for (int j = 1; j <= i; j++) {
        System.out.print(flag);
        flag = 1 - flag;
      }
      System.out.println();
    }
  }

  // Number Crown Pattern
  static void pattern12(int n) {
    for (int i = 1; i <= n; i++) {
      for (int j = 1; j <= i; j++) {
        System.out.print(j);
      }
      for (int j = 1; j <= 2 * n - 2 * i; j++) {
        System.out.print(" ");
      }
      for (int j = i; j >= 1; j--) {
        System.out.print(j);
      }
      System.out.println();
    }
  }

  // Increasing Number Triangle Pattern
  static void pattern13(int n) {
    int counter = 1;
    for (int i = 1; i <= n; i++) {
      for (int j = 1; j <= i; j++) {
        System.out.print(counter + " ");
        counter++;
      }
      System.out.println();
    }
  }

  // Increasing Letter Triangle Pattern
  static void pattern14(int n) {
    char ch;
    for (int i = 1; i <= n; i++) {
      ch = 'A';
      for (int j = 1; j <= i; j++) {
        System.out.print(ch);
        ch++;
      }
      System.out.println();
    }
  }

  // Reverse Letter Triangle Pattern
  static void pattern15(int n) {
    char ch;
    for (int i = 1; i <= n; i++) {
      ch = 'A';
      for (int j = 1; j <= n - i + 1; j++) {
        System.out.print(ch);
        ch++;
      }
      System.out.println();
    }
  }

  // Alpha-Ramp Pattern
  static void pattern16(int n) {
    char ch;
    ch = 'A';
    for (int i = 1; i <= n; i++) {
      for (int j = 1; j <= i; j++) {
        System.out.print(ch);
      }
      ch++;
      System.out.println();
    }
  }

  // Alpha-Hill Pattern
  static void pattern17(int n) {
    for (int i = 1; i <= n; i++) {
      for (int j = 1; j <= n - i; j++) {
        System.out.print(" ");
      }
      char start = 'A';
      for (int j = 1; j <= 2 * i - 1; j++) {
        System.out.print(start);
        start = j < i ? ++start : --start;
      }
      System.out.println();
    }
  }

  // Alpha-Triangle Pattern
  static void pattern18(int n) {
    char ch = 'E';
    for (int i = 1; i <= n; i++) {
      for (int j = 1; j <= i; j++) {
        System.out.print(ch);
        ch++;
      }
      System.out.println();
      ch = (char) ('E' - i);
    }
  }

  // Symmetric-Void Pattern
  static void pattern19(int n) {
    for (int i = 1; i <= n; i++) {
      for (int j = 1; j <= n - i + 1; j++) {
        System.out.print("*");
      }

      for (int j = 1; j <= 2 * i - 2; j++) {
        System.out.print(" ");
      }

      for (int j = 1; j <= n - i + 1; j++) {
        System.out.print("*");
      }
      System.out.println();
    }

    for (int i = 1; i <= n; i++) {
      for (int j = 1; j <= i; j++) {
        System.out.print("*");
      }

      for (int j = 1; j <= 2 * n - 2 * i; j++) {
        System.out.print(" ");
      }

      for (int j = 1; j <= i; j++) {
        System.out.print("*");
      }
      System.out.println();
    }
  }

  // Symmetric-Butterfly Pattern
  static void pattern20(int n) {
    for (int i = 1; i <= n; i++) {
      for (int j = 1; j <= i; j++) {
        System.out.print("*");
      }

      for (int j = 1; j <= 2 * n - 2 * i; j++) {
        System.out.print(" ");
      }

      for (int j = 1; j <= i; j++) {
        System.out.print("*");
      }
      System.out.println();
    }

    for (int i = 1; i < n; i++) {
      for (int j = 1; j <= n - i; j++) {
        System.out.print("*");
      }

      for (int j = 1; j <= 2 * i; j++) {
        System.out.print(" ");
      }

      for (int j = 1; j <= n - i; j++) {
        System.out.print("*");
      }
      System.out.println();
    }
  }

  // Hollow Rectangle Pattern
  static void pattern21(int n) {
    for (int i = 1; i <= n; i++) {
      for (int j = 1; j <= n; j++) {
        if (i == 1 || i == n || j == 1 || j == n) {
          System.out.print("*");
        } else {
          System.out.print(" ");
        }
      }
      System.out.println();
    }
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    pattern2(n);
    sc.close();
  }
}
package org.dt;

import java.util.Scanner;

public class InverseInteger {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int number = scanner.nextInt();
    int res = 0;
    for (int i = 1; i <= 5; i++) {
      int div = 10;
      int val = number % div;
      number /= div;
      for (int j = 1; j <= val - 1; j++) {
        if (val == 2 || j == 1) {
          continue;
        }
        div *= 10;
      }
      if (val == 1) {
        div = 1;
      }
      res += i * div;
    }
    System.out.println(res);
  }
}

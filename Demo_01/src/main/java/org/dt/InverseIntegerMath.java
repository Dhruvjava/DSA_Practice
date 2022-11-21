package org.dt;

import java.util.Scanner;

public class InverseIntegerMath {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int number = scanner.nextInt();
    int r = 1;
    int sum = 0;
    while (number > 0) {
      int val = number % 10;
      number /= 10;
      sum =sum+ r * (int) Math.pow(10, val - 1);
      r++;
    }
    System.out.println(sum);
  }

}

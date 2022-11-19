package org.dt;

import java.util.Scanner;

public class ReverseInteger {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int number = scanner.nextInt();
//    int[] num=new int[];
    int divider = 1;
    int temp=number;
    while (temp > 10) {
      temp /= 10;
      divider *= 10;
    }
    while (divider >= 1) {
      int value = number / divider;
      number %= divider;
      System.out.println(value);
      divider /= 10;
    }
  }
}

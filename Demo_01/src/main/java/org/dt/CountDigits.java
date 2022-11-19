package org.dt;

import java.util.Scanner;

public class CountDigits {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    long number = scanner.nextLong();// for long values
    //int number=scanner.nextInt();
    int flag = 0;
    while (number != 0) {
      number /= 10;
      flag++;
    }
    System.out.println(flag);
  }

}

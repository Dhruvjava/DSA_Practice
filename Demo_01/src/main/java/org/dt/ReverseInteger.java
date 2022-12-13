package org.dt;

import java.util.Scanner;

public class ReverseInteger {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int number = scanner.nextInt();
    long temp = 0;
    while (number !=0){
      temp = temp *10+number%10;
      number/=10;
    }
    if (temp > Integer.MAX_VALUE || temp < Integer.MIN_VALUE)
      return;
    System.out.println((int)temp);
  }
}

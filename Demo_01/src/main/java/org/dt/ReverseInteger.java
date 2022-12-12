package org.dt;

import java.util.Scanner;

public class ReverseInteger {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int number = scanner.nextInt();
    int temp = 0;
    int i = 0;
    int test=number;
    while(test> 10){
      test =test/10;
      i ++;
    }
    while (number > 0){
      int n= number%10;
      number /=10;
      temp += n*(int) Math.pow(10,i);
      i--;
    }
    System.out.println(temp);
  }
}

package org.dt;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class NumberIsPrime {

  public static void main(String[] args) throws IOException {
    InputStreamReader isr = new InputStreamReader(System.in);
    BufferedReader reader = new BufferedReader(isr);
    int number = Integer.parseInt(reader.readLine());
    int div = 2;
    boolean isPrime = true;
    while (div * div <= number) {
      int rem = number % div;
      if (rem == 0) {
        isPrime = false;
        break;
      }
      div++;
    }
    if (isPrime) {
      System.out.println(number + " is prime");
    } else {
      System.out.println(number + " is not prime");
    }
  }
}


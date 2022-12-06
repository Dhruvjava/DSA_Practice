package org.dt;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Check2toNumberIsPrimes {

  public static void main(String[] args) throws IOException {
    InputStreamReader isr = new InputStreamReader(System.in);
    BufferedReader reader = new BufferedReader(isr);
    int number = Integer.parseInt(reader.readLine());
    for (int i = 2; i <= number; i++) {
      int div = 2;
      boolean isPrime = true;
      while (div * div <= i) {
        int rem = i % div;
        if (rem == 0) {
          isPrime = false;
          break;
        }
        div++;
      }
      if (isPrime) {
        System.out.println(i + " is prime");
      } else {
        System.out.println(i + " is not prime");
      }
    }
  }
}



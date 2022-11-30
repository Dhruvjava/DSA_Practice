package org.dt;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class OddEvenNumberCheck {

  public static void main(String[] args) throws IOException {
    InputStreamReader isr = new InputStreamReader(System.in);
    BufferedReader reader = new BufferedReader(isr);
    int number = Integer.parseInt(reader.readLine());
    int i = 1;
    while (i <= number) {
      int rem = i % 2;
      if (rem == 0) {
        System.out.println(i + " is even");
      } else {
        System.out.println(i + " is odd");
      }
      i++;
    }
  }
}

package org.dt;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class RotateInteger {

  public static void main(String[] args) throws IOException {
    InputStreamReader isr = new InputStreamReader(System.in);
    BufferedReader reader = new BufferedReader(isr);
    int n = Integer.parseInt(reader.readLine());
    int k = Integer.parseInt(reader.readLine());
    int i = 0;
    int test = n;
    while (test > 0) {
      test /= 10;
      i++;
    }
    if (k >= i) {
      k = k % i;
    }
    int divider = (int) Math.pow(10, k);
    System.out.println(k);
    int result = n / divider;
    int remender = n % divider;
    int rotationalVal = (int) (remender * Math.pow(10, (i - k)));
    System.out.println(rotationalVal + result);
  }

}

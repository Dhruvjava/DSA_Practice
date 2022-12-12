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
    int divider = 1;
    int i = 0;
    int test = n;
    int divtest = k;
    while (divtest > 0) {
      divider *= 10;
      divtest--;
    }
    while (test > 0) {
      test /= 10;
      i++;
    }
    int q = n / divider;
    int r = n % divider;
    int ch = (int) (r * Math.pow(10, (i - k)));
    System.out.println(ch + q);
  }

}

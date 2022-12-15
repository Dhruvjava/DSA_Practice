package org.dt;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PrimeFactor {

  public static void main(String[] args) throws IOException {
    InputStreamReader isr = new InputStreamReader(System.in);
    BufferedReader reader = new BufferedReader(isr);
    int n = Integer.parseInt(reader.readLine());
    primeFactors(n);
  }

  public static void primeFactors(int n) {
    int nf=n;
    for (int i = 2; i * i <= n; i++) {
      while (nf % i == 0) {
        nf /= i;
        System.out.println(i);
      }
    }
  }
}

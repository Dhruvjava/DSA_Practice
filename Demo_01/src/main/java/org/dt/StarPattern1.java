package org.dt;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class StarPattern1 {

  public static void main(String[] args) throws IOException {
    InputStreamReader isr = new InputStreamReader(System.in);
    BufferedReader reader = new BufferedReader(isr);
    int n = Integer.parseInt(reader.readLine());
    for (int i = 0; i < n; i++) {
      for (int j = 0; j <= i * 2; j++) {
        System.out.print("* ");
      }
      System.out.println();
    }
  }
}

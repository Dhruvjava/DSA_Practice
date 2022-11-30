package org.dt;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Test {

  public static void main(String[] args) throws Exception{
    InputStreamReader reader = new InputStreamReader(System.in);
    BufferedReader read = new BufferedReader(reader);
    Integer name = Integer.parseInt(read.readLine());
    System.out.println(name);
  }
}

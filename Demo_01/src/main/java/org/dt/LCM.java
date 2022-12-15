package org.dt;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class LCM {
    public static void main(String[] args) throws IOException {
    InputStreamReader isr= new InputStreamReader(System.in);
    BufferedReader reader= new BufferedReader(isr);
    int x=Integer.parseInt(reader.readLine());
    int y=Integer.parseInt(reader.readLine());
    int result = getGcd(x,y);
    int lcm = (x*y)/result;
    System.out.println("LCM of the given number is :"+lcm);
  }
    public static int getGcd(int x, int y) {
    int result = 0;
    while (y !=0){
      result=y;
      int remainder=x%y;
      x=y;
      y=remainder;
    }
    return result;
  }
}

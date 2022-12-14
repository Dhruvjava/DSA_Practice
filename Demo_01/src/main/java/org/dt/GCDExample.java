package org.dt;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class GCDExample {

  public static void main(String[] args) throws IOException {
    InputStreamReader isr= new InputStreamReader(System.in);
    BufferedReader reader= new BufferedReader(isr);
    int x=Integer.parseInt(reader.readLine());
    int y=Integer.parseInt(reader.readLine());
    int result;
//    if (x > y) {
//      result=getGcd(y,x);
//    }
//    else {
//      result=getGcd(x,y);
//    }
//    System.out.println(result);

    result = getGcd(x,y);
    System.out.println("GCD of the given number is :"+result);

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

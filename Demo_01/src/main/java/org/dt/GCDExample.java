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
    System.out.println(result);

  }
  public static int getGcd(int less, int greater) {
    int result = 0;
    int remainder=less;
    while (remainder !=0){
      result=less;
      remainder=greater%less;
      greater=less;
      less=remainder;
    }
    return result;
  }
}

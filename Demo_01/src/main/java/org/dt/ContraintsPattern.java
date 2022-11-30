package org.dt;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ContraintsPattern {

  public static void main(String[] args) throws IOException {
    InputStreamReader isr = new InputStreamReader(System.in);
    BufferedReader reader = new BufferedReader(isr);
    int n=Integer.parseInt(reader.readLine());
    for (int i = 0;i<n;i++){
      int start = 65;
      for (int j=0;j<=i*2;j++){
        if (j>i){
          start--;
        }
        if(j<=i && j != 0){
          start++;
        }
        System.out.print((char)start);
      }
      System.out.println();
    }
  }

}

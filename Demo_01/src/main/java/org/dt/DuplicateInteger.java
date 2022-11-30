package org.dt;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class DuplicateInteger {

  public static void main(String[] args) throws IOException {
    InputStreamReader ISR = new InputStreamReader(System.in);
    BufferedReader reader = new BufferedReader(ISR);
    int n = Integer.parseInt(reader.readLine());
    int[] arr = new int[n];
    for (int i=0;i<n;i++){
      arr[i] = Integer.parseInt(reader.readLine());
    }

    duplicate(arr, n);
  }

  private static void duplicate(int[] arr, int n) {
    for (int i = 0; i<n;i++){
      boolean duplicate=false;
      for (int j= i+1;j<n;j++){
        if (arr[i] == arr[j] && arr[j] >=0){
          arr[j] = -1;
          duplicate=true;
        }
      }
      if (duplicate){
        System.out.print(arr[i]+" ");
      }
    }
  }

}

package org.dt;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class AddTwoNumEqualTarget {

  public static void main(String[] args) throws IOException {
    InputStreamReader isr = new InputStreamReader(System.in);
    BufferedReader reader = new BufferedReader(isr);
    int length = Integer.parseInt(reader.readLine());
    int[] array = new int[length];
    for (int i = 0; i < length; i++) {
      array[i] = Integer.parseInt(reader.readLine());
    }
    int targetSum = Integer.parseInt(reader.readLine());
    int[] result=targetSum(array, targetSum);
    for (int num : result){
      System.out.print(num+" ");
    }
  }

  private static int[] targetSum(int[] array, int targetSum) {
    Set<Integer> set=new HashSet<>();
    for (int num : array){
      int sum = targetSum - num;
      if(set.contains(sum)){
        return new int[]{sum, num};
      }
      set.add(num);
    }
    return new int[0];
  }
}

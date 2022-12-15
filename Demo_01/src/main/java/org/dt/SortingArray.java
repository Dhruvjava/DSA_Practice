package org.dt;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SortingArray {

  public static void main(String[] args) throws IOException {
    InputStreamReader isr = new InputStreamReader(System.in);
    BufferedReader reader = new BufferedReader(isr);
    int len = Integer.parseInt(reader.readLine());
    int[] array = new int[len];
    for (int i=0; i<len; i++) {
      array[i] = Integer.parseInt(reader.readLine());
    }
    int[] sortArray = sort(array, len);

    for (int i=0; i<len; i++) {
      System.out.print(sortArray[i] + " ");
    }
  }

  public static int[] sort(int[] array, int len) {
    int temp;
    int p = 0;
    for (int i = 0; i < len; i++) {
      temp = array[i];
      for (int j = i+1; j < len; j++) {
        if (temp > array[j]) {
          temp = array[j];
          p = j;
        }
      }
      array[p] = array[i];
      array[i] = temp;
    }
    return array;
  }
}

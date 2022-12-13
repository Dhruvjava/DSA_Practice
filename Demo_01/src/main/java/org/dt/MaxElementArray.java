package org.dt;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MaxElementArray {

  public static void main(String[] args) throws IOException {
    InputStreamReader isr = new InputStreamReader(System.in);
    BufferedReader reader=new BufferedReader(isr);
    int size=Integer.parseInt(reader.readLine());
    int[] array=new int[size];
    for (int i=0;i<size;i++)
      array[i]=Integer.parseInt(reader.readLine());
    int maxElement=maxElement(array);
        System.out.println(maxElement);
  }

  public static int maxElement(int[] array){
    int maxElement=0;
    for (int i=0;i<array.length;i++)
      if (maxElement<array[i])
        maxElement=array[i];
    return maxElement;
  }
}

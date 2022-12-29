package org.dt;

public class Sortn_1SortedArray {

  public static void main(String[] args) {

    int[] arr={2,3,4,6,7,8,9,10,15,1};
    int[] sorted=sort(arr);
    for(int i : sorted){
      System.out.print(i +" ");
    }

  }

  public static int[] sort(int[] arr) {
    int n = arr.length-1;
    for (int i = n; i > 0; i--) {
      int temp = arr[i];
      if (arr[i] < arr[i - 1]) {
        arr[i] = arr[i - 1];
        arr[i - 1] = temp;
      }
    }
    return arr;
  }

}

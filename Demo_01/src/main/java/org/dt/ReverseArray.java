package org.dt;

public class ReverseArray {

  public static void main(String[] args) {
  int[] array = new int[]{1,2,3,4,5,0,8,12,16,1};
  int[] reversed  = reverse(array);
  for (int i : reversed){
    System.out.print(i +" ");
  }
  }
  public static int[] reverse(int[] array){
    int n=array.length-1;
    for (int i =0;i<=n;i++){
      if (i ==n){
        break;
      }
      int temp=array[n];
      array[n] = array[i];
      array[i] = temp;
      n--;
    }
    return array;
  }
}

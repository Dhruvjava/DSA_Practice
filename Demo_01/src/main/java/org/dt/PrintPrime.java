package org.dt;

import java.util.Scanner;

public class PrintPrime {

  public static void main(String[] args) {
    Scanner sc= new Scanner(System.in);
    int low=sc.nextInt();
    int hight=sc.nextInt();

    for(int n=low;n<= hight; n++){
      boolean isPrime=true;
      int div=2;
      while(div*div <= n){
        if(n%div == 0){
          isPrime=false;
        }
        div++;
      }
      if(isPrime){
        System.out.println(n);
      }
    }
  }
}
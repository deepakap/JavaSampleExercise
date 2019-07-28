/**
 * 
 */
package com.algos;

/**
 * @author deepa
 *
 */
import java.util.Arrays;

class NewMain {
  public static void main(String[] args) {
    System.out.println("Fibonaci series search");
    // eg : Fibonaci of 6 = 1,1,2,3,5,8,13 ......

    fnPrintFibonacyNUmbers(10);
  }

  public static void fnPrintFibonacyNUmbers(int num){

      int[] fib = new int[num+1];

      if(num==0){System.out.println(" fib : 0");}
      int j=0;
      int k=1;
      fib[0]=1;
      fib[1]=1;

      for(int i=2;i<=num;i++){
        
        fib[i]=fib[i-1]+fib[i-2];

      }
      
    

    System.out.println(" fib series is "+Arrays.toString(fib));

  }




}

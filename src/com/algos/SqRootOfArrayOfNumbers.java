/**
 * 
 */
package com.algos;

import java.util.Arrays;

/**
 * @author deepa
 *
 */
class SqRootOfArrayOfNumbers {
	  public static void main(String[] args) {
	    System.out.println("Hello world!");


	      //[-4,-1,0,3,10]

	    int[] data = {-4,-10,3,10};
	    System.out.println(" before Sorted data is "+Arrays.toString(data));
	      printOrderedSquare(data);


	  }


	  public static void printOrderedSquare(int[] data){

	       int[] result=new int[data.length];

	      int k=0;
	       for(int d:data){
	          result[k]=(d*d);
	          k=k+1;
	       }  


	        int temp=0;
	       for(int i=0;i<result.length-1;i++){
	          for(int j=i+1;j<result.length;j++){
	              if(result[i]>result[j]){
	                temp=result[i];
	                result[i]=result[j];
	                result[j]=temp;
	              }
	          }
	       }


	    System.out.print(" Sorted data is "+Arrays.toString(result));

	  }
	}

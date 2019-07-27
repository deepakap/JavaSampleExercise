/**
 * 
 */
package com.app.searching;

/**
 * @author deepa
 *
 */
import java.util.*;

class Main {
  public static void main(String[] args) {
    System.out.println("Program to perform Binary search !"+new Date());

  int[] data = {2,3,4,5,6,7,8,9};

  System.out.println( "4 is found at index : "+fnPerformSearch(data,0,data.length-1,4));

  System.out.println( "10 is found at index : "+fnPerformSearch(data,0,data.length-1,10));


  }


  public static int fnPerformSearch(int[] data,int l, int r, int num){

    if(data.length==0){return -1;};
    int mid = (l+(r))/2;

    if(r>=l){
  
    if(data[mid]==num){return mid;}

    if(data[mid]>num){
      return fnPerformSearch(data,l,mid-1,num);
    }

    return fnPerformSearch(data,mid+1,r,num);

  }return -1;

  }




}

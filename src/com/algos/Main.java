/**
 * 
 */
package com.algos;

/**
 * @author deepa
 *
 */
//Class name must be "Main"
//Libraries included:
//json simple, guava, apache commons lang3, junit, jmock
import java.util.*;
import java.util.Arrays;
import java.util.HashSet;
import java.util.TreeSet;
import java.util.Collections;

class Main {
 
 
     public static void main(String[] args) {
     System.out.println("Find second largest element in the int array !");
     int[] data = {47498, 14526, 74562, 42681, 75283, 45796};
     System.out.println(fnSecondLargestElement(data));
     int[] a = {21, 57, 11, 37, 24};
     int[] b = {21, 57, 11, 37, 24};
     boolean flag = Arrays.equals(fnSortedArray(a), fnSortedArray(b));
     if(flag){
         System.out.println( " arrays are equal !");
     }else{
          System.out.println(" arrays are not equal !");
     }
     
     int[] d = {1,2,3,4,5,6,7};
     int[] pairs = fnPrintSumPairs(d,5);
     
     System.out.println("pair is "+Arrays.toString(pairs));
     fnPrintPairs(d,5);
     
     String[] inputArray1 = {"ONE", "TWO", "THREE", "FOUR", "FIVE", "FOUR"};

     String[] inputArray2 = {"THREE", "FOUR", "FIVE", "SIX", "SEVEN", "FOUR"};
     
     fnIntersectData(inputArray1, inputArray2);
  }
 
    public static int fnSecondLargestElement(int[] data){
     for(int i=0;i<data.length-1;i++){
     for(int k=0;k<data.length-1-i;k++){
         int temp;
             if(data[k]>data[k+1]){
                 temp = data[k];
                 data[k]=data[k+1];
                 data[k+1]=temp;
             }
         }
     }
     System.out.println("sorted array is "+Arrays.toString(data));
     return data[1];
  }
 
 public static int[] fnSortedArray(int[] data){
     for(int i=0;i<data.length-1;i++){
         for(int k=0;k<data.length-1-i;k++){
         int temp;
             if(data[k]>data[k+1]){
                 temp = data[k];
                 data[k]=data[k+1];
                 data[k+1]=temp;
             }
         }
     }
     System.out.println("sorted array is "+Arrays.toString(data));
     return data;
     }
 
 // {1,2,3,4,5,6,7};  // target =5 
 public static int[] fnPrintSumPairs(int[] data, int target){
 
     HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>();
     int sum;
     for(int i=0;i<data.length;i++){
         sum = target-data[i];
         if(hm.containsKey(sum)){  
             return new int[] {i, hm.get(sum)};
         }else{
             hm.put(data[i],i);
         }
     } 
     return new int[]{-1,-1};
    
 }
 public static void fnPrintPairs(int[] data, int target){
     HashSet<Integer> hs = new HashSet<Integer>();
     int sum;
     for(int i=0;i<data.length;i++){
         sum = target-data[i];
         if(hs.contains(sum)){
             System.out.println( " pairs are > > > > > "+data[i]+" , "+sum);
         }else{
             hs.add(data[i]);
         }
     }
 }
 
 
 // intersection of string array print result
 public static void fnIntersectData(String[] str1, String [] str2){
 
     ArrayList list = new ArrayList(Arrays.asList(str1));
     TreeSet<String> hst = new TreeSet<String>();
     
     
     for(String str: str2){
         if(list.contains(str)){
             //System.out.println(" element is common "+str);
             hst.add(str);
             
         }
     
     
     }
     
   
    System.out.println( "  intersection elements are "+hst );
     
     
     
 
 
 
 }
 

         
     
 
 
 
}


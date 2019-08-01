/**
 * 
 */
package com.app.Stack;

/**
 * @author deepa
 *
 */
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
class Main {
  public static void main(String[] args) {
    System.out.println("Array to ArrayList and Arraylist to Array !");

    Integer[] data = {2,3,4,5,6,7,8,10};

    
    System.out.println(" Given int array "+Arrays.toString(data));

    System.out.println("Array to arrayList ");


    List intList = Arrays.asList(data);
    
    System.out.println(" size elements are "+intList.size());

    Iterator itr = intList.iterator();
    while(itr.hasNext()){
      System.out.println(" list elements are "+itr.next());
    }
    
    
    
    System.out.print(" convert back to array ");
    
    
    Integer[] newData = (Integer[])intList.toArray();
    System.out.print(" printing data array "+Arrays.toString(newData));
    
    
    
    
    

  }
}

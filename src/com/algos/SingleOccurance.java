/**
 * 
 */
package com.algos;

/**
 * @author deepa
 *
 */
import java.util.HashMap;
import java.util.Iterator;

class SingleOccurance {
  public static void main(String[] args) {
    System.out.println("Given a non-empty array of integers, every element appears twice except for one. Find that single one.");

      int[] data = {4,4,5,6,2,5,6,2,6,8,0,8};
    
    
    
    System.out.println("  single occurance is : "+returnSignleOccuranceOfNum(data));



  }



  public static int returnSignleOccuranceOfNum(int[] data){


    HashMap<Integer ,Integer> hm = new HashMap<Integer, Integer>();


    

    for(int i=0;i<data.length-1;i++){
        if(!hm.containsKey(data[i])){
          hm.put(data[i], 1);
        }else{
          hm.put(data[i], hm.get(data[i])+1);
        }
    }


    System.out.println(">>> "+hm.toString());


    Iterator<Integer> itr = hm.keySet().iterator();
    int d=0;
    int k;
    while(itr.hasNext()){

        k= itr.next();
        d= hm.get(k);
        if(d==1){
          return k;
        }

    }


    return d;

    
    	

  }

}

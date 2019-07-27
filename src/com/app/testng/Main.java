/**
 * 
 */
package com.app.testng;

/**
 * @author deepa
 *
 */
//Class name must be "Main"
//Libraries included:
//json simple, guava, apache commons lang3, junit, jmock

import java.util.HashMap;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

class Main {
 public static void main(String[] args) {
     System.out.println("find duplicate words in a array of strings");
     
     printDuplicate("Java is java again java");
 }
 
 public static void printDuplicate(String str){
 
     String[] data = str.split(" ");
     System.out.println(" data in array "+Arrays.toString(data));
     HashMap<String, Integer> hm = new HashMap<String, Integer>();
     
     for(int i=0;i<data.length;i++){
         
         
         System.out.println(" data cmg as  "+data[i]);
         
         if(!hm.containsKey(data[i])){
                 hm.put(data[i],1);
         }else{
             hm.put(data[i],hm.get(data[i])+1);
         }
     }
     
     
      System.out.println(" data in Hmap > "+hm.size());
     
      Iterator itr = hm.keySet().iterator();
     while(itr.hasNext()){
	    	
         String key = (String)itr.next();
         int k = hm.get(key);
         if(k!=1)
         System.out.println("  printing duplicate  >>>>>>"+key);
	    	
	    	
	    }
 
 
 
 }
 
 
}

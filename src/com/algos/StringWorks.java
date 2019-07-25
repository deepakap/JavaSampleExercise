/**
 * 
 */
package com.algos;

import java.util.ArrayList;
import java.util.List;

/**
 * @author deepa
 *
 */
public class StringWorks {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		checkStrings();
	}
	
	
	public static void checkStrings(){
		
		String str1  = "Hello Java";
		String str2 = "Hello Java";
		String str3 = new String("Hello Java");
		
		
		if(str1.equals(str3)){
			System.out.println("both are equal ");
		}else{
			System.out.println("Both are unequal !");
		}
		
		
		
		if(str1==str3){
			System.out.println("both are equal ");
		}else{
			System.out.println("Both are unequal !"+str1+str3.hashCode());
		}
		
		char[] allChars = str1.toCharArray();
		for(char c:allChars){
			System.out.println(" > "+c);
		}
		
	     ArrayList<Character> charArry = new ArrayList<Character>();
		
		
	     Integer[] arry  = new Integer[5];
	     arry[0] = 1;
	     arry[1] = 1;
	     
	     
	     for(int i=0;i<arry.length;i++)
	     { System.out.println(""+i);
	     }

	     
	     
	     List nums =  new ArrayList<>();
	     nums.add(1);
	     nums.add(2);
	     
	     
	     
	     
	};

}

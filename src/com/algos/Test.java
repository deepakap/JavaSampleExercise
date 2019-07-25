package com.algos;
import com.app.customExceptions.*; 

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int r = 8;
		Integer ri = null;
		Integer num = new Integer(r);
		
		
		  System.out.println("r=: " + r++);
		  System.out.println("r=: " + r);
		  int[] ages = {12,34,55,45,67,34,89,34,78,22,14,51};
		  try {
			  
			for(int age:ages){
				checkAge(age);

			}  
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		  
	}
	
	
	
	 public static void checkAge(int age) throws Exception{
		if(age > 26){
			throw new Exception();
		}else{
			System.out.println("A teen !");
		}
			
			
	};

}

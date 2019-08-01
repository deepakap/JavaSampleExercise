package com.algos;

import java.util.Arrays;
import java.util.LinkedList;

public class SomeExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num=234;
		
		
		
		for(int n=2;n<25;n++){
			System.out.println(" num "+n+" is SelfDividing ? "+isSelfDividing(n));
		}
		

	}
	
	
	public static boolean isSelfDividing(int num){
		boolean flag=false;
		
		LinkedList<Integer> ll =  new LinkedList<Integer>();
		while(num>0){
			if(num%10==0)return false;
			ll.add(num%10);
			num = num / 10;
		}
		//System.out.println(" data is "+ll.toString());
		
		for(Integer d:ll){
			if(num%d!=0){
				flag=false;
			}flag=true;
		}
		
		return flag;
	}

}

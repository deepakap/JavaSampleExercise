/**
 * 
 */
package com.algos;

import java.util.Arrays;

/**
 * @author deepa
 *
 */
public class UpdatePosition {
	
	
	public static int dataLength;
	public static int rotation;

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] data = {1,2,3,4,5,6,7,8};
		
		for(int i=0;i<2;i++)
		updateIndex(data, data.length);
		
	}
	
	
	
	public static void updateIndex(int[] data, int size){
		
		
		int temp=data[0];
		int i;
		for(i=0;i<size-1;i++){
			data[i]=data[i+1];
		}
		data[i]=temp;
		
		
		
		System.out.print(" rotated "+Arrays.toString(data));
		
	}
	
	

}

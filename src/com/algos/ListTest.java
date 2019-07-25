/**
 * 
 */
package com.algos;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

/**
 * @author deepa
 *
 */
public class ListTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Integer[] nums = new Integer[5];
		for(int i=0;i<5;i++){
			nums[i]=i;
		};
		
		System.out.println(Arrays.toString(nums));
		
		convertArrayToList(nums);
		
	}
	
	
	public static void convertArrayToList(Integer[] nums) {
		List<Integer> numList = new ArrayList<Integer>(Arrays.asList(nums));
		for (Integer i : numList) {
			System.out.println(" > " + i);
		}
		convertListToArray(numList);

		LinkedList<Integer> lnkdList = new LinkedList(numList);
		Vector<Integer> vct = new Vector<Integer>(numList);
		
		HashSet<Integer> hset = new HashSet<Integer>(numList);
		
		LinkedList<Integer> nInts = new LinkedList<Integer>(hset);
		
		
		
	}
	
	public static void convertListToArray(List<Integer> list){
		
		 Integer[] numArry = (Integer[]) list.toArray(new Integer[list.size()]);
		
		System.out.println(Arrays.toString(numArry));
		
	}
	
	
	

}

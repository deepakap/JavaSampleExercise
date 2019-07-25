/**
 * 
 */
package com.algos;

import java.util.ArrayList;
import java.util.Collections;

import com.algos.ComparableTest;

/**
 * @author deepa
 *
 */
public class CompareTestClass {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		printList();
	}
	
	
public static void printList(){
		
		ArrayList<ComparableTest> aList = new ArrayList<ComparableTest>();
		aList.add(new ComparableTest(1,15,"INDIA"));
		aList.add(new ComparableTest(3,4,"PAK"));
		aList.add(new ComparableTest(2,12,"NZ"));
		aList.add(new ComparableTest(4,7,"WI"));
		Collections.sort(aList);
		for(ComparableTest obj:aList){
			System.out.println(" "+obj.getId()+" > > "+obj.getPoints()+" >>> Team :  "+obj.getTeamName());
		}
		
		
	}

}

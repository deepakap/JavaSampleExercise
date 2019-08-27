/**
 * 
 */
package com.app.armorblox;

import java.util.HashMap;
import java.util.LinkedList;

/**
 * @author deepa
 *
 */
public class Base {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		LinkedList<String> statusList = new LinkedList<String>();
		statusList.add("running");
		statusList.add("stop");
		statusList.add("killed");
		
		
	 System.out.println(" index is "+statusList.indexOf("stop"));
	 
	 
	 HashMap<String, Integer> hm = new  HashMap<String, Integer>();
	 hm.put("one",1);
	 hm.put("two", 2);
	 hm.put("three", 3);
	 hm.put("two", 4);
	 
	 System.out.println("  "+hm.toString());
	 
	 
	 
		
	}

}

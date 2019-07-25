/**
 * 
 */
package com.algos;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;

/**
 * @author deepa
 *
 */
public class MapsTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashMap<String, String> hm = new HashMap<String, String>();
		hm.put("Jan","Sunday");
		hm.put("Feb", "Monday");
		hm.put("Mar", "Sat");
		
		
		
		Iterator<Entry<String, String>> itr = hm.entrySet().iterator();
		
		while(itr.hasNext()){
			
			System.out.println(itr.next());
			
		}
		
		
		hm.put("Jan","Sunday");
		hm.put("Feb", "Monday");
		hm.put("Mar", "Sat");
		
		
		Iterator<String> itrl = hm.keySet().iterator();
		while(itrl.hasNext()){
			System.out.println(hm.get(itrl.next()));
		}
		
		
		
		
		
		
		
		
		
		
	}

}

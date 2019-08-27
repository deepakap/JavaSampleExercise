/**
 * 
 */
package com.app.armorblox;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.Map.Entry;
import java.util.Set;

/*1. Input: valid state transitions:
"running -> stop -> killed"

Example of invalid state which is not allowed
# invalid state transition:
# running -> killed

2. Input
time: 1, hash: 263d1a90b72e, status: running, cmd: bash
time: 2, hash: 8ce44d15cef1, status: running, cmd: bash
time: 3, hash: 263d1a90b72e, status: stop, cmd: bash
time: 4, hash: 263d1a90b72e, status: killed, cmd: bash
time: 5, hash: 263d1a90b72e, status: running, cmd: bash

3. Output
time: 1, hash: 263d1a90b72e, status: OK
time: 2, hash: 8ce44d15cef1, status: OK
time: 3, hash: 263d1a90b72e, status: OK
time: 4, hash: 263d1a90b72e, status: OK
time: 5, hash: 263d1a90b72e, status: Error*/



/**
 * @author deepa
 *
 */
public class TransictionValidator {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		LinkedList<String> dataList = new LinkedList<String>();
		dataList.add("time: 1, hash: 263d1a90b72e, status: running, cmd: bash");
		dataList.add("time: 2, hash: 8ce44d15cef1, status: running, cmd: bash");
		dataList.add("time: 3, hash: 263d1a90b72e, status: stop, cmd: bash");
		dataList.add("time: 4, hash: 263d1a90b72e, status: killed, cmd: bash");
		dataList.add("time: 5, hash: 263d1a90b72e, status: running, cmd: bash");
		dataList.add("time: 6, hash: 8ce44d15cef2, status: running, cmd: bash");
		
		
		
		//running -> stop -> killed"
		ArrayList<String> statusList = new ArrayList<String>();
		statusList.add("running");
		statusList.add("stop");
		statusList.add("killed");
		
		LinkedHashMap<String, LinkedHashMap<String, ArrayList<String>>> dataHolder = new LinkedHashMap<String, LinkedHashMap<String, ArrayList<String>>>();
		String result;
		LinkedHashMap<String, ArrayList<String>> interMap = new LinkedHashMap<String , ArrayList<String>>();
		String[] innerData;
		
		System.out.println("Data input stream is as :");
		System.out.println("_________________________________");
		
		System.out.println(" ");
		for(String str:dataList){
			//System.out.println(str.toString());
			result = parseInPutStreamData(str);
			innerData = str.split(",");
			
			//System.out.println(" inner data managed >>"+Arrays.toString(innerData));
			
			
			if(!dataHolder.containsKey(result)){
				interMap.put(innerData[2], statusList);
				dataHolder.put(result, interMap);
				System.out.println(innerData[0]+" ,"+result+" ,"+" status: OK");
			}else{
				interMap =  dataHolder.get(result);
				
				
				
				
				ArrayList<String> statusLocator =  interMap.get(result);
				
				
				
				
				Iterator<String> itr = dataHolder.get(result).keySet().iterator();
				String key="";
				while(itr.hasNext()){
					 key = itr.next();
					 statusList=dataHolder.get(result).get(key);
					 
//					 if(statusList instanceof ArrayList){
//						 System.out.println("  statusList  "+statusList.toString());
//					 }
					 
					 
					 
				}
				
				//System.out.println(" key is "+key.split(":")[1]);
				String temp = key.split(":")[1].toLowerCase().toString().trim();
				
				//System.out.println("  temp is  "+temp);
				int index=statusList.indexOf(temp);

				
				
			
				
//				
				String innerValue = innerData[2].trim().split(":")[1].trim();
				//System.out.println("  second vale :"+innerValue);
				
				
				try{
				
				
				if(statusList.get(index+1).equals(innerValue)){
					
					//System.out.println(" putting inside map as >>>>>>> "+innerData[2]+"  and "+statusList);
					interMap.put(innerData[2], statusList);
					System.out.println(innerData[0]+" ,"+result+" ,"+" status: OK");
				}
				
				}catch(IndexOutOfBoundsException exp){
					System.out.println(innerData[0]+" ,"+result+" ,"+" status: Error");
				}
				
				
				
			}
			
			
		}
		
		
		
		
		
	}
	
	
	
	public static String parseInPutStreamData(String strData){
		if(!strData.equalsIgnoreCase("")){
			String[] splitData = strData.split(",");
			return splitData[1];
		}
		else{
			return "";
		}
	}
	
	
	
	
	

}

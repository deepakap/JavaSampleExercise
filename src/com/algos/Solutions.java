/**
 * 
 */
package com.algos;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;

/**
 * @author deepa
 *
 */
public class Solutions {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<String> nameList= new LinkedList<String>();
		nameList.add("Bob");
		nameList.add("Dob");
		nameList.add("Lob");
		nameList.add("Bob");
		List<Integer> priceList = new LinkedList<Integer>();
		priceList.add(25);
		priceList.add(35);
		priceList.add(45);
		priceList.add(25);
		List<Integer> weightList = new LinkedList<Integer>();
		weightList.add(75);
		weightList.add(55);
		weightList.add(65);
		weightList.add(75);

		System.out.print(" duplicate counts are "+printNumbeOfDuplicateProducts(nameList,priceList,weightList));
		
		
		
	}
	
	
	public static int printNumbeOfDuplicateProducts(List<String> nameLst,List<Integer> priceLst,List<Integer> weightLst){
		
		
		HashSet<String> nameSet = new HashSet<String>();
		HashSet<Integer> priceSet = new HashSet<Integer>();
		HashSet<Integer> weightSet = new HashSet<Integer>();
		int nameCnt=0;
		
		for(int i=0;i<nameLst.size();i++){
			
			if(!nameSet.contains(nameLst.get(i)) && !priceSet.contains(priceLst.get(i)) && !weightSet.contains(weightLst.get(i)))
			{
				nameSet.add(nameLst.get(i));
				priceSet.add(priceLst.get(i));
				weightSet.add(weightLst.get(i));
			}else{
				System.out.print(" is duplicate "+nameLst.get(i)+" "+priceLst.get(i)+" "+weightLst.get(i));
				nameCnt++;
			}
			
		}
		
		
		
		
		return nameCnt;
		
	}
	
	
	
	
	
	
	

}

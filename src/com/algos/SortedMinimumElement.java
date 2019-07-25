/**
 * 
 */
package com.algos;

/**
 * @author deepa
 *
 */
public class SortedMinimumElement {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] data0 ={8,7,10,12,2,5,6};
		System.out.println( "Minum Element is : "+new SortedMinimumElement().findMinimumElement(data0, 0, data0.length-1));
		int[] data1 ={12,3,0,5,6};
		System.out.println( "Minum Element is : "+new SortedMinimumElement().findMinimumElement(data1, 0, data1.length-1));
		int[] data2 ={12,3,-1,0,5};
		System.out.println( "Minum Element is : "+new SortedMinimumElement().findMinimumElement(data2, 0, data2.length-1));

		
	  new SortedMinimumElement().printResult();
	}
	
	
	private int findMinimumElement(int[] data, int s, int e){
		if(s==e)
			return data[s];
		
		if(data[s]<data[e])
			return data[s];
		
		 int mid = (s+e)/2;
		 if(data[mid]<data[mid-1])
			 return data[mid];
		 
		 if(data[mid]<data[e]){
			 return findMinimumElement(data, s,mid-1);
		 }else{
			 return findMinimumElement(data, mid+1, e);
		 }
		
		
	}
	
	
	private void printResult(){
		int a=9;
		int b=5;
		System.out.println( a+" % "+b+" : "+a%b );
		
		
	};

}

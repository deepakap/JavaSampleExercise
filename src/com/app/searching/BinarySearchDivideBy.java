/**
 * 
 */
package com.app.searching;

/**
 * @author deepa
 *
 */
public class BinarySearchDivideBy {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] data = {2,4,5,7,9,12,78};
		int rslt = new BinarySearchDivideBy().isDataPresent(data,0,data.length,8);
		System.out.println(" rslt data is present at position "+rslt);
		
		
		

		System.out.println(" rslt data is present at position "+rslt);
		
		
	}
	
	
	public int isDataPresent(int[] arry, int l,int h, int x){
		
		
		
		int mid = (l+h)/2;
		
		if(h<l){return -1;}
		
		System.out.println(" mid "+mid);
		if(arry[mid]==x){
			return mid;
		}else if(x>arry[mid]){
			return isDataPresent(arry,mid+1,h,x);
		}else{
			return isDataPresent(arry,l,mid-1,x);
		}
		
	}
	
	
	
	
	public int runBinarySearchRecursively(
			  int[] sortedArray, int key, int low, int high) {
			    int middle = (low + high) / 2;
			         
			    if (high < low) {
			        return -1;
			    }
			 
			    if (key == sortedArray[middle]) {
			        return middle;
			    } else if (key < sortedArray[middle]) {
			        return runBinarySearchRecursively(
			          sortedArray, key, low, middle - 1);
			    } else {
			        return runBinarySearchRecursively(
			          sortedArray, key, middle + 1, high);
			    }
			}
	

}

/**
 * 
 */
package com.algos;

/**
 * @author deepa
 *
 */
public class SelectionSort {
	
	
	private int[] performSelectionSort(int[] data){
		int minIndx;
		for(int i=0;i<data.length-1;i++){
		minIndx = i;	
		for(int j=i+1;j<data.length;j++){
			
			if (data[j] < data[minIndx]) 
				minIndx = j; 
			
			
			
			int temp = data[minIndx]; 
			data[minIndx] = data[i]; 
			data[i] = temp;
			
		}
			
			
		}
		
		return data;
	};
	
	
	
	void sort(int arr[]) 
    { 
		
		//{23,2,5,12,17,9}; 
        int n = arr.length; 
  
        // One by one move boundary of unsorted subarray 
        for (int i = 0; i < n-1; i++) 
        { 
            // Find the minimum element in unsorted array 
            int min_idx = i; //i=0, j=1, n=6
            for (int j = i+1; j < n; j++) {
            	
            	System.out.println(">>>>"+arr[j]+"  >>>"+arr[min_idx]); 
            	
                if (arr[j] < arr[min_idx]){ 
                    min_idx = j; 
                	System.out.println("----index"+j); 

                }

            }
            // Swap the found minimum element with the first 
            // element 
            int temp = arr[min_idx]; 
            arr[min_idx] = arr[i]; 
            arr[i] = temp; 
        	System.out.println(">swap time>>"); 

            
        } 
    } 
	
	void printArray(int arr[]) 
    { 
        int n = arr.length; 
        for (int i=0; i<n; ++i) 
            System.out.print(arr[i]+" "); 
        System.out.println(); 
    } 

	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		int[] numArray = {23,2,5,12,17,9};
//		SelectionSort sortObj = new SelectionSort();
//		int[] sortddata = sortObj.performSelectionSort(numArray);
//		for(int k=0;k<sortddata.length;k++){
//			System.out.println( " > "+sortddata[k]);
//		}
		
		
		
		
		
		SelectionSort ob = new SelectionSort(); 
        int arr[] = {23,7,5,12,17,9}; 
        ob.printArray(arr); 
        ob.sort(arr); 
        System.out.println("Sorted array"); 
        ob.printArray(arr); 
		

	}

}

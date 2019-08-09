/**
 * 
 */
package com.algos;

/**
 * @author deepa
 *
 */
class BalancedArray {
    
    public static void main(String[] args) {
        System.out.println("Array Balance");
        
        
        int[] data = {1,2,1,1,2,2};
        isBalancedArray(data);
        
    }
    public static void isBalancedArray(int[] data){
        
        int[] data1 = new int[data.length];
        int[] data2 = new int[data.length];
        int len = data.length;
        int temp1 = 0;
        int temp2 = 0;
        
        for(int i=0;i<len;i++){
            
            
            for(int k=0;k<=i;k++){
                temp1= temp1+data[k];
            }
            System.out.println(" > "+temp1);
            
            for(int j=i+2;j<data.length;j++){
                temp2 = temp2+data[j];
            }
            System.out.println(" >>>>> "+temp2);
            if(temp1==temp2){
                System.out.println(" 2 sub arrays are balaced :  "+temp1+" : "+temp2);
            }else{
                temp1=0;
                temp2=0;
            }
        }
    
    }
   
}
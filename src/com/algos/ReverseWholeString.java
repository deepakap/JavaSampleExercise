/**
 * 
 */
package com.algos;

/**
 * @author deepa
 *
 */
import java.util.*;
class ReverseWholeString {
  public static void main(String[] args) {


    String dat = "Let's take LeetCode contest";
    System.out.println(dat);

    String[] arr = dat.split(" ");
    StringBuffer sb = new StringBuffer();
        for(String s:arr){
            sb.append(reverseString(s)+" ");
        }


        System.out.println(sb);

  }



 public static String reverseString(String str){

    char[] ch = str.toCharArray();
    char temp;
    int k=ch.length-1;
    for(int i=0;i<ch.length/2;i++){
      temp=ch[i];
      ch[i]=ch[k];
      ch[k]=temp;
      k--;
    }
    return new String(ch);


 }







}

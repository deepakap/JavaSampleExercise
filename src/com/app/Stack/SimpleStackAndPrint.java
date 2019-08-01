/**
 * 
 */
package com.app.Stack;

import java.util.Stack;

/**
 * @author deepa
 *
 */
public class SimpleStackAndPrint {

	/**
	 * @param argsg
	 */
	public static void main(String[] args) {
		
		Stack<String> stack = new Stack<String>();
		stack.push("Jack");
		stack.push("Bob");
		stack.push("Roger");
		stack.push("Slum bala");
		
		System.out.println(" stack data is "+stack);
		
		System.out.println(" stack top data is   "+stack.peek());
		
		System.out.println(" popping out data   "+stack.pop());
		
		
		System.out.println(" stack data re-print "+stack);
		
		

	}

}
/**
 * 
 */
package com.app.customExceptions;

/**
 * @author deepa
 *
 */
public class AgeException extends Exception {

	public AgeException(){
		super();
	};
	
	public AgeException(String txt){
		super(txt);
	}
	
}

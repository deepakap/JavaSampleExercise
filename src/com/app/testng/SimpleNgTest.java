/**
 * 
 */
package com.app.testng;

import org.junit.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import com.app.Beans.*;

/**
 * @author deepa
 *
 */
public class SimpleNgTest {

	public String message= "";
	Employee emp;
	
	@BeforeTest
	public void setMessage(){
	 emp = new Employee(12, 34, "Simon Pet");
	}
	
	@Test
	public void readMessage(){
		Assert.assertEquals("Name is not matching!", "Simon pet", emp.getName());
	}
	
	@AfterTest
	public void clearMessage(){
		System.out.println("End of test !");
	}


}

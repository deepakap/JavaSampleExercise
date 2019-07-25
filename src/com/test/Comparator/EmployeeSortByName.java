/**
 * 
 */
package com.test.Comparator;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

import com.algos.Employee;
import com.algos.EmployeeIDComparator;

/**
 * @author deepa
 *
 */
public class EmployeeSortByName {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LinkedList<Employee> elist = new LinkedList<>();
		elist.add(new Employee(2, 23, "Ron"));
		elist.add(new Employee(0, 22, "Don"));
		elist.add(new Employee(1, 21, "Pon"));
		elist.add(new Employee(5, 24, "Jon"));
		elist.add(new Employee(4, 22, "Bon"));
		
		System.out.println("Before sorting  ***");
		printSortedEmpID(elist);
		
		
		
		System.out.println("After Sort by Emp iD : ");
		Collections.sort(elist, new EmployeeIDComparator());
		printSortedEmpID(elist);
		
	}
	
	
	
	public static void printSortedEmpID(List<Employee> list){
		
		System.out.println("  AGE |"+" NAME |"+" EMP_ID");
		System.out.println("_____________________________");
		for(Employee emp : list){
			System.out.println("  "+emp.getAge()+"    "+emp.getName()+"     "+emp.getId());
		}
		
		
		
		
	}
	
	
	

}

/**
 * 
 */
package com.cdi.collectionconcept;

import java.util.ArrayList;

/**
 * @author WEL
 *
 */
public class Service {

	/**
	 * 
	 */
	public Service() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
ArrayList<Employee>employeeList=new ArrayList<>();
employeeList.add(new Employee(120, "TOM", 5245.25, 458866145826L, "PUNE"));
employeeList.add(new Employee(458, "JERRY", 4587.25, 7453214556245L, "PUNE"));
employeeList.add(new Employee(75, "EMMY", 582245, 7415522, "MH"));
employeeList.forEach(emp->System.out.println(emp));
	}

}

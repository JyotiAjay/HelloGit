/**
 * 
 */
package com.csi.basics;

import java.util.ArrayList;



/**
 * @author WEL
 *
 */
public class Service1 {

	/**
	 * 
	 */
	public Service1() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Employee1>studentList= new ArrayList<>();
		studentList.add(new Employee1(125, "RAM", 48823, "PUNE", 'C') );
		studentList.add(new Employee1(458, "JERRY", 47522, "MH", 'A') );
		studentList.add(new Employee1(4856, "TOM", 45826, "MP", 'B') );
		studentList.add(new Employee1(568, "AJAY", 48826, "USA", 'D'));
		studentList.forEach(std->System.out.println(std));


	}

}

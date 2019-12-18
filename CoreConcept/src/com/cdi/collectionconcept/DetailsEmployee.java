package com.cdi.collectionconcept;

import java.util.ArrayList;
import java.util.Scanner;

public class DetailsEmployee {

	public static void main(String[] args) {
		ArrayList<String> EmployeeList= new ArrayList<>();
		System.out.println("\n please enter Name of Person");
		Scanner sc= new Scanner(System.in);
		String EmployeeName= sc.next();
		EmployeeList.add("JYOTI");
		EmployeeList.add("EMMA");
		EmployeeList.add("JEERY");
		EmployeeList.add("JOJO");
		if(EmployeeList.contains(EmployeeName)){
			System.out.println("yes:" +EmployeeName);	
		}
		else{
		
			System.out.println("NO:"+EmployeeName);
		}
		
		
	}
}

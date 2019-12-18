package com.infy.oops;

interface Department {
	void get(int deptId, String deptName);

	default void set() {
		System.out.println("I am from default");
	}
	
	static void net() {
		System.out.println("I am from Static method");
	}
}

interface Employee {
	void pop(int empId, String empName);
}

 abstract class company {
	abstract void show(int cId, String cName);

	void push() {
		System.out.println("I am from push");
	}

}

class Product extends company implements Department, Employee {
	@Override
	public void pop(int empId, String empName) {
		// TODO Auto-generated method stub
		System.out.println("\n Employee Id:" + empId + "\n Employee Name:" + empName);
	}

	@Override
	public void get(int deptId, String deptName) {
		// TODO Auto-generated method stub
		System.out.println("\n Department Id:" + deptId + "\n Department Name:" + deptName);
	}

	@Override
	void show(int cId, String cName) {
		// TODO Auto-generated method stub
		System.out.println("\n Company Id:" + cId + "\n  Company Name:" + cName);
	}

	
	

}

public class InterfaceConcept {
	public static void main(String[] args) {
		Product PP = new Product();
		PP.get(101, "HR");
		PP.set();
		PP.show(452, "CSI");
		PP.push();
		PP.pop(552, "TOM");
	Department.net();
	

	}

}

package com.csi.oops.infy;
class Department{
	void get(int deptId,String deptName){
		System.out.println("\n Department Id:"+deptId+"\n Department Name"+deptName);
	}
}
class Employee1 extends Department{
	void get(int deptId, String deptName){
		System.out.println("\n Department Id:"+deptId+"\n Department Name"+deptName);
	}
}
class Company2 extends Employee1{
	void get(int deptId, String deptName){
		System.out.println("\n Department Id:"+deptId+"\n Department Name"+deptName);
	}
}

public class OverrideConcept2 {
	public static void main(String[] args) {
		Employee1 e1= new Employee1();
		e1.get(100, "HR");
			Department dd= new Department();
			dd.get(55, "FA");
		}
		
	}

	



package com.csi.oops.infy;
class Dept{
    int deptCode=1001;
	void get(int deptId, String deptName){
		System.out.println("\n Department Id:"+ deptId +"\n Department Name:"+ deptName);
	}
	void push()
	{
		System.out.println("\n I am from Pune");
	}
}
class Emp extends Dept{
	int deptCode=22;
	static void set(int empId, String empName){
		System.out.println("\n Employee Id:"+empId+"\n Employee Name:"+empName);
	}
	void net(String empAdress, double empSalary){
		System.out.println("\n Employee Adress:"+ empAdress + "\n Employee Salary:"+empSalary+ "\n Department Code:"+super. deptCode);
		super.push();
		
	}

}
class Company extends Emp{
	void show()
	{
		System.out.println();
	}
}

public class InheritanceConcept {
	public static void main(String[] args) {
		
		
	    Emp e1= new Emp();
		e1.get(101, "HR");
		e1.set(121, "TOM");
		e1.net("PCMC", 45254.22);
	    /* Emp ee =(Emp) new Dept();
		ee.get(1,"Dev");
		ee.set(12, "Ram"); //ClassCastException*/
		Dept dd = new Emp();
		dd.get(123, "QA");
		
	}

}

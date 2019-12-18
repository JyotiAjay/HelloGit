package com.csi.oops.infy;

class Employee {
	private int empId;
	private String empName;
	private double empSalary;

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public double getEmpSalary() {
		return empSalary;
	}

	public void setEmpSalary(double empSalary) {
		this.empSalary = empSalary;
	}
}

public class EncapsulationConcept {
	public static void main(String[] args) {
		Employee ee = new Employee();
		ee.setEmpId(121);
		ee.setEmpName("JYOTI");
		ee.setEmpSalary(48000.58);
		System.out.println("\n Employee Id:" + ee.getEmpId() + "\n Employee Name:" + ee.getEmpName()
				+ "\n Employee Salary:" + ee.getEmpSalary());
	}

}

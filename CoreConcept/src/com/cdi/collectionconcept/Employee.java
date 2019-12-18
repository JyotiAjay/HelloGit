package com.cdi.collectionconcept;

public class Employee {
private int empId;
private String empName;
private double empSalary;
private long empUID;
private String empAdress;
public Employee(int empId, String empName, double empSalary, long empUID, String empAdress) {
	super();
	this.empId = empId;
	this.empName = empName;
	this.empSalary = empSalary;
	this.empUID = empUID;
	this.empAdress = empAdress;
}
@Override
public String toString() {
	return "Employee [empId=" + empId + ", empName=" + empName + ", empSalary=" + empSalary + ", empUID=" + empUID
			+ ", empAdress=" + empAdress + "]";
}

}




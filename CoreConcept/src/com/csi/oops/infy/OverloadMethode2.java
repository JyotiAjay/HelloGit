package com.csi.oops.infy;
class MIcompany{
	void get(int empId){
		System.out.println("\n Employee Id:"+empId);
	}
	void get(String empName,String empAdress){
		System.out.println("\n Employee Name:"+empName+"\n Employee Adress:"+empAdress);
	}
	void get(char empBloodgroup, double empSalary){
		System.out.println("\n Employee Bloodgroup:"+empBloodgroup+ "\n Employee Salary:"+empSalary);
	}
}
public class OverloadMethode2 {
	public static void main(String[] args) {
		MIcompany M= new MIcompany();
		M.get(100);
		M.get("AJAY", "CASAPOLI");
		M.get('A', 105325.55);
	}

}

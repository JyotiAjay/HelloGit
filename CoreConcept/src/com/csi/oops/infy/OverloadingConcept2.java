package com.csi.oops.infy;
class Studentx{
	void get(int stdId, String stdName){
		System.out.println("\n Student Id:"+stdId+"\n Student Name:"+stdName);
	}	
	void get(String stdAdress, int stdenrollment){
		System.out.println("\n Student Adress:"+stdAdress+"\n Student Enrollment:"+stdenrollment);
	}
	void get(double stdMarks){
		System.out.println("\n Student Marks:"+stdMarks);
	}
}

public class OverloadingConcept2 {
	public static void main(String[] args) {
		Studentx S= new Studentx();
				S.get(121, "JYOTI");
		S.get("CASAPOLI", 125);
		S.get(500);
	}

}

package com.csi.oops.infy;

class Student {
	private int stdId;
	private String stdName;
	private int stdMarks;
	private char stdGrade;

	public int getStdId() {
		return stdId;
	}

	public void setStdId(int stdId) {
		this.stdId = stdId;
	}

	public String getStdName() {
		return stdName;
	}

	public void setStdName(String stdName) {
		this.stdName = stdName;
	}

	public int getStdMarks() {
		return stdMarks;
	}

	public void setStdMarks(int stdMarks) {
		this.stdMarks = stdMarks;
	}

	public char getStdGrade() {
		return stdGrade;
	}

	public void setStdGrade(char stdGrade) {
		this.stdGrade = stdGrade;
	}
}

public class EncapsulationConcept3 {
	public static void main(String[] args) {
		Student S = new Student();
		S.setStdId(155);
		S.setStdName("Vishal");
		S.setStdMarks(500);
		S.setStdGrade('A');
		System.out.println("\n Student Id:" + S.getStdId() + "\n Student Name:" + S.getStdName() + "\n Student Marks:"
				+ S.getStdMarks() + "\n Student Grade:" + S.getStdGrade());
	}

}

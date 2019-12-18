package com.csi.basics;

public class ConstructorConcept {
	public static void main(String[] args) {
		Student S = new Student("Durga", 101);
		System.out.println(S.name + "" + S.rollNo);

	}
}

class Student1 {
	Student1(String name, int rollno) {
		this.name = name;
		this.rollNo = rollno;
	}

	String name;
	int rollNo;

}

package com.csi.basics;

public class Student {
	public static void main(String[] args) {
		Student S = new Student("Durga", 101);
		System.out.println(S.name + "  " + S.rollNo);
	}

	Student(String name, int rollNo) {
		this.name = name;
		this.rollNo = rollNo;
	}

	String name;
	int rollNo;
}

package com.csi.jdkconcept;

import java.util.ArrayList;
import java.util.stream.Collectors;

class Student{
	int stdId;
	String stdName;
	int stdAge;
	String stdAdress;
	public Student(int stdId, String stdName, int stdAge, String stdAdress) {
		super();
		this.stdId = stdId;
		this.stdName = stdName;
		this.stdAge = stdAge;
		this.stdAdress = stdAdress;
	}
	@Override
	public String toString() {
		return "Student [stdId=" + stdId + ", stdName=" + stdName + ", stdAge=" + stdAge + ", stdAdress=" + stdAdress
				+ "]";
	}
}
public class CollectorsConcept {
public static void main(String[] args) {
	ArrayList<Student>studentlist= new ArrayList<>();
	studentlist.add(new Student(101, "TOM", 18, "PUNE"));
	studentlist.add(new Student(102, "JERRY", 20, "MUMBAI"));
	studentlist.add(new Student(103, "SHIVAM", 21, "BHOPAL"));
	studentlist.add(new Student(105, "KELLY", 25, "U.S"));
	//studentlist.stream().filter(Student->Student.stdAge==18).forEach(System.out::println);
	long studentCount=studentlist.stream().collect(Collectors.counting());
	System.out.println("\n Student Count:"+studentCount);
}
	
}

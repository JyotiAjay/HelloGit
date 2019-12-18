package com.csi.topics;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Student implements Comparable<Student>{
	int stdId;
	String stdName;
	String stdAddress;
	int stdAge;
	public Student(int stdId, String stdName, String stdAddress, int stdAge) {
		super();
		this.stdId = stdId;
		this.stdName = stdName;
		this.stdAddress = stdAddress;
		this.stdAge = stdAge;
	}
	@Override
	public String toString() {
		return "Student [stdId=" + stdId + ", stdName=" + stdName + ", stdAddress=" + stdAddress + ", stdAge=" + stdAge
				+ "]";
	}
	@Override
	public int compareTo(Student o) {
		// TODO Auto-generated method stub
		//System.out.println(o.stdName.compareTo(stdName)); this is using for compare two condition
		return this.stdName.compareTo(o.stdName);
	}

	
	
	/*@Override
	public int compare (Student s1, Student s2) {
		// TODO Auto-generated method stub
		return s1.stdName.compareTo(s2.stdName);
	}*/
/*	@Override
	public int compareTo(Student o) {
		// TODO Auto-generated method stub
		if(( o.stdName.compareTo(stdName))<1)
				return 1;
		if(( o.stdName.compareTo(stdName))>1)
			return -1;		
		if(( o.stdName.compareTo(stdName))==0)2
*/
	
}

public class ComparableConcept {

	public static void main(String[] args) {
		ArrayList<Student>studentlist= new ArrayList<>();
		studentlist.add(new Student(142, "AJAY", "PUNE", 29));
		studentlist.add(new Student(758, "VIJAY", "MH", 30));
		studentlist.add(new Student(758, "TOM", "MP", 25));
		studentlist.add(new Student(785, "JERRY", "MUMBAI", 26));
		Collections.sort(studentlist);
		studentlist.forEach(System.out::println);
		
	}
	}



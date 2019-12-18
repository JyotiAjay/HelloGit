package com.csi.exception;

public class ThrowConcept {
		static void validate(int age){
			if(age<18)
				throw new ArithmeticException ( "not vaild");
			else
				System.out.println("Welcome for Vote	");
			
		}
	
public static void main(String[] args) {
	validate(19);
	System.out.println("g");
	
	String s = "AJAY";
	String s1 = s;
	String s2 = s;
	
	if (s1==s2) System.out.println("String Comapre == operator");
	if(s1.equals(s2))System.out.println("String Compare equals operator");
	
	String s3 = new String ("Hello");
	String s4 = new String ("Hello");
	
	if (s3==s4) System.out.println("String Comapre == operator");  // Memory address fails check so no print
	if(s3.equals(s4))System.out.println("String Compare equals operator");
	
}
	
}

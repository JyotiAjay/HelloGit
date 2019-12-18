package com.csi.exception;

public class ConceptString {
	
	public static void main(String[] args) {
		String s1 = "CREDIT";
		String s2 = "CREDIT";
		
		System.out.println(s1 == s2);
		System.out.println(s1.equals(s2));
		
		if (s1==s2) System.out.println("String Comapre == operator");
		if(s1.equals(s2))System.out.println("String Compare equals operator");
		
		String s3 = new String ("Hello"); // New Memory location assigned
		String s4 = new String ("Hello"); // New Memory location assigned
		
		if (s3==s4) System.out.println("String Comapre == operator");  // Memory address fails check so no print
		if(s3.equals(s4))System.out.println("String Compare equals operator");
	
		
	}

}

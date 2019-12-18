package com.csi.basics;

public class StringConcept {
	public static void main(String[] args) {
		String S1="CREDIT";
		String S2="CReDIT";
		//String S2= new String("CREDIT");
		System.out.println("S1==S2");//This represent memory of variable
		System.out.println("S1.equal(S2):"+S1.equals(S2));// In this output will be true bcuz it shows value of variable
		System.out.println(S1.equalsIgnoreCase(S2));
		System.out.println("\n S1.charAt(3):"+S1.charAt(3));
		System.out.println("S1.lenght():"+S1.length());
		S1=S1.concat(S2);
		System.out.println("\n S1:"+S2);
		
	}

}

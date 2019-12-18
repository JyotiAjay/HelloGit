package com.csi.concept;

import java.util.Scanner;

public class FactorialConcept {
	public static void main(String[] args) {
		Scanner Sc = new Scanner(System.in);
		System.out.println("\n Please enter number to print factorial");
		int n= Sc.nextInt();
		int fact = 1, i;
		for (i=1; i<=n; i++){
			fact = fact*i;
		}
		
		System.out.println("Fact Result:" +fact);
	}
	
	

}

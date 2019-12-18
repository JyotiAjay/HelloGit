package com.csi.concept;

import java.util.Scanner;

public class ScannerConcept {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("please enter string");
		String str=sc.next();
		String str2=sc.next();
		System.out.println(str+str2);
	}

}

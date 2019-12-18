package com.csi.switchconcept;

import java.util.Scanner;

public class WrapperSwitchClass {
public static void main(String[] args) {
	Scanner Sc = new Scanner(System.in);
	System.out.println("\n Please enter age");
	 Integer age = Sc.nextInt();
	switch(age){
	case(16):
	System.out.println("You are Under age");
	break;
	case(18):
		System.out.println("You are Eligible for Vote");
	break;
	case(65):
	System.out.println("You are Senior Citizen");
		break;
		default:
			System.out.println("Please enter vaild Data");
	}
}
}

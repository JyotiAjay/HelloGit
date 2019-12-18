package com.csi.concept;

import java.util.Scanner;


public class UnlimitedConcat {

	
	public static void R2 ()
	 {
		 
		 System.out.println("Ajay Singh Pawar");
	 }
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "Jyoti";
		
		
		 
		Scanner sc = new Scanner (System.in);
		for(;;)
		{
		  String input = sc.next();
		  if(input.matches("End"))
		  {
			break;
		  }
		  str = str+input;
		}
		R2();
		System.out.println(str);
	}

	private static void somrtinhg() {
		// TODO Auto-generated method stub
		
	}
}

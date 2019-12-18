package com.csi.concept;

import java.util.Scanner;

public class LeapYear {
	public static void main(String[] args) {
		Scanner sc= new Scanner (System.in);
		int Year=sc.nextInt();
		
		if(Year%100==0){
			System.out.println("Leap Year");
		}else{
		
		   System.out.println("Normal Year");
	}

}
}
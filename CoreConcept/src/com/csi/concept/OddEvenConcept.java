package com.csi.concept;

import java.util.Scanner;

public class OddEvenConcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner SC = new Scanner(System.in);
		int x = SC.nextInt();
	
        if (x%2 == 0){
        	System.out.println("EVEN");
        }
        else{
        	System.out.println("ODD");
        }
	}

}

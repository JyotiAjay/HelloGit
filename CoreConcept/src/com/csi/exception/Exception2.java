package com.csi.exception;

import java.util.Scanner;

public class Exception2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		try {
			int i = Integer.parseInt(s);
			System.out.println(i);
		} catch (NumberFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("Error in Conversion");
			//e is catching throws
		}
	}
}

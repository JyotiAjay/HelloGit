package com.cdi.collectionconcept;

import java.util.ArrayList;
import java.util.Scanner;

public class ProductDetails {
	public static void main(String[] args) {

		ArrayList<String> productList = new ArrayList<>();
		System.out.println("\n Please enter product name:");
		Scanner sc = new Scanner(System.in);
		String productName = sc.next();
		productList.add("MI");
		productList.add("SUMSANG");
		productList.add("LENOVO");
		productList.add("APPLE");
		productList.add("HP");
		productList.add("NOKIA");
		
		if (productList.contains(productName)) {
			System.out.println("Yup Product is available" + productName);
		} else {
			System.out.println("Oops Product is not available" + productName);
		}
	}
}

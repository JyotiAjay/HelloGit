package com.cdi.collectionconcept;

import java.util.LinkedList;
import java.util.Scanner;

public class ColourDetails {
public static void main(String[] args) {
	LinkedList<String>Name= new LinkedList<>();
	System.out.println("\n Please show the colour Name:");
	Scanner sc= new Scanner(System.in);
	String ColourName=sc.next();
	Name.add("RED");
	Name.add("Blue");
	Name.add("Orange");
	Name.add("Black");
	Name.add("White");
	if(Name.contains(ColourName)){
		System.out.println("\n This colour is available:"+ColourName);
	}
	else{
		System.out.println("\n This colour is not available:"+ColourName);
	}
	
	
}
}

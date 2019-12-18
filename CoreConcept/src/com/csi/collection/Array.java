package com.csi.collection;

import java.util.ArrayList;

public class Array {

	public Array() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<String> list = new ArrayList<>();
		list.add("AJAY");
		list.add("SANJAY");
		list.add("VIJAY");
		list.add("JAY");
		list.add("AJAY");
		
		list.forEach(Name -> System.out.println(Name));
	}

}

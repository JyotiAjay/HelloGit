package com.csi.jdkconcept;

interface Customer {
	void get();

}

public class LambadaExpressionConcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Customer cc = () -> {
			System.out.println("Welcome to My Place");
		};
		cc.get();

	}

}

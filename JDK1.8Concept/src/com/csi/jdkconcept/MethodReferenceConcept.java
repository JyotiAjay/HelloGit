package com.csi.jdkconcept;
interface ProductData{
	void get();
}

public class MethodReferenceConcept {
	static void push(){
		System.out.println("WELCOME TO PUNE");
	}

	public static void main(String[] args) {
		ProductData cc= MethodReferenceConcept::push;
		cc.get();
		
	}
}

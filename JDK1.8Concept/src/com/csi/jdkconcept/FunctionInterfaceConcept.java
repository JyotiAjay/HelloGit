package com.csi.jdkconcept;

@FunctionalInterface
interface FunctionalInterfaceConcept {
	void get();

}

class CustomerData implements FunctionalInterfaceConcept {

	@Override
	public void get() {
		// TODO Auto-generated method stub
		System.out.println("Function Interface Concept");
	}

}

public class FunctionInterfaceConcept {

	public static void main(String[] args) {
		CustomerData cd = new CustomerData();
		cd.get();
	}

}

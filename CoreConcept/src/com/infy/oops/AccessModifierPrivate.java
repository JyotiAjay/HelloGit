package com.infy.oops;
class Deptartment1{
	int deptId =121;
}

class  AJAY{
	
	static void f(){
		System.out.println("JAY");
		
	}
	static {
		System.out.println("RAM");
	}
}

public class AccessModifierPrivate {
	public static void main(String[] args) {
		Deptartment1 dd = new Deptartment1();
		System.out.println(dd.deptId);
		AJAY A = new AJAY();		
		String S1 = "AJAY";
		String S2 = "AJAY";
		
		if (S1 == S2)
			System.out.println("Same String");
		else
			System.out.println("NDF");
		
		
	}

}

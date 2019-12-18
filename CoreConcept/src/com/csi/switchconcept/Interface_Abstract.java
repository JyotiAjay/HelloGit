package com.csi.switchconcept;

interface X {
	void Z();
	void GetSalary ();
	void GetPersonalDetails();
}

interface Y extends X {
	void MissingMethod();
}

class J implements Y {

	@Override
	public void Z() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void GetSalary() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void GetPersonalDetails() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void MissingMethod() {
		// TODO Auto-generated method stub
		
	}}


interface z{
	void Z();
}

abstract class A{
	void Deposit (){
		
		int zY=0;
	}
abstract void do_Apply ();	

}

class IMP implements X,z {

	@Override
	public void GetSalary() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void GetPersonalDetails() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void Z() {
		// TODO Auto-generated method stub
		
	}
	
	
}


class EMP extends A {

	@Override
	void do_Apply() {
		// TODO Auto-generated method stub
		
	}
	}

public class Interface_Abstract {
	
	public static void main(String[] args) {
		
	}

}

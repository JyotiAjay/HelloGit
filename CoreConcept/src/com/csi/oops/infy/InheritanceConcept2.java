package com.csi.oops.infy;

class Y{
	
	void M1 () {System.out.println("M1 of class InheritanceConcept2");}
// by defaut all methods and data members are default 
}

class X extends Y{  // extends means ISA relationship composition
	
	void M1 () {System.out.println("M1 of class X");}
	Y y = new Y();  // HASA relationship  Aggregation
}




class InheritanceConcept2{ 
	
	public static void main(String[] args) {
		
		X x = new X ();
		x.M1();
		x.y.M1();
	    	
	}
}
// Variable modification & Method access
/*
 *      Modifier                        Default    public   private  protected
 * 
 * same class                             Y          Y        Y        Y
 * same package subclass                  Y          Y        N        Y
 * same package non subclass              Y          Y        N        Y
 * different package subclass             N          Y        N        Y
 * different package non subclass         N          Y        N        N
 */
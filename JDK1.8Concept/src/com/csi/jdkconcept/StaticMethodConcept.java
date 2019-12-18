package com.csi.jdkconcept;
interface CustomerDetails{
	static void get(int customerId, String customerName) {
		System.out.println("\n Customer Id:"+customerId + "\n Customer Name:"+ customerName);
	}
	default void show (String customerAddress){
		System.out.println("\n Customer Address:"+ customerAddress);
	}
}
class CompanyDetails implements CustomerDetails{
	
}
public class StaticMethodConcept {
public static void main(String[] args) {
	CompanyDetails cd= new CompanyDetails();
	CustomerDetails.get(152, "JERRY");
	cd.show("PUNE");
	System.out.println("HELLO");
	
}

}

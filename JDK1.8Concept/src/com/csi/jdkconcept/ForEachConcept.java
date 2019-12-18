package com.csi.jdkconcept;

import java.util.ArrayList;

class CustomerDatabase{
	int customerId;
	String customerName;
	String customerAddress;
	public CustomerDatabase(int customerId, String customerName, String customerAddress) {
		super();
		this.customerId = customerId;
		this.customerName = customerName;
		this.customerAddress = customerAddress;
	}
	@Override
	public String toString() {
		return "CustomerDatabase [customerId=" + customerId + ", customerName=" + customerName + ", customerAddress="
				+ customerAddress + "]";
	}
		
}

public class ForEachConcept {

	public static void main(String[] args) {
		ArrayList<CustomerDatabase>customerList= new ArrayList<>();
		customerList.add(new CustomerDatabase (125, "TOM", "PUNE"));
		customerList.add(new CustomerDatabase(758, "JERRY", "MP"));
        customerList.add(new CustomerDatabase(785, "MAX", "MH"));
        //customerList.forEach(c->System.out.println(c));
        //customerList.forEach(System.out::println);
        for(CustomerDatabase cc:customerList){
        	System.out.println(cc);
        }
		
	}

}

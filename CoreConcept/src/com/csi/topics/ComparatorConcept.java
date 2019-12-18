package com.csi.topics;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class Customer {
	int customerId;
	String customerName;
	int customerAge;
	String customerAdd;

	public Customer(int customerId, String customerName, int customerAge, String customerAdd) {
		super();
		this.customerId = customerId;
		this.customerName = customerName;
		this.customerAge = customerAge;
		this.customerAdd = customerAdd;
	}

	@Override
	public String toString() {
		return "Customer [customerId=" + customerId + ", customerName=" + customerName + ", customerAge=" + customerAge
				+ ", customerAdd=" + customerAdd + "]";
	}

}

class NameComparator implements Comparator<Customer> {

	@Override
	public int compare(Customer o1, Customer o2) {
		// TODO Auto-generated method stub
		return o1.customerName.compareTo(o2.customerName);
	}

}

class AgeComparator implements Comparator<Customer> {

	@Override
	public int compare(Customer o1, Customer o2) {
		// TODO Auto-generated method stub
		if (o1.customerAge == o2.customerAge) {
			return 0;
		} else if (o1.customerAge > o2.customerAge) {
			return 1;
		} else {

			return -1;
		}
	}

}

public class ComparatorConcept {
	public static void main(String[] args) {
		ArrayList<Customer> customerlist = new ArrayList<>();
		customerlist.add(new Customer(101, "TOM", 18, "PUNE"));
		customerlist.add(new Customer(103, "Dick", 20, "MH"));
		customerlist.add(new Customer(105, "HARRY", 25, "MUMBAI"));
		customerlist.add(new Customer(758, "MARRY", 28, "US"));
		customerlist.add(new Customer(115, "ANUJA", 35, "BHOPAL"));
		System.out.println("\n Age Sorting");
		Collections.sort(customerlist, new AgeComparator());
		customerlist.forEach(cc -> System.out.println(cc));
		//Collections.sort(customerlist, new NameComparator());
		//customerlist.forEach(cc -> System.out.println(cc));
	}
}

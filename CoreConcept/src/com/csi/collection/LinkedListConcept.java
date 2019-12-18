package com.csi.collection;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListConcept {
	public static void main(String[] args) {
		LinkedList<String>al=new LinkedList<>();
		al.add("IT");
		al.add("COMPUTER");
		al.add("ELECTRONICS");
		al.add("PETROLIUM");
		al.add("MECHANICAL");
		al.add("IT");
		al.add("AUTOMOBILE");
		
		/*Iterator<String>itr=al.iterator();
		while (itr.hasNext()){
			System.out.println(itr.next());
		}*/
		//al.forEach(bName->System.out.println(bName));
		//al.forEach(System.out::println);
		for(String branchName:al){
		System.out.println(branchName);
		}
	}


}
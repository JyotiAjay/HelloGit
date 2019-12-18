     package com.csi.collection;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListConcept {
public static void main(String[] args) {
	ArrayList<String>al=new ArrayList<>();
	al.add("IT");
	al.add("COMPUTER");
	al.add("MECHANICAL");
	al.add("PETROLIUM");
	al.add("CIVIL");
	al.add("AUTOMOBILE");
	al.add("IT");
	al.add("ELECTRONICS");
//	al.remove(5);
	/*Iterator<String>itr=al.iterator();
	while(itr.hasNext()){
	System.out.println(itr.next());*/
//al.forEach(bName->System.out.println(bName));
//al.forEach(System.out::println);
	for(String branchName:al){
		System.out.println(branchName);
	}
}
}


package com.csi.collection;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetConcept {
public static void main(String[] args) {
	TreeSet<String> al= new TreeSet<>();
	al.add("IT");
	al.add("MECHANICAL");
	al.add("ELECTRONICS");
	al.add("IT");
	al.add("COMPUTER");//no repeat
	al.add("PETROLIUM");
	/*Iterator<String>itr =al.iterator();// Follow order of branch
	while(itr.hasNext()){
		System.out.println(itr.next());
	}*/
	
	for(String branchName:al){
	System.out.println(branchName);
	}
}
}

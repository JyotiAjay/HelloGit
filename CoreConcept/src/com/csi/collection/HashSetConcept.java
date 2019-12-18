package com.csi.collection;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetConcept {
public static void main(String[] args) {
	HashSet<String>al=new HashSet<>();
	al.add("IT");
	al.add("COMPUTER");
	al.add("ELECTRONICS");
	al.add("HR");
	al.add("MARKETING");
	al.add("IT");
	al.add("FINANCE");//Unorder
/*	Iterator<String> itr=al.iterator();
	while(itr.hasNext()){
		System.out.println(itr.next());}*/
	for(String branchName:al){
		System.out.println(branchName);
	}
}
}

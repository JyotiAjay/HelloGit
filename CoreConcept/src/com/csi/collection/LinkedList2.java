package com.csi.collection;

import java.util.Iterator;
import java.util.LinkedList;

import org.omg.Messaging.SyncScopeHelper;

public class LinkedList2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<String>list=new LinkedList<>();
		list.add("AJAY");
		list.add("SANJAY");
		list.add("VIJAY");
		list.add("JAY");
		list.add("AJAY");
		list.forEach(Name->System.out.println(Name));
//list.forEach(System.out::println);
		/*Iterator<String>itr=list.iterator();
		while(itr.hasNext());
		System.out.println(itr.hasNext());*/
		
	}

}

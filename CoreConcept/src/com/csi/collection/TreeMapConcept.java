package com.csi.collection;

import java.util.Map;
import java.util.TreeMap;

public class TreeMapConcept {
	public static void main(String[] args) {
		TreeMap<String,String>tm = new TreeMap();
		tm.put("ID", "121");
		tm.put("NAME", "JERRY");
		tm.put("SALARY", "45682");
		tm.put("ADDRESS", "PUNE");
		tm.put(null, "4552");// In Tree map we can't using null key bcuz of null pointer exception
		for(Map.Entry<String, String>m:tm.entrySet()){
			System.out.println(m.getKey()+":"+m.getValue());
		}
	}

}

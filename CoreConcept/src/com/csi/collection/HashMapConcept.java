package com.csi.collection;

import java.util.HashMap;
import java.util.Map;

public class HashMapConcept {
public static void main(String[] args) {
	HashMap<String,String>hm=new HashMap();
	hm.put("ID", "121");
	hm.put("NAME", "JARRY");
	hm.put("SALARY", "654552");
	hm.put("ADDRESS", "PUNE");
	hm.put("LONG", "654552");
	hm.put(null, "4526");
	hm.put(null, "135");//latest null get
	for(Map.Entry<String, String>m:hm.entrySet()){
	System.out.println(m.getKey()+":"+m.getValue());	
	}
}
}

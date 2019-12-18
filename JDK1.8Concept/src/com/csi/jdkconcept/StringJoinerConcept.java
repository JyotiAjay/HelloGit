package com.csi.jdkconcept;

import java.util.StringJoiner;

public class StringJoinerConcept {

public static void main(String[] args) {
	StringJoiner sj= new StringJoiner(";");
	sj.add("TCS");
	sj.add("WIPRO");
	sj.add("INFOSYS");
	sj.add("DASSULT");
	System.out.println(sj);
}

}

package com.csi.jdkconcept;

import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamRepeatationConcept {

	public static void main(String[] args) {
		String cName="CREDITSYSTEMINDIA";
		// Space is also count
		String CountryName[]=cName.split("");
		Map<String,Long> m= Arrays.stream(CountryName).collect(Collectors.groupingBy(cc->cc, Collectors.counting()));
	m.forEach((k,v)-> System.out.println(k+":"+v));
	}

}

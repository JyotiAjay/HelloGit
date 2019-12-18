package com.csi.enumconcept;

import com.csi.enumconcept.EnumClass1.Season;

public class EnumClassConcept {
public enum Season{
	WINTER,SPRING,FALL,SUMMER
}
public static void main(String[] args) {
	for(Season s:Season.values()){
		System.out.println(s);
}
System.out.println("Value of WINTER is" +Season.valueOf("WINTER"));
System.out.println("Index of WINTER is" +Season.valueOf("WINTER").ordinal());
System.out.println("Index of SUMMER is" +Season.valueOf("SUMMER").ordinal());

}
}

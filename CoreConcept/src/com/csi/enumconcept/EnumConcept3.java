package com.csi.enumconcept;



public class EnumConcept3 {
	enum Season {
		WINTER, SPRING, SUMMER, FALL;
	}

	public static void main(String[] args) {
		Season s = Season.WINTER;
		System.out.println(s);
	}
}

package com.csi.enumconcept;

public class EnumClass1 {
	public enum Season {
		WINTER, SPRING, SUMMER, FALL
	}

	public static void main(String[] args) {
		for (Season s : Season.values())
			//System.out.println(s);
			if (s.toString().equals("WINTER")){
				System.out.println("Cold Season");
	}

}
}
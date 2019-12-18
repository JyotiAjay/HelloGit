package com.csi.enumconcept;

public class EnumConcept2 {
	public enum Days {
		MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY
	}

	public static void main(String[] args) {
		for (Days D : Days.values())
			// System.out.println(D);
			if (D.toString().equals("MONDAY")) {
				System.out.println("ENERGETIC DAY");
			}

	}

}

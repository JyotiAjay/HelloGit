package com.csi.concept;

public class EnumConcept {
	public enum Months {
		JANUVARY, FEBUVARY, MARCH, APRIL, MAY, JUNE, JULY, AUGEST, SEPTEMBER, OCTOBER, NOVMBER, DECEMBER
	}

	public static void main(String[] args) {
		for (Months month : Months.values())

		{
			//System.out.println(month);
			if (month.toString().equals("MAY"))
			//if I define(;) the value it will give multiple result otherwise it give single result
			
			{
				System.out.println("SUMMER SEASON");
			}
		
	}

}
}
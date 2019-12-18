package com.csi.enumconcept;

public class EnumSwitchClass {
public enum Days{
	MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY
}
public static void main(String[] args) {
	Days day= Days.MONDAY;
	switch(day){
		case MONDAY:
			System.out.println("Monday");
			break;
		case TUESDAY:
			System.out.println("Tuesday");
			break;
			default:
				System.out.println("OtherDay");
	}
}
}

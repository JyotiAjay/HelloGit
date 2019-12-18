package com.csi.switchconcept;

public class SwitchJavaTpoint2 {
	public static void main(String[] args) {
		
	
		String levelString = "Expert";
		int level = 0;
		switch (levelString) {
		case "Beginner":
			level = 1;
			break;
		case "intermediate":
			level = 2;
			break;
		case "Expert":
			level = 3;
			break;
		default:
			level = 0;
		}
		System.out.println("Your Level is: " + level);

	}
}
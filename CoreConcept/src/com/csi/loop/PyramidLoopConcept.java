package com.csi.loop;

public class PyramidLoopConcept {
	/*public static void main(String[] args) {
		for (int i = 1; i <= 8; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();// For New Line
		}
	}*/
	public static void main(String[] args) {
		for(int i=1; i<=5; i++){
			for(int j=5; j>=i; j--){
				System.out.print("*");
			}
			System.out.println();
		}
	}

}

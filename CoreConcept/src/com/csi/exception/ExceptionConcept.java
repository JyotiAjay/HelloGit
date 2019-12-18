package com.csi.exception;

public class ExceptionConcept {
	public static void main(String[] args) {
		/*int i = 50;
		int j = 0;
		int data;
		try {
			data = i / j;
		} catch (Exception e) {
			System.out.println(i / (j + 2));
		}*/
		try{
			int arr[]={3,5,7};
			System.out.println(arr[10]);
		}
catch(ArrayIndexOutOfBoundsException e){
	System.out.println(e);
}
		System.out.println(" I don't know");
	}


}

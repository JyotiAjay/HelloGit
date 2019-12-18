package com.csi.concept;

public class SwapNumber {
	public static void main(String[] args) {
		int num1 = 10, num2 = 20;
		/*temp= num1;
		num1=num2;
		num2=temp;
		System.out.println("\n After Swap");
		System.out.println("\n num1:"+num1+"\n num2:"+num2);*/
				num1= num1+num2;
				num2= num1-num2;
				num1= num1-num2;
				System.out.println("\n num1:"+num1+"\n num2:"+num2);
	}

}

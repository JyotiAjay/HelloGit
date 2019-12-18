package com.csi.loop;

public class LabledForLoopconcept {
	public static void main(String[] args) {
		A:
			for(int i=1;i<=3;i++){
				B:
					for(int j=1; j<=3; j++){
						if(i==2 && j==2){
						break B;
					}
	System.out.println(i+" "+j);
			}
	}
	}
}

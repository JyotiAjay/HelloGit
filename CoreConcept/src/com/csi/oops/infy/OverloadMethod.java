package com.csi.oops.infy;
class Product{
	 void get (int productId){
		System.out.println("\n Product Id: "+productId);
	}
	 void get(int productCode, String productName){
		System.out.println("\n Product Code:"+ productCode+"\n Product Name:"+productName);
	}
	 void get (String productBrand, Double productCost){
		 System.out.println("\n Product Brand :"+productBrand+"\n Product Cost:"+productCost);
	 }
}

public class OverloadMethod {
	public static void main(String[] args) {
		Product P= new Product();
		P.get(123);
		P.get(562, "MI");
		P.get("XIOAMI", 6000.58);
	}

}

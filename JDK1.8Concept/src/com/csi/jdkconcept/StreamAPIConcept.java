package com.csi.jdkconcept;

import java.util.ArrayList;

class Product{
	int productId;
	String productName;
	int productCost;
	public Product(int productId, String productName, int productCost) {
		super();
		this.productId = productId;
		this.productName = productName;
		this.productCost = productCost;
	}
	@Override
	public String toString() {
		return "product [productId=" + productId + ", productName=" + productName + ", productCost=" + productCost
				+ "]";
	}
}
public class StreamAPIConcept {
	public static void main(String[] args) {
		ArrayList<Product>productlist= new ArrayList<>();
		productlist.add(new Product(123, "MI", 60000));
		productlist.add(new Product(456, "ASUS", 80000));
		productlist.add(new Product(789, "SAMSUNG", 90000));
		productlist.add(new Product(963, "Iphone", 80000));
		
		productlist.stream().filter(Product->Product.productName=="MI").forEach(System.out::println);
		productlist.stream().filter(Product->Product.productCost==80000).forEach(System.out::println);
		
		
	}
}

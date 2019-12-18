package com.csi.jdkconcept;

import java.util.Arrays;

public class ParallelSortConcept {
	public static void main(String[] args) {
		int arr[] = { 4, 2, 9, 8, 3, 7 };
		System.out.println("\n Before Sort the element:");
		for (int i : arr) {
			System.out.println(i);
		}
		Arrays.parallelSort(arr);
		System.out.println("\n After Sort the element");
		for (int i : arr) {
			System.out.println(i);
		}

	}
}

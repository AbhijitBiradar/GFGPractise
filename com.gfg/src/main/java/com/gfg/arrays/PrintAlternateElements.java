package com.gfg.arrays;

// Reference
// https://practice.geeksforgeeks.org/problems/print-alternate-elements-of-an-array/1?page=1&difficulty[]=-2&category[]=Arrays&sortBy=submissions

public class PrintAlternateElements {

	public static void print(int arr[], int n) {
		for (int i = 0; i < n; i = i + 2) {
			System.out.print(arr[i] + " ");
		}
	}

	public static void main(String[] args) {

		int[] array1 = { 1, 2, 3, 4, 5 };
		print(array1, 5);
	}
}

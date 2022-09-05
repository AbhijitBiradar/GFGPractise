package com.gfg.arrays;

// Reference
// https://practice.geeksforgeeks.org/problems/missing-number-in-array1416/1?page=1&difficulty[]=0&category[]=Arrays&sortBy=submissions

public class MissingNumberInArray {

	int MissingNumber(int array[], int n) {
		int sum = (n * (n + 1) / 2);

		for (int i = 0; i < n - 1; i++) {
			sum = sum - array[i];
		}
		return sum;
	}

	public static void main(String[] args) {
		int[] arr2 = { 1, 2, 3, 4, 5, 7 };
		MissingNumberInArray obj = new MissingNumberInArray();
		System.out.println("Missing Number : " + obj.MissingNumber(arr2, 6));

	}

}

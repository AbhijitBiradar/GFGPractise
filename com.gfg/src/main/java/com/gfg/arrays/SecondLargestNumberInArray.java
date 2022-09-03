package com.gfg.arrays;

// Reference
// https://practice.geeksforgeeks.org/problems/second-largest3735/1?page=1&difficulty[]=-2&category[]=Arrays&sortBy=submissions

public class SecondLargestNumberInArray {

	int print2largest(int arr[], int n) {
		int firstLargest = -1;
		int secondLargest = -1;

		for (int i = 0; i < n; i++) {
			if (arr[i] > firstLargest) {
				secondLargest = firstLargest;
				firstLargest = arr[i];
			} else if (arr[i] > secondLargest && arr[i] != firstLargest) {
				secondLargest = arr[i];
			}
		}
		return secondLargest;
	}

	public static void main(String[] args) {

		int[] arr = { 3, 4, 6, 7, 9, 10 };

		SecondLargestNumberInArray obj = new SecondLargestNumberInArray();
		System.out.println(obj.print2largest(arr, 6));
	}

}

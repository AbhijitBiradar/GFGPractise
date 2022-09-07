package com.gfg.arrays;

// Refer
// https://practice.geeksforgeeks.org/problems/binary-search-1587115620/1?page=1&difficulty[]=-1&category[]=Arrays&sortBy=submissions

public class BinarySearch {
	int binarysearch(int arr[], int n, int k) {
		if (arr == null || arr.length == 0) {
			return -1;
		}

		int low = 0;
		int high = n - 1;

		while (low <= high) {
			int mid = (low + high) / 2;

			if (arr[mid] == k) {
				return mid;
			}

			if (k < arr[mid]) {
				high = mid - 1;
			}

			if (k > arr[mid]) {
				low = mid + 1;
			}
		}
		return -1;
	}

	public static void main(String[] args) {
		BinarySearch bs = new BinarySearch();
		int[] nums = { 1, 10, 20, 47, 59, 65, 75, 88, 99 };
		System.out.println(bs.binarysearch(nums, 9, 65));
	}
}

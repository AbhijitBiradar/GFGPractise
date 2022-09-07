package com.gfg.arrays;

import java.util.Arrays;

// Refer
// https://practice.geeksforgeeks.org/problems/find-triplets-with-zero-sum/1?page=1&difficulty[]=-1&category[]=Arrays&sortBy=submissions

public class FindTriplets {
	public boolean findTriplets(int arr[], int n) {
		Arrays.sort(arr);

		for (int i = 0; i < n; i++) {
			int low = i + 1;
			int high = n - 1;
			while (low < high) {
				int sum = arr[i] + arr[low] + arr[high];
				if (sum == 0) {
					return true;
				} else if (sum < 0) {
					low++;
				} else {
					high--;
				}
			}

		}
		return false;
	}
	
	public static void main(String[] args) {
		FindTriplets ft = new FindTriplets();
		int[] nums = { 1, 10, 20, 47, 59, 65, 75, 88, 99 };
		System.out.println(ft.findTriplets(nums, 9));
	}
}

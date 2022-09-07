package com.gfg.arrays;

import java.util.ArrayList;

// Refer
// https://practice.geeksforgeeks.org/problems/reverse-array-in-groups0255/1?page=1&difficulty[]=-1&category[]=Arrays&sortBy=submissions

public class ReverseArrayInGroups {
	// Function to reverse every sub-array group of size k.
	void reverseInGroups(ArrayList<Integer> arr, int n, int k) {
		for (int i = 0; i < n; i = i + k) {
			int start = i;
			int end = Math.min(i + k - 1, n - 1);
			while (start < end) {
				int temp = arr.get(start);
				arr.set(start, arr.get(end));
				arr.set(end, temp);
				start++;
				end--;
			}
		}
	}

	public static void main(String[] args) {
		ReverseArrayInGroups raig = new ReverseArrayInGroups();
		ArrayList<Integer> nums = new ArrayList<Integer>();
		nums.add(1);
		nums.add(3);
		nums.add(5);
		nums.add(7);
		nums.add(9);
		nums.add(11);
		raig.reverseInGroups(nums, 6, 3);
		
		
	}
}

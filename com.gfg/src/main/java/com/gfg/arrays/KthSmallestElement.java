package com.gfg.arrays;

import java.util.Random;

// Refer
// https://practice.geeksforgeeks.org/problems/kth-smallest-element5635/1?page=1&difficulty[]=1&category[]=Arrays&sortBy=submissions
// Not understood

public class KthSmallestElement {

	public static int kthSmallest(int[] arr, int l, int r, int k) {

		if (r == 0) {
			return arr[0];
		}

		while (l < r) {
			int p = partition(arr, l, r);
			if (p == k - 1) {
				return arr[p];
			} else if (p < k - 1) {
				l = p + 1;
			} else {
				r = p - 1;
			}
		}

		return arr[l];

	}

	public static int partition(int[] arr, int l, int r) {

		Random random = new Random();
		int pivot_index = random.nextInt(r - l) + l;

		int pivot = arr[pivot_index];
		swap(arr, r, pivot_index);

		int left = l;

		for (int i = left; i <= r; i++) {
			if (arr[i] < pivot) {
				swap(arr, i, left);
				left++;
			}
		}
		swap(arr, r, left);
		return left;

	}

	public static void swap(int[] arr, int i, int j) {

		int t = arr[i];
		arr[i] = arr[j];
		arr[j] = t;

	}

	public static void main(String[] args) {
		int[] arr = {7, 10, 4, 3, 20, 15};		
		System.out.println(KthSmallestElement.kthSmallest(arr, 0, 5, 3));

	}

}

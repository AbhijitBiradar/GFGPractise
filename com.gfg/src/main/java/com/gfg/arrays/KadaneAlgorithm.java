package com.gfg.arrays;

// Refer
// https://practice.geeksforgeeks.org/problems/kadanes-algorithm-1587115620/1?page=1&difficulty[]=1&category[]=Arrays&sortBy=submissions
// Not Understood

public class KadaneAlgorithm {

	long maxSubarraySum(int arr[], int n) {
		long max = arr[0];
		long sum = max;
		for (int i = 1; i < n; i++) {
			sum = Math.max(arr[i], sum + arr[i]);
			max = Math.max(max, sum);
		}
		return max;
	}

	public static void main(String[] args) {
		KadaneAlgorithm ka = new KadaneAlgorithm();
		int[] arr = {1,2,3,-2,5};
		System.out.println(ka.maxSubarraySum(arr, 5));
	}

}

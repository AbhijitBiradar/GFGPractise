package com.gfg.arrays;

import java.util.Arrays;

// Refer
// https://practice.geeksforgeeks.org/problems/swap-and-maximize5859/1

public class SwapAndMaximize {
//first we sort then we take the first and last element and substract it and then we substract the first+1 from the last element and increase the i value and decrease the j value and follow till the i<j. once this condition is hit then we substract the first element from the element which is at ith position as the array is to be considered circular.

	long maxSum(long arr[], int n) {
		Arrays.sort(arr);
		int i = 0;
		int j = n - 1;
		long sum = 0;
		while (i < j) {
			sum += Math.abs(arr[i] - arr[j]);
			sum += Math.abs(arr[i + 1] - arr[j]);
			i++;
			j--;
		}
		sum += Math.abs(arr[0] - arr[i]);
		return sum;

	}
	
	public static void main(String[] args) {
		SwapAndMaximize sm = new SwapAndMaximize();
		long[] nums = { 1, 10, 20, 47, 59, 65, 75, 88, 99 };
		long sum= sm.maxSum(nums, 9);
		System.out.println(sum);
	}
}

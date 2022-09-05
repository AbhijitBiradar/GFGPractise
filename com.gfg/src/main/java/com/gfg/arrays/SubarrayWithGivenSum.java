package com.gfg.arrays;

import java.util.ArrayList;

// Reference
// https://practice.geeksforgeeks.org/problems/subarray-with-given-sum-1587115621/1?page=1&difficulty[]=0&category[]=Arrays&sortBy=submissions

public class SubarrayWithGivenSum {

	static ArrayList<Integer> subarraySum(int[] arr, int n, int s) {
		int sum = 0;
		int start = 0;

		ArrayList<Integer> ar = new ArrayList<Integer>();
		for (int i = 0; i < n; i++) {
			sum = sum + arr[i];

			if (sum == s) {

				ar.add(start + 1);// starting index
				ar.add(i + 1);// end index

				return ar;

			} else if (sum > s) {
				sum = 0;
				i = start;
				start++;
			}
		}
		ArrayList<Integer> a = new ArrayList<Integer>();
		a.add(-1);
		return a;
	}

	public static void main(String[] args) {
		int[] arr2 = {1,2,3,4,5,6,7,8,9,10};

		SubarrayWithGivenSum obj =new SubarrayWithGivenSum();
		System.out.println("Sum Index range " + obj.subarraySum(arr2, 10, 15));
	}

}

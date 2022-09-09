package com.gfg.arrays;

import java.util.Arrays;

// Refer
// https://practice.geeksforgeeks.org/problems/minimize-the-heights3351/1?page=1&difficulty[]=1&category[]=Arrays&sortBy=submissions
// Not Understood

public class MinimizeTheHeights2 {

	int getMinDiff(int[] arr, int n, int k) {
		Arrays.sort(arr);
		int mini, maxi;
		int result = arr[n - 1] - arr[0];
		for (int i = 1; i < n; i++) {
			maxi = Math.max(arr[i - 1] + k, arr[n - 1] - k);
			mini = Math.min(arr[i] - k, arr[0] + k);
			if (mini < 0)
				continue;
			result = Math.min(result, maxi - mini);
		}
		return result;
	}

	public static void main(String[] args) {
		MinimizeTheHeights2 mth2=new MinimizeTheHeights2();
		int[] arr = {1, 5, 8, 10};
		
		System.out.println(mth2.getMinDiff(arr, 4, 2));
	}

}

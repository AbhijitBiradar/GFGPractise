package com.gfg.arrays;

public class MinimumDistanceBetweenTwoNumbers {
	int minDist(int a[], int n, int x, int y) {
		int distance = Integer.MAX_VALUE;
		int indexOfX = Integer.MAX_VALUE;
		int indexOfY = Integer.MAX_VALUE;

		for (int i = 0; i < n; i++) {
			if (a[i] == x) {
				indexOfX = i + 1;
			}
			if (a[i] == y) {
				indexOfY = i + 1;
			}
			if (indexOfX != Integer.MAX_VALUE && indexOfY != Integer.MAX_VALUE) {
				distance = Math.min(distance, Math.abs(indexOfY - indexOfX));
			}
		}
		if (distance == Integer.MAX_VALUE) {
			distance = -1;
		}
		return distance;
	}

	public static void main(String[] args) {
		MinimumDistanceBetweenTwoNumbers mdbtn = new MinimumDistanceBetweenTwoNumbers();
		int[] nums = { 1, 10, 20, 47, 59, 65, 75, 88, 99 };
		System.out.println(mdbtn.minDist(nums, 9, 1, 75));

	}
}

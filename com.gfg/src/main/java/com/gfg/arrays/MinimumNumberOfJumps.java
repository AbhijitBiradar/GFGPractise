package com.gfg.arrays;

// Refer
// https://practice.geeksforgeeks.org/problems/minimum-number-of-jumps-1587115620/1?page=1&difficulty[]=1&category[]=Arrays&sortBy=submissions
// Not Understood

public class MinimumNumberOfJumps {
	static int minJumps(int[] arr) {
		int target = arr.length - 1, jumps = 0;// target will be our destination;
		while (target != 0)// until our target becomes start
		{
			int i = 0;
			for (; i < target; i++) {
				if (i + arr[i] >= target) {
					++jumps;
					break;
				} // when target can be reached,next target will be point from which the target is
					// reached
			}
			if (i == target)
				return -1;
			else
				target = i;// when target can't be reached
		}
		return jumps;
	}

	public static void main(String[] args) {
		MinimumNumberOfJumps mnoj = new MinimumNumberOfJumps();
		int[] nums = { 1, 3, 5, 8, 9, 2, 6, 7, 6, 8, 9 };
		System.out.println(mnoj.minJumps(nums));
	}
}

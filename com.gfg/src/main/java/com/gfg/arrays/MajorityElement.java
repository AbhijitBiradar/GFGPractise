package com.gfg.arrays;

import java.util.HashMap;
import java.util.Map;

// Refer
// https://practice.geeksforgeeks.org/problems/majority-element-1587115620/1?page=1&difficulty[]=1&category[]=Arrays&sortBy=submissions
// Not Understood

public class MajorityElement {

	static int majorityElement(int a[], int size) {
		int result = -1;
		Map<Integer, Integer> map = new HashMap<>();

		int appearRate = size / 2;

		for (int i = 0; i < size; i++) {
			int key = a[i];
			if (map.containsKey(key)) {
				int occurRate = map.get(key) + 1;

				if (occurRate > appearRate) {
					result = key;
					break;
				}
				map.put(key, occurRate);
			} else {
				map.put(key, 1);
				if (appearRate == 0)
					result = key;
			}
		}
		return result;
	}

	public static void main(String[] args) {
		int[] arr = {3,1,3,3,2};				
		System.out.println(MajorityElement.majorityElement(arr, 5));

	}

}

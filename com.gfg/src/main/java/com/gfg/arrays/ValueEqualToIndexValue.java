package com.gfg.arrays;

import java.util.ArrayList;

// Reference
// https://practice.geeksforgeeks.org/problems/value-equal-to-index-value1330/1?page=1&difficulty[]=-2&category[]=Arrays&sortBy=submissions

public class ValueEqualToIndexValue {

	ArrayList<Integer> valueEqualToIndex(int arr[], int n) {

		ArrayList<Integer> list = new ArrayList<Integer>();

		for (int i = 0; i < n; i++) {
			int currEle = arr[i];
			if (currEle == (i + 1)) {
				list.add(i + 1);
			}
		}

		return list;
	}

	public static void main(String[] args) {
		int[] arr = { 1, 5, 6, 8, 9, 1, 7 };

		ArrayList<Integer> list2 = new ArrayList<Integer>();

		ValueEqualToIndexValue obj = new ValueEqualToIndexValue();
		list2 = obj.valueEqualToIndex(arr, 7);

		System.out.println(list2);

	}

}

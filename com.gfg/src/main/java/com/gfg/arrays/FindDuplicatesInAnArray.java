package com.gfg.arrays;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

// Reference
// https://practice.geeksforgeeks.org/problems/find-duplicates-in-an-array/1?page=1&difficulty[]=0&category[]=Arrays&sortBy=submissions

public class FindDuplicatesInAnArray {

	public static ArrayList<Integer> duplicates(int arr[], int n) {
		HashMap<Integer, Integer> originalMap = new HashMap<Integer, Integer>();
		ArrayList<Integer> duplicateArray = new ArrayList<Integer>();

		// put the number and its occurances in the hashmap
		for (int i = 0; i < n; i++) {
			if (originalMap.containsKey(arr[i])) {
				originalMap.put(arr[i], originalMap.get(arr[i]) + 1);
			} else {
				originalMap.put(arr[i], 1);
			}
		}

		// check for duplicates and adding it to arraylist
		for (Map.Entry<Integer, Integer> item : originalMap.entrySet()) {
			if (item.getValue() > 1) {
				duplicateArray.add(item.getKey());
			}
		}
		if (duplicateArray.size() == 0) {
			duplicateArray.add(-1);
		}
		Collections.sort(duplicateArray);
		return duplicateArray;
	}

	public static void main(String[] args) {
		int[] arr2 = {2,3,1,2,3};
		
		FindDuplicatesInAnArray obj = new FindDuplicatesInAnArray();
		System.out.println(obj.duplicates(arr2, 5));

	}

}

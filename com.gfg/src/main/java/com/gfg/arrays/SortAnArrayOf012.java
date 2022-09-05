package com.gfg.arrays;

// Reference
// https://practice.geeksforgeeks.org/problems/sort-an-array-of-0s-1s-and-2s4231/1?page=1&difficulty[]=0&category[]=Arrays&sortBy=submissions

public class SortAnArrayOf012 {

	public static void sort012(int a[], int n) {
		int zero = 0, one = 0, two = 0;

		for (int i = 0; i < a.length; i++) {
			if (a[i] == 0) {
				zero++;
			} else if (a[i] == 1) {
				one++;
			} else {
				two++;
			}
		}

		int index = 0;

		for (int i = 0; i < zero; i++) {
			a[index++] = 0;
		}
		for (int i = 0; i < one; i++) {
			a[index++] = 1;
		}

		for (int i = 0; i < two; i++) {
			a[index++] = 2;
		}
	}

	public static void main(String[] args) {
		int[] arr2 = { 0, 2, 1, 2, 0 };

		SortAnArrayOf012.sort012(arr2, 5);

		for (int i = 0; i < arr2.length; i++) {
			System.out.print(arr2[i] + " ");
		}

	}

}

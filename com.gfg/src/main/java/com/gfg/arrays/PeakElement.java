package com.gfg.arrays;

// Reference
// https://practice.geeksforgeeks.org/problems/peak-element/1?page=1&difficulty[]=0&category[]=Arrays&sortBy=submissions


public class PeakElement {

	public int peakElement(int[] arr, int n) {
		int max = arr[0];
		int maxValueIndex = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > max) {
				max = arr[i];
				maxValueIndex = i;
			}
		}
		return maxValueIndex;
	}

	public static void main(String[] args) {
		int[] array1 = { 1, 2, 6, 4, 5 };

		PeakElement obj = new PeakElement();
		System.out.println("Peak Element: " + obj.peakElement(array1, 5));
	}
}

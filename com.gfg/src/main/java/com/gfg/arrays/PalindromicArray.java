package com.gfg.arrays;

// Refer
// https://practice.geeksforgeeks.org/problems/palindromic-array-1587115620/1?page=1&difficulty[]=-2&category[]=Arrays&sortBy=submissions

public class PalindromicArray {
	public static boolean isPalin(int num) {
		int reversedNum = 0, remainder;
		int originalNum = num;

		while (num != 0) {
			remainder = num % 10;
			reversedNum = reversedNum * 10 + remainder;
			num /= 10;
		}

		if (originalNum == reversedNum) {
			return true;
		} else {
			return false;
		}
	}

	public static int palinArray(int[] a, int n) {
		int flag = 0;
		for (int i = 0; i < n; i++) {
			if (isPalin(a[i])) {
				flag++;
			}
		}

		if (flag == n) {
			return 1;
		} else {
			return 0;
		}
	}

	public static void main(String[] args) {
		int[] arr = { 111, 543, 6546, 812, 911, 165, 7777 };
		int[] arr2 = { 111, 7777, 22, 333 };

		PalindromicArray obj = new PalindromicArray();
		int status = obj.palinArray(arr2, 4);

		if (status == 1) {
			System.out.println("Palindromr array!");
		} else {
			System.out.println("Not a Palindromr array!");
		}
	}
}

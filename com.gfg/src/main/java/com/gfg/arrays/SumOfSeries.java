package com.gfg.arrays;

// Reference
// https://practice.geeksforgeeks.org/problems/sum-of-series2811/1?page=1&difficulty[]=-2&category[]=Arrays&sortBy=submissions

public class SumOfSeries {

	// function to return sum of 1, 2, ... n
	long seriesSum(int n) {
		// code here
		long a = n;
		return a * (a + 1) / 2;
	}

	public static void main(String[] args) {
		SumOfSeries obj = new SumOfSeries();
		System.out.println("Total Sum : " + obj.seriesSum(150));

	}

}

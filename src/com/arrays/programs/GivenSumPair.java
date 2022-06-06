package com.arrays.programs;

/*
 * Ref : https://www.geeksforgeeks.org/given-a-sorted-and-rotated-array-find-if-there-is-a-pair-with-a-given-sum/
 */
public class GivenSumPair {

	public static void main(String[] args) {

		int arr[]= {11, 15, 6, 8, 9, 10};
		int x = 16;
		
		System.out.println(pairInSortedRotated(arr, arr.length, x));
	}

	static boolean pairInSortedRotated(int arr[],int n, int x) {
		
		for(int i=0;i<n/2;i++) {
			
			System.out.println(arr[i] +"--"+arr[n-i-1]);
			
			//if(x-arr[i])
			
			
		}
		return false;		
	}
}

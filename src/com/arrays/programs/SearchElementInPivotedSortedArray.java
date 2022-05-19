package com.arrays.programs;

/*
 * https://www.geeksforgeeks.org/search-an-element-in-a-sorted-and-pivoted-array/
 * 
 * Input  : arr[] = {5, 6, 7, 8, 9, 10, 1, 2, 3};
         key = 3
   Output : Found at index 8
   
   Input  : arr[] = {5, 6, 7, 8, 9, 10, 1, 2, 3};
         key = 30
   Output : Not found

   Input : arr[] = {30, 40, 50, 10, 20}
        key = 10   
   Output : Found at index 3
 * 
 */
public class SearchElementInPivotedSortedArray {

	public static void main(String[] args) {
		int arr[] = {30, 40, 50, 10, 20};
		int key =10;
		
		int pivotIndex =0;
		int arrayLength = arr.length;
		for(int i=0;i<arrayLength/2;i++) {
			if(arr[i]>arr[i+1]) {
				pivotIndex = i;
				break;
			}
			if(arr[arrayLength-i-1]<arr[arrayLength-i-2]) {
				pivotIndex = i+(arrayLength/2)-1;
				break;
			}
		}
		
		searchElementInPivotedArray(arr, key, pivotIndex, arrayLength);
		
		
	}

	private static boolean searchElementInPivotedArray(int[] arr, int key, int pivotIndex, int arrayLength) {
		if(arr[pivotIndex+1]<=key && arr[arrayLength-1]>=key) {
			// inside right array
			for(int i=pivotIndex+1;i<arrayLength;i++) {
				if(arr[i]==key) {
					System.out.println("Found at index "+i);
					return true;
				}
			}
		}else {
			//  inside left array
			for(int i=0;i<pivotIndex+1;i++) {
				if(arr[i]==key) {
					System.out.println("Found at index "+i);
					return true;
				}
			}
		}
		System.out.println(" Not found");
		return false;
	}

}

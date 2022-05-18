package com.arrays.programs;

import java.util.Arrays;

public class KthLargestElement {

	public static void main(String[] args) {
		int arr[] = {1,2,3,4,5,6};
		int k = 2;
		System.out.println("Input : "+Arrays.toString(arr));
		if(arr==null || arr.length==0) {
			System.out.println("Empty or Null Array is not allowed.");
			return;
		}
		
		System.out.println("KthLargestElement : "+findKthLargest(arr, k));

	}

	public static int findKthLargest(int[] nums, int k) {
		
		// bubble sorting 
	    int arrayLength = nums.length;
	    boolean swapped;
		for(int i=0;i<arrayLength;i++) {
			swapped = false;
	    	   for(int j=0;j<arrayLength-i-1;j++) {	    		   
	    		   if(nums[j]>nums[j+1]) {
	    			   int temp = nums[j];
	    			   nums[j]=nums[j+1];
	    			   nums[j+1]=temp;	
	    			   swapped = true;
	    		   }
	    	   }
	    	  if(swapped = false) {
	    		  break;
	    	  }
	       }	    
		return nums[arrayLength-k];
    }
}

package com.arrays.programs;

import java.util.Arrays;

public class KthSmallestElement {

	public static void main(String[] args) {
		int arr[] = {1,2,3,4,5,6};
		int k = 2;
		System.out.println("Input : "+Arrays.toString(arr));
		if(arr==null || arr.length==0) {
			System.out.println("Empty or Null Array is not allowed.");
			return;
		}
		
		System.out.println("KthSmallestElement : "+findKthSmallest(arr, k));

	}

	public static int findKthSmallest(int[] arr,  int k) {
		
		// bubble sorting 
	    int arrayLength = arr.length;
		for(int i=0;i<arrayLength;i++) {
	    	   for(int j=0;j<arrayLength-i-1;j++) {	    		   
	    		   if(arr[j]>arr[j+1]) {
	    			   int temp = arr[j];
	    			   arr[j]=arr[j+1];
	    			   arr[j+1]=temp;	
	    		   }
	    	   }
	    	  
	       }	    
		return arr[k-1];
    }
}

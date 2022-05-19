package com.arrays.programs;

import java.util.Arrays;

/*
 * https://www.geeksforgeeks.org/chocolate-distribution-problem/
 * 
 * Input : arr[] = {12, 4, 7, 9, 2, 23, 25, 41,30, 40, 28, 42, 30, 44, 48,43, 50} , noOfStudents =7
 * Output : 10 (i.e., 50-40)  ,selected packets:  {40, 41,42, 44, 48, 43 , 50}
 * 
 * Input : arr[] = {3, 4, 1, 9, 56, 7, 9, 12} , noOfStudents = 5 
 * Output : 6 (i.e., 9-3 = 6) ,selected packets: {3,4,7,9,9}
 */
public class ChocolateDistributionProblem {

	public static void main(String[] args) {
		int arr[] = {3, 4, 1, 9, 56, 7, 9, 12};
		
		System.out.println("Minimum Difference : "+findMinDiff(arr, 5, arr.length));
		
		
	}
	
    static int findMinDiff(int arr[], int noOfStudents, int arrayLength)
    {
    	// sort array    	
    	Arrays.sort(arr);
    	int minDiff = arr[arrayLength-1]; // assign last element as this will be the max number in array
    	// iterate through array and find the pair with min difference by considering the no of Students length 
    	for(int i=0;i<arrayLength;i++) {      		
    		if((i+noOfStudents)<=arrayLength) {  
    			if((arr[i+noOfStudents-1]-arr[i])<minDiff) {
    				minDiff = arr[i+noOfStudents-1]-arr[i];
    			}    			
    		}    		
    	}
	
    	return minDiff;
		
    }

}

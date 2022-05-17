package com.arrays.programs;

import java.util.Arrays;

/*
 * https://leetcode.com/problems/maximum-subarray/
 */
public class MaxSumSubArray {

	public static void main(String[] args) {

		int arr[] = {-1,0,-2};
		//********************[5,4,-1,7,8]********************O/p : 23 ****
		// 5 -- 5,4 -- 5,4,-1 -- 5,4,-1 -- 5,4,-1,7 -- 5,4,-1,7,8
		// 4 -- 4,-1  -- 4,-1,7 -- 4,-1,7,8
		//-1 -- -1,7  -- -1,7,8 
		// 7 -- 7,8
		// 8 
		
		//********************{-2,1,-3,4,-1,2,1,-5,4}********************O/p : 6 ****
		//{-2}  -- {-2,1} -- {-2,1,-3} -- {-2,1,-3,4} -- {-2,1,-3,4,-1} -- {-2,1,-3,4,-1,2} -- {-2,1,-3,4,-1,2,1} -- {-2,1,-3,4,-1,2,1,-5} -- {-2,1,-3,4,-1,2,1,-5,4}
		//{1}   -- {1,-3} -- {1,-3,4} -- {1,-3,4,-1} -- {1,-3,4,-1,2} -- {1,-3,4,-1,2,1} -- {1,-3,4,-1,2,1,-5} -- {1,-3,4,-1,2,1,-5,4}
		//{-3}  -- {-3,4} -- {-3,4,-1} -- {-3,4,-1,2} -- {-3,4,-1,2,1} -- {-3,4,-1,2,1,-5} -- {-3,4,-1,2,1,-5,4}
		//{4}   -- {4,-1} -- {4,-1,2} -- {4,-1,2,1} -- {4,-1,2,1,-5} -- {4,-1,2,1,-5,4}
		//{-1}  -- {-1,2} -- {-1,2,1} -- {-1,2,1,-5} -- {-1,2,1,-5,4}
		//{2}   -- {2,1} -- {2,1,-5} -- {2,1,-5,4}
		//{1}   -- {1,-5} -- {1,-5,4}
		//{-5}  -- {-5,4}
		//{4}
		
		//*********************{-2,1}********************O/p : 1 *****
		// {-2} {-2,1}
		// {1}
		
		//*********************{-1,0,-2}********************O/p : 0 *****
		//{-1} {-1,0} {-1,0,-2}
		//{0} {0,-2}
		//{-2}
		
		System.out.println("Input : "+Arrays.toString(arr));
		if(arr==null || arr.length==0) {
			System.out.println("Empty or Null Array is not allowed.");
			return;
		}
		
		firstMethod(arr);
		
	}
	
	private static void firstMethod(int[] arr) {
		System.out.println("*******************Simple iteration**********************");
		int finalSum=arr[0];
		for(int i=0;i<arr.length;i++) {
			int cumulativeSum=arr[i];
			int maxSum=arr[i];
			for(int j=i+1;j<arr.length;j++) {
				cumulativeSum += arr[j];
				if(cumulativeSum>maxSum) {
					maxSum = cumulativeSum;
				}
			}	
			if(maxSum>finalSum) {
				finalSum = maxSum;
			}
		}
		System.out.println("Max sum of SubArray : "+finalSum);
	}

}

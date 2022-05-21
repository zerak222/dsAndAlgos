package com.arrays.programs;

public class MinimumInRotatedSortedArray {

	public static void main(String[] args) {
		
		int arr[]= {11,13,15,17};		
		System.out.println(findMin(arr));

	}
	
	public static int findMin(int[] nums) {       
		int minNumber =nums[0];
		for(int i=0;i<=(nums.length)/2;i++) {
			if(nums[i]<nums[nums.length-i-1] && nums[i]<minNumber) {
				minNumber = nums[i];
			}else if(nums[i]>nums[nums.length-i-1] && nums[nums.length-i-1]<minNumber) {
				minNumber =nums[nums.length-i-1];
			}else if(nums[i]==nums[nums.length-i-1] && nums[i]<minNumber){
				minNumber =nums[i];
			}
		}		
		return minNumber;
    }

}

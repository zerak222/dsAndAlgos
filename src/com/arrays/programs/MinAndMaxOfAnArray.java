package com.arrays.programs;

import java.util.Arrays;
/*
 * Ref : https://www.geeksforgeeks.org/maximum-and-minimum-in-an-array/
 */
public class MinAndMaxOfAnArray {

	public static void main(String[] args) {

		int arr[] = {40,20,30,10,60,50};		
		
		System.out.println("Input : "+Arrays.toString(arr));
		if(arr==null || arr.length==0) {
			System.out.println("Empty or Null Array is not allowed.");
			return;
		}
		
		firstWay(arr);
		secondWay(arr);
		thirdWay(arr);
		
	}
	
	private static void firstWay(int[] aInputArray) {
		System.out.println("*******************Simple iteration**********************");
		
		int min = aInputArray[0];
		int max = aInputArray[0];
		int count =0;
		for(int i=0;i<aInputArray.length;i++) {
			if(aInputArray[i]<min) {
				min = aInputArray[i];
			}
			if(aInputArray[i]>max) {
				max = aInputArray[i];
			}
			count++;
		}		
		System.out.println("Min value : "+min);
		System.out.println("Max value : "+max);
		System.out.println("Loop count : "+count);
	}
	private static void secondWay(int[] aInputArray) {
		System.out.println("*******************Compare in Pairs**********************");
		// Referred from GFG
		int min = aInputArray[0];
		int max = aInputArray[0];
		int count =0;
		
		for(int i=0;i<aInputArray.length;i=i+2) {			
			if(aInputArray[i]>aInputArray[i+1]) {
				if(aInputArray[i]>max) {
					max=aInputArray[i];
				}
				if(aInputArray[i+1]<min) {
					min=aInputArray[i+1];
				}
			}else if(aInputArray[i+1]>aInputArray[i]) {
				if(aInputArray[i+1]>max) {
					max=aInputArray[i+1];
				}
				if(aInputArray[i]<min) {
					min=aInputArray[i];
				}
			}
			count++;
		}
		System.out.println("Min value : "+min);
		System.out.println("Max value : "+max);
		System.out.println("Loop count : "+count);		
	}
	private static void thirdWay(int[] aInputArray) {
		System.out.println("*******************Divide and Conquer**********************");
		// Referred from GFG
		int min = aInputArray[0];
		int max = aInputArray[0];
		int count =0;
		
		
		
		
		System.out.println("Min value : "+min);
		System.out.println("Max value : "+max);
		System.out.println("Loop count : "+count);
	}

}

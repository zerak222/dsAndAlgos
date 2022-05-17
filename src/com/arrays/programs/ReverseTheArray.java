package com.arrays.programs;

import java.util.Arrays;

public class ReverseTheArray {

	public static void main(String[] args) {

		int arr[] = {40,20,30,10,60,50};
		
		firstWay(arr);
	}

	private static void firstWay(int[] aInputArray) {
		
		int index = aInputArray.length;
		int reversedArray[] =new int [aInputArray.length];
		for(int i=aInputArray.length-1;i>=0;i--) {
			reversedArray[index-i-1]=aInputArray[i];
		}		
		System.out.println(Arrays.toString(reversedArray));		
	}

}

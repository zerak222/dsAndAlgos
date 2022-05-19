package com.arrays.programs;

import java.util.Arrays;

public class ReverseTheArray {

	public static void main(String[] args) {

		int arr[] = {40,20,30,10,60,50};
		
		firstWay(arr);
		secondWay(arr);
	}

	private static void firstWay(int[] aInputArray) {
		System.out.println("***************FirstWay******************");
		int index = aInputArray.length;
		int reversedArray[] =new int [aInputArray.length];
		for(int i=aInputArray.length-1;i>=0;i--) {
			reversedArray[index-i-1]=aInputArray[i];
		}		
		System.out.println(Arrays.toString(reversedArray));	
		
	}
	
   private static void secondWay(int[] aInputArray) {
		System.out.println("***************SecondWay****************** : Better for Space complexity");
		int index = aInputArray.length;
		int temp =0;
		for(int i=0;i<index/2;i++) {
			temp=aInputArray[i];
			aInputArray[i]=aInputArray[index-i-1];
			aInputArray[index-i-1] = temp;			
		}		
		System.out.println(Arrays.toString(aInputArray));	
	}

}

package com.arrays.programs;

public class MinAndMaxOfAnArray {

	public static void main(String[] args) {

		int arr[] = {40,20,30,10,60,50};
		
		firstWay(arr);
		secondWay(arr);
		
	}

	private static void secondWay(int[] aInputArray) {
		
		
		
	}

	private static void firstWay(int[] aInputArray) {
		System.out.println("*******************FirstWay**********************");
		int min = aInputArray[0];
		int max = aInputArray[0];
		for(int i=0;i<aInputArray.length;i++) {
			if(aInputArray[i]<min) {
				min = aInputArray[i];
			}
			if(aInputArray[i]>max) {
				max = aInputArray[i];
			}
		}		
		System.out.println("Min value : "+min);
		System.out.println("Max value : "+max);
		System.out.println("*******************SecondWay**********************");
	}

}

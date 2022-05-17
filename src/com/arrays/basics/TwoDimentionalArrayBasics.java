package com.arrays.basics;

import java.util.Arrays;

/*
 * Important points : 
 * ------------------------------------
 * 
 * 		When to use array : 
 *           1) To store multiple values of same data type.
 *           2) Random access is fast in array. ex: arr[2][3]
 *      
 *      Limitations : 
 *       	 1) Only same data type of elements can be stored. (Only Homogeneous data) 
 *           2) Reserver Memory : Limited amount of memory is created by default when we create an array. (Fixed in size)
 *           
 *             
 *  
 */
public class TwoDimentionalArrayBasics {

	public static void main(String[] args) {
		
		
		int arr[][] = {{1,2,3},{4,5,6},{7,8,9}};
		
		System.out.println("**************** Normal way: ****************");
		for(int row=0;row<arr.length;row++) {
			for(int col=0;col<arr[row].length;col++) {
				System.out.print(arr[row][col]+",");                        // Time complexity : O(MN) , Space Complexity : O(1)
			}
			System.out.println();
		}
		System.out.println("**************** Another way: ****************");
		System.out.println(Arrays.deepToString(arr));
		//System.out.println(arr.getClass().getName());
		
		System.out.println("***********ArrayOfArrays*******************");
		int arr2[][] = new int[2][];
		arr2[0] = new int[2];
		arr2[1] = new int[3];
		
		
		arr2[0][0] =  1;
		arr2[0][1] =  2;
		
		arr2[1][0] =  3;
		arr2[1][1] =  4;
		arr2[1][2] =  5;
		
		
		// int arr2[][] = {{1,2},{3,4,5}} can also be done in this way
		System.out.println("**************** Normal way: ****************");
		for(int row=0;row<arr2.length;row++) {
			for(int col=0;col<arr2[row].length;col++) {
				System.out.print(arr2[row][col]+",");                        // Time complexity : O(MN) , Space Complexity : O(1)
			}
			System.out.println();
		}
		System.out.println("**************** Another way: ****************");
		System.out.println(Arrays.deepToString(arr2));		
		
	}
}

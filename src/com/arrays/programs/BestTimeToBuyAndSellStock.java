package com.arrays.programs;

import java.util.Arrays;

public class BestTimeToBuyAndSellStock {

	public static void main(String[] args) {

		int arr[]= {7,6,4,3,1};
		
		
		System.out.println(Arrays.toString(arr));
		
		int maxProfit = 0;
		int interimProfit = 0;
		for(int i=0;i<arr.length;i++) {						
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]<arr[j]) {
					System.out.println(arr[i]+"-"+arr[j]);
					interimProfit=arr[j]-arr[i];
					if(interimProfit>maxProfit) {
						maxProfit = interimProfit;
					}
				}
			}
		}
		System.out.println( maxProfit);
	}

}

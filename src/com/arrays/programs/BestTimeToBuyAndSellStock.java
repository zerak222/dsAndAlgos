package com.arrays.programs;

public class BestTimeToBuyAndSellStock {

	public static void main(String[] args) {

		int arr[]= {7,1,5,3,6,4};
		
		int maxProfit = 0;
		int interimProfit = 0;
		for(int i=0;i<arr.length;i++) {	
			if(i+1<arr.length && arr[i]<arr[i+1]) {
				for(int j=i+1;j<arr.length;j++) {
					if(arr[i]<arr[j]) {
						interimProfit=arr[j]-arr[i];
						if(interimProfit>maxProfit) {
							maxProfit = interimProfit;
						}
					}
				}
			}
		}
		System.out.println( maxProfit);
	}

}

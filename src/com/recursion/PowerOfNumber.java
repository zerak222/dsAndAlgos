package com.recursion;

/*
 * x power n = x * (x power n-1)
 */
public class PowerOfNumber {

	public static void main(String[] args) {
		
		System.out.println(power(10,2));
	}
	
	
	public static int power(int x, int n) {
		
		if(n==0 ) {
			return 1; 
		}
		if(n<0) {
			System.out.println("not allowed");
			return -1;
		}		
		
		return x * power(x,n-1);
	}

}

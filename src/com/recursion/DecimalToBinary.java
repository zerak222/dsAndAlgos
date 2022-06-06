package com.recursion;

/*
 * Step 1 : Divide by 2
 * Step 2 : Get the quotient for the next iteration
 * Step 3 : Get the remainder for the binary number
 * Step 4 : Repeat the steps until the quotient is 0
 */
public class DecimalToBinary {

	public static void main(String args[]) {
		
		System.out.println(convertToBinary(14));
		
	}
	
	public static int convertToBinary(int aInput) {		
		
		if(aInput==0) {
			return 0;
		}		
		
		return aInput%2 + 10*convertToBinary(aInput/2);
	}
}

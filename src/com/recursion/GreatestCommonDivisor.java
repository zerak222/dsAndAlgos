package com.recursion;

/*
 * gcd(48,18)
 * 
 * Step 1: 48/18  = 2 remaining 12
 * 
 * Step 2: 18/12  = 1 remaining 6
 * 
 * Step 3: 12/6   = 2 remaining 0
 */

public class GreatestCommonDivisor {

	public static void main(String[] args) {

		System.out.println(findTheGCD(48,12));
	}

	private static int findTheGCD(int a, int b) {
		
		if(a<0 || b<0) {
			return -1;
		}
		if(a==0 ) {
			return b;
		}if(b==0) {
			return a;
		}
		
		if(a>b) {
			return findTheGCD(b,a%b);
		}else {			
			return findTheGCD(a,b%a);
		}
	}

}

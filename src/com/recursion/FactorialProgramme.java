package com.recursion;

public class FactorialProgramme {

	public static void main(String args[]) {		
		long inputNumber = 6;
		System.out.println("Without Recursion : "+factorialWithoutRecursion(inputNumber));	
		
		System.out.println("With Recursion : "+factorialWithRecursion(inputNumber));
	}	
	public static long factorialWithoutRecursion(long aInput) {		
		if(aInput<=0) {
			return 0;
		}
		long factorial =1;
		for(long i=aInput;i>0;i--) {
			factorial *= i;			
		}		
		return factorial;		
	}
	
	public static long factorialWithRecursion(long aInput) {
		if(aInput<=0) {
			return 0;
		}
		if(aInput==1) {
			return aInput;
		}
		return aInput*factorialWithoutRecursion(aInput-1);
	}
	
	
}

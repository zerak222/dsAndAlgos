package com.recursion;

public class FibonacciSeries {

	static int n1=0,n2=1,n3=0;
	public static void main(String[] args) {	
		System.out.print(n1+","+n2);
		int count =10;
		withoutRecursion(count-2);
		System.out.println();
		// reset values
		n1=0;n2=1;n3=0;
		System.out.print(n1+","+n2);
		withRecursion(count-2);
	}
	
	public static void withoutRecursion(int aCount){
		for(int i=0;i<aCount;i++) {
			n3=n1+n2;
			System.out.print(","+n3);
			n1=n2;
			n2=n3;
		}
	}
	
	public static void withRecursion(int aCount) {		
		if(aCount>0) {
			n3=n1+n2;
			n1=n2;
			n2=n3;
			System.out.print(","+n3);
			withRecursion(aCount-1);
		}else {
			
		}
		
	}
}

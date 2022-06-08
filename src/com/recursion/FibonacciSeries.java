package com.recursion;

public class FibonacciSeries {

	static int n1=0,n2=1,n3=0;
	public static void main(String[] args) {	
		int count =10;
		System.out.println("WithoutRecursion");
		withoutRecursion(count-2);
		// reset values
		n1=0;n2=1;n3=0;
		System.out.println();
		System.out.println("*****************************************");
		System.out.println("WithRecursion : "+withRecursion(count-2));
		System.out.println("*****************************************");
		System.out.println("Easy WithRecursion : "+easyWithRecursion(count));
	}
	
	public static void withoutRecursion(int aCount){
		for(int i=0;i<aCount;i++) {
			n3=n1+n2;
			System.out.print(n3+",");
			n1=n2;
			n2=n3;
		}
	}
	
	public static int withRecursion(int aCount) {		
		  n3 =n1+n2;             
	      if(aCount==0){
	          return n3;
	      }
	      n1 = n2;                 
	      n2 = n3;              
	      
	      return withRecursion(aCount-1);
		
	}
	
	public static int easyWithRecursion(int aCount) {		
		  if(aCount<0) {
			  return -1;
		  }
		  if(aCount==0 || aCount==1) {
			  return aCount;
		  }
	      
	      return easyWithRecursion(aCount-1)+easyWithRecursion(aCount-2);
		
	}
}

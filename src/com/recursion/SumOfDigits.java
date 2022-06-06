package com.recursion;

public class SumOfDigits {

	public static void main(String[] args) {
          
		System.out.println(sumOfDigitsOfGivenNumber(222));
	}

	private static int sumOfDigitsOfGivenNumber(int i) {

		i=Math.abs(i);
		if(i<10) {
			return i;
		}
		
		return sumOfDigitsOfGivenNumber(i/10)+(i%10);
		
	}

}

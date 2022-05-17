package com.arrays.basics.project;

import java.util.Scanner;

public class AverageTemperatureWithoutArray {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number of days : ");
		int noOfDays = sc.nextInt();
		int sum = 0;
		for(int i=0;i<noOfDays;i++) {
			System.out.printf("Enter the temperature of day %d : ",i+1);
			sum = sum+sc.nextInt();
		}		
		System.out.println("Average of Temperature : "+(sum/noOfDays));
		sc.close();
	}

}

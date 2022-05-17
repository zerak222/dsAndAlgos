package com.arrays.basics.project;

import java.util.Scanner;

public class AverageTemperatureWithArray {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number of days : ");
		int noOfDays = sc.nextInt();
		int temps[] = new int[noOfDays];
		int sum = 0;
		for(int i=0;i<noOfDays;i++) {
			System.out.printf("Enter the temperature of day %d : ",i+1);
			temps[i]=sc.nextInt();
			sum = sum+temps[i];
		}		
		int averageTemperature = sum/noOfDays;
		System.out.println("Average of Temperature : "+averageTemperature);
		// Count no of days above average temperature
		int daysAboveAvgTemp = 0;
		for(int i:temps) {
			if(i>averageTemperature) {
				daysAboveAvgTemp++;
			}
		}
		System.out.println("No of days above average temperature : "+daysAboveAvgTemp);
		
		sc.close();
	}

}

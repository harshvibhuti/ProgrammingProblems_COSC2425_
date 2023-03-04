package ProgrammingChallenges_Chapter_7;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

//Program works correctly

	/**

	Write a RainFall class that stores the total rainfall for each of 12 months into an array of 
	doubles. The program should have methods that return the following:
	•	 the total rainfall for the year
	•	 the average monthly rainfall
	•	 the month with the most rain
	•	 the month with the least rain
	Demonstrate the class in a complete program.
	Input Validation: Do not accept negative numbers for monthly rainfall figures.
	
	*/
public class Rainfall {
	
	
	static ArrayList <Double> rainfall = new ArrayList<>();//Arrays.asList(23.23, 23.234, 45.456, 456.45, 456.456));
	
	public static double total() {
		double sum = 0;
		for (int i = 0; i<rainfall.size();i++) {
			sum+=rainfall.get(i);
		}
		return sum;
	}
	
	public static double average() {
		double sum = 0;
		for (Double i: rainfall) {
			sum+=i;
		}
		return sum/rainfall.size();
	}
	
	public static double most() {
		double maxi = 0;
		for (Double i: rainfall) {
			if (i >= maxi) {
				maxi = i;
			}
		}
		return maxi;
	}
	
	public static double least() {
		double mini = rainfall.get(0);
		for (Double i: rainfall) {
			if (i <= mini) {
				mini = i;
			}
		}
		return mini;
	}
	
	
	public static void main(String[] args) {
		/**
		
		Scanner keyb = new Scanner(System.in);
		System.out.println("Enter monthly rainfall (any letter to quit): ");
		while (keyb.hasNextDouble()) {
			
			rainfall.add(keyb.nextDouble());
			
//		if (keyb.nextDouble() == -1) {
//			break;
//		}
			
			
		}
		*/
		
		System.out.println(total()+" \n"+ average()+" \n"+most()+" \n"+least());
	}
	
	

}

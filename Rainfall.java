package ProgrammingChallenges_Chapter_7;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

//Program works correctly

	/**
	QUESTION:
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
	
	
	static ArrayList <Double> rainfall = new ArrayList<>();
	// Calculating the total
	public static double total() {
		double sum = 0;
		for (int i = 0; i<rainfall.size();i++) {
			sum+=rainfall.get(i);
		}
		return sum;
	}
	// Calculating the average
	public static double average() {
		double sum = 0;
		for (Double i: rainfall) {
			sum+=i;
		}
		return sum/rainfall.size();
	}
	// checking the maximum value in the arrayList
	public static double most() {
		double maxi = 0;
		for (Double i: rainfall) {
			if (i >= maxi) {
				maxi = i;
			}
		}
		return maxi;
	}
	// checking the minimum value in the ArrayList
	public static double least() {
		double mini = rainfall.get(0);
		for (Double i: rainfall) {
			if (i <= mini) {
				mini = i;
			}
		}
		return mini;
	}
	
	// main method
	public static void main(String[] args) { 
		
		// Add the desired values in the ArrayLust using a driver class and run the program.
		System.out.println(total()+" \n"+ average()+" \n"+most()+" \n"+least());
	}
	
	

}

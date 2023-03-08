package ProgrammingChallenges_Chapter_7;

/**
QUESTION: 5. Larger Than n In a program, write a method that accepts two arguments:
			an array and a number n. Assume that the array contains integers. 
			The method should display all of the numbers in
			the array that are greater than the number n. */

// The program is working correctly

public class LargerThan_n {
	
	static int[] arr = {5,6,9,11,26,34,2};
	
	public static void bigger(int[] arr1, int n) {
		for (int i = 0; i<arr1.length; i++) {
			if (arr1[i] > n){ // checking if element is bigger than n
				System.out.print(arr1[i]+" "); // if yes, printing it with a space in between
			}
		}
	}
	

	public static void main(String[] args) {
		
		bigger(arr, 5); // calling the method

	}

}

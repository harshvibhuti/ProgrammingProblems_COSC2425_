package ProgrammingChallenges_Chapter_7;


import java.util.Arrays;

// Program works correctly

public class Payroll {
	
	
	/**
	
	Write a Payroll class that uses the following arrays as fields:
		•	 employeeId. An array of seven integers to hold employee identification numbers. The 
		array should be initialized with the following numbers:
		 5658845 4520125 7895122 8777541
		 8451277 1302850 7580489
		•	 hours. An array of seven integers to hold the number of hours worked by each 
		employee
		•	 payRate. An array of seven doubles to hold each employee’s hourly pay rate
		•	 wages. An array of seven doubles to hold each employee’s gross wages
		The class should relate the data in each array through the subscripts. For example, the 
		number in element 0 of the hours array should be the number of hours worked by the 
		employee whose identification number is stored in element 0 of the employeeId array. That 
		same employee’s pay rate should be stored in element 0 of the payRate array.
		In addition to the appropriate accessor and mutator methods, the class should have a 
		method that accepts an employee’s identification number as an argument and returns the 
		gross pay for that employee.
		
	Demonstrate the class in a complete program that displays each employee number and asks 
	the user to enter that employee’s hours and pay rate. It should then display each employee’s 
	identification number and gross wages.
	Input Validation: Do not accept negative values for hours or numbers less than 6.00 for 
	pay rate.
		
	*/
	// create arrays
	static int[] employeeId = { 5658845, 4520125, 7895122, 8777541, 8451277, 1302850, 7580489 };
	static int[] hours = new int[7];
	static double[] payRate = new double[7];
	double[] wages = new double[7];

	public static void setHours(int index, int hour) { // setter for hour
		hours[index] = hour;
	}

	public static void setPayRate(int index, double payR) { // setter for pay rate
		payRate[index] = payR;
	}

	public static int getIndex(int empId) { // method to get index of the employeeId taken as an argument
		int index = 0;
		for (int i = 0; i < employeeId.length; i++) {
			if (empId == employeeId[i]) {
				index = i;
			}

		}
		return index;

	}

	// accepts an employee’s identification number as an argument and returns the
	// gross pay for that employee.
	public static double getGrossPay(int empId) {
		int index = getIndex(empId);
		return hours[index] * payRate[index]; // multiply hours with payRate to get gross pay
	}

	public static void main(String[] args) {

		setHours(2, 9);
		setPayRate(2, 10);
		System.out.println(getGrossPay(7895122)); // checking the program with an example

	}
	
	
	
}


package edu.wit.cs.comp1000;

import java.util.Scanner;

// TODO: document this class
public class PA2a {

	// TODO: document this function
	public static void main(String[] args) {
		// TODO: write your code here
		
		 Scanner scanner = new Scanner(System.in);

	        // Variables to keep track of sums and counts
	        int sumAll = 0, sumPositive = 0, sumNonPositive = 0;
	        int countPositive = 0, countNonPositive = 0;

	        // Prompt the user for input
	        System.out.print("Enter five whole numbers: ");
	        
	        // Loop to read five numbers
	        for (int i = 0; i < 5; i++) {
	            int number = scanner.nextInt();
	            sumAll += number;  // Add to total sum

	            if (number > 0) {
	                sumPositive += number;
	                countPositive++;
	            } else {
	                sumNonPositive += number;
	                countNonPositive++;
	            }
	        }

	        // Close the scanner to avoid resource leak
	        scanner.close();

	        // Calculate averages and handle division by zero
	        double avgAll = sumAll / 5.0;
	        double avgPositive = (countPositive > 0) ? sumPositive / (double) countPositive : 0.0;
	        double avgNonPositive = (countNonPositive > 0) ? sumNonPositive / (double) countNonPositive : 0.0;

	        // Output the results (formatted for JUnit compatibility)
	        System.out.printf("The sum of the %d positive %s: %d%n", 
	                countPositive, countPositive == 1 ? "number" : "numbers", sumPositive);
	        System.out.printf("The sum of the %d non-positive %s: %d%n", 
	                countNonPositive, countNonPositive == 1 ? "number" : "numbers", sumNonPositive);
	        System.out.printf("The sum of the 5 numbers: %d%n", sumAll);
	        System.out.printf("The average of the %d positive %s: %.2f%n", 
	                countPositive, countPositive == 1 ? "number" : "numbers", avgPositive);
	        System.out.printf("The average of the %d non-positive %s: %.2f%n", 
	                countNonPositive, countNonPositive == 1 ? "number" : "numbers", avgNonPositive);
	        System.out.printf("The average of the 5 numbers: %.2f%n", avgAll);
	}

}

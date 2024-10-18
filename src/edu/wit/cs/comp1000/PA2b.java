package edu.wit.cs.comp1000;

import java.util.Scanner;

public class PA2b {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.printf("Enter a b c: ");
        double a = input.nextDouble();
        double b = input.nextDouble();
        double c = input.nextDouble();
        
        //calculate b^2 - 4ac
        double discriminant = (b * b) - (4 * a * c);
        
        //when discriminant is negative its imaginary
        if(discriminant < 0) {
        	System.out.println("Roots: imaginary");
        }
        //discriminant is 0 = 1 real root
        else if (discriminant == 0) {
            double root = -b / (2 * a);
            System.out.printf("Root: %.2f%n", root);
        }
        //discriminant is (+) = 2 real roots
        else {
            double root1 = (-b - Math.sqrt(discriminant)) / (2 * a);
            double root2 = (-b + Math.sqrt(discriminant)) / (2 * a);
    
            if (root1 < root2) {
                System.out.printf("Roots: %.2f, %.2f%n", root1, root2);
            } else {
                System.out.printf("Roots: %.2f, %.2f%n", root2, root1);
            }
        }
        
        input.close(); 
	
	}
	
}



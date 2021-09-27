/*********************************************************************************************************
 * (Financial: compare costs) Suppose you shop for rice in two different packages.
 * You would like to write a program to compare the cost. The program prompts the
 * user to enter the weight and price of each package and displays the one with the
 * better price.
 ********************************************************************************************************/
package chapter03.selections.exercises;

import java.util.Scanner;

public class Exercise_3_33 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the weight and cost of the first package: ");
		double package1Weight = input.nextDouble();
		double package1Cost = input.nextDouble();
		
		System.out.println("Enter the weight and cost of the second package: ");
		double package2Weight = input.nextDouble();
		double package2Cost = input.nextDouble();
		
		double package1fp =  package1Weight/package1Cost;
		double package2fp =  package2Weight/package2Cost;
		
		if (package1fp > package2fp) {
			System.out.println("Package 1  has a better price.");
		} else if (package2fp > package2fp) {
			System.out.println("Package 2 has a better price.");
		} else {
			System.out.println("The packages have the same price.");
		}
		
		input.close();
		
	}
	
}
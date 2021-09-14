/** Listing   2.9 */
package chapter2.elementaryprogramming.listings;

import java.util.Scanner;

public class ComputeLoan {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		// Obtain interest rate
		System.out.println("Enter interest rate e.g. 5.5 ");
		double yearlyInterestRate = input.nextDouble();
		
		// Get number of years for loan
		System.out.println("Enter number of years as an integer, e.g., 10 ");
		double numberOfYears = input.nextInt();
		
		//  Obtain loan amount
		System.out.println("Enter loan amount: ");
		double loanAmount = input.nextDouble();
		
		
		double monthlyInterestRate = yearlyInterestRate / 1200; 
		
		// calculate payment
		double monthlyPayment = loanAmount * monthlyInterestRate / (1 -  1/Math.pow(1 + monthlyInterestRate, numberOfYears * 12));
		double totalPayment = monthlyPayment * numberOfYears * 12;
		
		System.out.println("The monthly payment is $" + ( int ) (monthlyPayment * 100) / 100.0);
		System.out.println("The total payment is $" + ( int ) (totalPayment * 100) / 100);
	
		input.close();
	}

}

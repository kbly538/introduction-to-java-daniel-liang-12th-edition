/*********************************************************************************************************
 * (Financials: currency exchange) Write a program that prompts the user to enter
 * the exchange rate from currency in U.S. dollars to Chinese RMB. Prompt the
 * user to enter 0 to convert from U.S. dollars to Chinese RMB and 1 to convert
 * from Chinese
 * RMB to U.S. dollars. Prompt the user to enter the amount in U.S.
 * dollars or Chinese RMB to convert it to Chinese RMB or U.S. dollars, respectively.
 ********************************************************************************************************/
package chapter3.selections.exercises;

import java.util.Scanner;

public class Exercise_3_31 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter the exchange rate US > RMB: ");
		double rate = input.nextDouble();
		
		System.out.println("Enter 0 for US > RMB and 1 otherwise");
		byte parity = input.nextByte();
		
		
		
		if (parity == 0) {
			
			
			System.out.println("Enter the amount of US Dollar: ");
			double amount = input.nextDouble();
			
			double exchangedAmount = amount * rate;
			System.out.println( "$" + amount + " is " + exchangedAmount + " Yuan");
			
		} else if (parity == 1) {
			
			System.out.println("Enter the amount of Chinese RMB: ");
			double amount = input.nextDouble();
			
			double exchangedAmount = amount / rate;
			System.out.println( amount + " Yuan is $" + exchangedAmount);
		} else {
			System.out.println("Invalid Input.");
		}
		
		
		input.close();
		
		
	}
	
}
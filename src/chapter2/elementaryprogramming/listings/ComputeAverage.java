/** Listing 2.4 */
package chapter2.elementaryprogramming.listings;

import java.util.Scanner;

public class ComputeAverage {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter three numbers: ");
		double number1 = input.nextDouble();
		double number2 = input.nextDouble();
		double number3 = input.nextDouble();
		
		double average = (number1 + number2 + number3) / 3;
		
		System.out.println("The average of " + number1 + " " + number2 + " " + number3 + 
				" is " + average);
		
		input.close();
		

	}

}

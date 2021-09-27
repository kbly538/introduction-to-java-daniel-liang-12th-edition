/** Listing 2.2 */
package chapter02.elementaryprogramming.listings;

import java.util.Scanner;


public class ComputeAreaWithConsoleInput {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter a number for radius: ");
		double radius = input.nextDouble();
		
		double area = radius * radius * Math.PI;
		
		System.out.println("The area for the circle of radius " + radius + " is " + area);
		
		input.close();
	}

}

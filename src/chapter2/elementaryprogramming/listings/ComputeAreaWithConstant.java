/** Listing  2.3 */
package chapter2.elementaryprogramming.listings;

import java.util.Scanner;

public class ComputeAreaWithConstant {


	public static void main(String[] args) {
		final double PI = 3.13159;
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter a number for radius: ");
		double radius = input.nextDouble();
		double area = radius * radius * PI;
		
		System.out.println("The area for the circle of radius " + radius +" is " + area	);
		input.close();
	}

}

/*********************************************************************************************************
 * (Cost of driving) Write a program that prompts the user to enter the distance to
 * drive, the fuel efficiency of the car in miles per gallon, and the price per gallon
 * then displays the cost of the trip.
 * ******************************************************************************************************/

package chapter02.elementaryprogramming.exercises;

import java.util.Scanner;


public class Exercise_2_23 {
	public static void main(String[] args) {
			
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter the driving distance: ");
		double distance = input.nextDouble();
		
		System.out.println("Enter miles per gallon: ");
		double milesPerGallon = input.nextDouble();
		
		System.out.println("Enter price per gallon: ");
		double pricePerGallon = input.nextDouble();
		
		double costOfDriving = distance / milesPerGallon * pricePerGallon;
		
		System.out.println("The cost of driving: " + costOfDriving);
		
		input.close();
	}
}

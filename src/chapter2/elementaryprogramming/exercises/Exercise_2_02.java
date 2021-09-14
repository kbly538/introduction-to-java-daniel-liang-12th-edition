/*********************************************************************************************************
 * (Compute the volume of a cylinder) Write a program that reads in the radius
 * and length of a cylinder and computes the area and volume using the following
 * formulas:
 * area = radius * radius * π
 * volume = area * length
 ********************************************************************************************************/

package chapter2.elementaryprogramming.exercises;

import java.util.Scanner;

public class Exercise_2_02 {
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.println("Enter the radius and length of a cylinder: ");
		double radius = input.nextDouble();
		double length = input.nextDouble();

		double area = radius * radius * Math.PI;
		double volume = area * length;

		System.out.println("The area is " + (int) (area * 10000) / 10000.0);
		System.out.println("The volume is " + (int) (volume * 10) / 10.0);
		input.close();
	}
}

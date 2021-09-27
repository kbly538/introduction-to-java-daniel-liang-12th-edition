/*********************************************************************************************************
 * (Geometry: distance of two points) Write a program that prompts the user to
 * enter two points (x1, y1) and (x2, y2) and displays their distance. The formula
 * for computing the distance is  sqrt (x2 - x1)2 + (y2 - y1)2. Note you can use
 * Math.pow(a, 0.5) to compute  sqrt a.
 ********************************************************************************************************/

package chapter02.elementaryprogramming.exercises;

import java.util.Scanner;

public class Exercise_2_15 {
	public static void main(String[] args) {
			
			Scanner input = new Scanner(System.in);
			
			System.out.println("Enter x1 and y1:");
			double point1X = input.nextDouble();
			double point1Y = input.nextDouble();			
			
			System.out.println("Enter x2 and y2:");
			double point2X = input.nextDouble();
			double point2Y = input.nextDouble();
			
			double distance = Math.pow( ( Math.pow(point2X-point1X, 2) + Math.pow(point2Y - point1Y, 2)) , 0.5 );

			System.out.println("The distance between the two points is " + distance);
			input.close();
	}
}

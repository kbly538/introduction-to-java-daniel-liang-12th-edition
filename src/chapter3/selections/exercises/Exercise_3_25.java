/*********************************************************************************************************
 * (Geometry: intersecting point) Two points on line 1 are given as (x1, y1) and
 * (x2, y2) and on line 2 as (x3, y3) and (x4, y4), as shown in Figure 3.8a and b.
 * The intersecting point of the two lines can be found by solving the following
 * linear equations:
 * (y1 - y2)x - (x1 - x2)y = (y1 - y2)x1 - (x1 - x2)y1
 * (y3 - y4)x - (x3 - x4)y = (y3 - y4)x3 - (x3 - x4)y3
 * This linear equation can be solved using Cramer’s rule (see Programming
 * Exercise 3.3). If the equation has no solutions, the two lines are parallel (see
 * Figure 3.8c). Write a program that prompts the user to enter four points and displays
 * the intersecting point.
 ********************************************************************************************************/
package chapter3.selections.exercises;

import java.util.Scanner;

public class Exercise_3_25 {

	public static void main(String[] args) {
	
			Scanner input = new Scanner(System.in);
			System.out.println("Enter the points of the lines: ");
			double x1 = input.nextDouble();
			double y1 = input.nextDouble();
			double x2 = input.nextDouble();
			double y2 = input.nextDouble();
			double x3 = input.nextDouble();
			double y3 = input.nextDouble();
			double x4 = input.nextDouble();
			double y4 = input.nextDouble();
			
			// calculate  2x2 linear equation using cramers rule
			// ax + by = e
			// cx + dy = f
			// x = ed - bf  /  ad - bc     y = af - ec / ad - bc
			
			double a = y1 - y2;
			double b = -(x1 - x2);
			double c =  (y3 - y4);
			double d = -(x3 - x4);
			double e = ((y1-y2) * x1) - ((x1 - x2 )* y1);
			double f = ((y3 - y4) * x3) - ((x3 - x4) * y3);
			
			double solutionX = (e * d - b * f) / (a * d - b * c);
			double solutionY = (a * f - e * c ) / (a * d - b * c);
			
			if (solutionX != Double.POSITIVE_INFINITY) {
				System.out.println("( " + solutionX + ", " + solutionY + " )");
			} else {
				System.out.println("Lines are parallel.");
			}
			
			input.close();
	
	}
}
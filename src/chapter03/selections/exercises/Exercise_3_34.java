/*********************************************************************************************************
 * (Geometry: point on line segment) Exercise 3.32 shows how to test whether a
 * point is on an unbounded line. Revise Exercise 3.32 to test whether a point is on
 * a line segment. Write a program that prompts the user to enter the three points for
 * p0, p1, and p2 and displays whether p2 is on the line segment from p0 to p1.
 ********************************************************************************************************/
package chapter03.selections.exercises;

import java.util.Scanner;

public class Exercise_3_34 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter 3 points for p0, p1 and p2");
		double p0X = input.nextDouble();
		double p0Y = input.nextDouble();
		double p1X = input.nextDouble();
		double p1Y = input.nextDouble();
		double p2X = input.nextDouble();
		double p2Y = input.nextDouble();
		
		
		double placementCondition = (p1X - p0X) * (p2Y - p0Y) - 
															(p2X - p0X) * (p1Y - p0Y);
		
		
		boolean isOnSegment = p2Y < p1Y &&  p2Y > p0Y;
		if (placementCondition == 0 && isOnSegment) {
			System.out.println("( "+ p2X + ", " + p2Y + " ) is on the line segment from " + 
					"( "+ p0X + ", " + p0Y + " ) to " + "( "+ p1X + ", " + p1Y + " ).");
		} else if (placementCondition == 0 ) {
			System.out.println("( "+ p2X + ", " + p2Y + " ) is not on the line segment from " + 
					"( "+ p0X + ", " + p0Y + " ) to " + "( "+ p1X + ", " + p1Y + " ).");
		} 
		
		
		input.close();
		
		
		
	}
	
}
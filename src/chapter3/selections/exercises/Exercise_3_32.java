/*********************************************************************************************************
 * (Geometry: point position) Given a directed line from point p0(x0, y0) to p1(x1,
 * y1), you can use the following condition to decide whether a point p2(x2, y2) is
 * on the left of the line, on the right, or on the same line. Write a program
 * that prompts the user to enter the three points for p0, p1, and p2
 * and displays whether p2 is on the left of the line from p0 to p1, to the right, or on
 * the same line.
 ********************************************************************************************************/
package chapter3.selections.exercises;

import java.util.Scanner;

public class Exercise_3_32 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);

		System.out.println("Enter 3 points for p0, p1 and p2");
		double p0X = input.nextDouble();
		double p0Y = input.nextDouble();
		double p1X = input.nextDouble();
		double p1Y = input.nextDouble();
		double p2X = input.nextDouble();
		double p2Y = input.nextDouble();


		double pointPosition = (p1X - p0X) * (p2Y - p0Y)
				- (p2X - p0X) * (p1Y - p0Y);


		if (pointPosition > 0) {
			System.out.println("P2 is on the left");
		} else if (pointPosition == 0) {
			System.out.println("P2 is on the same line.");
		} else if (pointPosition < 0) {
			System.out.println("P2 is on the right");
		}
		
		input.close();
		
		
		
		
	}
	
}
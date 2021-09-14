/*********************************************************************************************************
 * (Geometry: area of a triangle) Write a program that prompts the user to enter
 * three points, (x1, y1), (x2, y2), and (x3, y3), of a triangle then displays
 * its area. The formula for computing the area of a triangle is
 * s = (side1 + side2 + side3)/2;
 * area =  sqrt s(s - side1)(s - side2)(s - side3)
 *
 ********************************************************************************************************/

package chapter2.elementaryprogramming.exercises;

import java.util.Scanner;


public class Exercise_2_19 {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter the coordinates of three points separated by spaces"+
				"like x1 y1 x2 y2 x3 y3:");
		double point1X = input.nextDouble();
		double point1Y = input.nextDouble();
		double point2X = input.nextDouble();
		double point2Y = input.nextDouble();
		double point3X = input.nextDouble();
		double point3Y = input.nextDouble();
		
		double side1 = Math.abs(Math.pow(Math.pow((point2X - point1X) , 2)
							   					+ Math.pow((point2Y - point1Y), 2), 0.5));
		double side2 = Math.abs(Math.pow(Math.pow((point3X - point2X) , 2)
					+ Math.pow((point3Y - point2Y), 2), 0.5));
		double side3 = Math.abs(Math.pow(Math.pow((point3X - point1X) , 2)
					+ Math.pow((point3Y - point1Y), 2), 0.5));
		
		double s = (side1 + side2 + side3) /2;
		
		double area = Math.pow((s * (s - side1)*(s - side2)*(s - side3) ), 0.5);
		
		System.out.println("The area of the triangle is " + area);
		
			input.close();
	}
}

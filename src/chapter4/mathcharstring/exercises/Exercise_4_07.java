/*********************************************************************************************************
 * (Corner point coordinates) Suppose a pentagon is centered at (0, 0) with one point
 * at the 0 o’clock position, as shown in Figure 4.4c. Write a program that prompts
 * the user to enter the radius of the bounding circle of a pentagon and displays the
 * coordinates of the five corner points on the pentagon from p1 to p5 in this order. Use
 * console format to display two digits after the decimal point.
 ********************************************************************************************************/
package chapter4.mathcharstring.exercises;

import java.util.Scanner;

public class Exercise_4_07 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.println("Enter the radius of the bounding circle: ");
		double radius = input.nextDouble();
		input.close();

		double start = Math.PI / 2; // 0 o'clock
		double angle = 2 * Math.PI / 5;

		double x1 = radius * Math.cos(start - angle);
		double y1 = radius * Math.sin(start - angle);

		double x2 = radius * Math.cos(start);
		double y2 = radius * Math.sin(start);

		double x3 = radius * Math.cos(start + angle * 1);
		double y3 = radius * Math.sin(start + angle * 1);

		double x4 = radius * Math.cos(start + angle * 2);
		double y4 = radius * Math.sin(start + angle * 2);

		double x5 = radius * Math.cos(start + angle * 3);
		double y5 = radius * Math.sin(start + angle * 3);


		System.out.printf("(%6.2f, %6.2f)\n", x1, y1);
		System.out.printf("(%6.2f, %6.2f)\n", x2, y2);
		System.out.printf("(%6.2f, %6.2f)\n", x3, y3);
		System.out.printf("(%6.2f, %6.2f)\n", x4, y4);
		System.out.printf("(%6.2f, %6.2f)", x5, y5);

	}


}

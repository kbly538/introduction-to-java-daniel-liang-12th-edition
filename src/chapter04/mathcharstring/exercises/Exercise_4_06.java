/*********************************************************************************************************
 * (Random points on a circle) Write a program that generates three random points
 * on a circle centered at (0, 0) with radius 40 and displays three angles in a triangle
 * formed by these three points, as shown in Figure 4.4a. Display the angles in
 * degrees.
 * (Hint: Generate a random angle a in radians between 0 and 2p, as shown
 * in Figure 4.4b and the point determined by this angle is rxcos (a), rxsin (a).)
 ********************************************************************************************************/
package chapter04.mathcharstring.exercises;

public class Exercise_4_06 {

	public static void main(String[] args) {

		double radius = 40;

		double randomAngle1 = Math.random() * Math.PI;
		double randomAngle2 = Math.random() * Math.PI - randomAngle1;
		double randomAngle3 = Math.PI - (randomAngle1 + randomAngle2);

		double p1x = radius * Math.cos(randomAngle1);
		double p1y = radius * Math.sin(randomAngle1);
		double p2x = radius * Math.cos(randomAngle2);
		double p2y = radius * Math.sin(randomAngle2);
		double p3x = radius * Math.cos(randomAngle3);
		double p3y = radius * Math.sin(randomAngle3);


		System.out.println("Angle 1: " + Math.toDegrees(randomAngle1) +
				" Points: " + p1x + " " + p1y);

		System.out.println("Angle 2: " + Math.toDegrees(randomAngle2) +
				" Points: " + p2x + " " + p2y);

		System.out.println("Angle 3: " + Math.toDegrees(randomAngle3) +
				" Points: " + p3x + " " + p3y);


		System.out.println("Angles total: " + (Math.toDegrees(randomAngle1)
				+ Math.toDegrees(randomAngle2) + Math.toDegrees(randomAngle3)));

	}


}

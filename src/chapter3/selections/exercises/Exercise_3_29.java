/*********************************************************************************************************
 * (Geometry: two circles) Write a program that prompts the user to enter the center
 * coordinates and radii of two circles and determines whether the second circle
 * is inside the first or overlaps with the first, as shown in Figure 3.10. (Hint: circle2
 * is inside circle1 if the distance between the two centers 6 = r1 − r2
 * and circle2 overlaps circle1 if the distance between the two centers 6 =
 * r1 + r2. Test your program to cover all cases.)
 ********************************************************************************************************/
package chapter3.selections.exercises;

import java.util.Scanner;

public class Exercise_3_29 {

	public static void main(String[] args) {
	
			Scanner input = new Scanner(System.in);
			System.out.println("Enter circle1's center x-, y-coordinates, and radius: ");
			double circle1CenterX = input.nextDouble();
			double circle1CenterY = input.nextDouble();
			double circle1Radius = input.nextDouble();
			
			System.out.println("Enter circle2's center x-, y-coordinates, and radius: ");
			double circle2CenterX = input.nextDouble();
			double circle2CenterY = input.nextDouble();
			double circle2Radius = input.nextDouble();
			
			double distanceBetweenCenters = Math.pow(
					Math.pow(circle1CenterX - circle2CenterX, 2) + 
					Math.pow(circle1CenterY - circle2CenterY, 2), 0.5);
			
			System.out.println(distanceBetweenCenters);
			
			
			 if ( distanceBetweenCenters <= circle1Radius - circle2Radius){
					System.out.println("Circle2 inside circle1");
				} else if (distanceBetweenCenters <= circle1Radius + circle2Radius ) {
				System.out.println("Circle2 is overlaps circle1");
			}  else { 
				System.out.println("Circle2 doesn't overlap circle1");
			}
			 
			 input.close();
	}
	
}
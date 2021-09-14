/*********************************************************************************************************
 * (Geometry: two rectangles) Write a program that prompts the user to enter the
 * center x-, y-coordinates, width, and height of two rectangles and determines
 * whether the second rectangle is inside the first or overlaps with the first, as
 * shown in Figure 3.9. Test your program to cover all cases.
 ********************************************************************************************************/
package chapter3.selections.exercises;

import java.util.Scanner;

public class Exercise_3_28 {

	public static void main(String[] args) {
	
			Scanner input = new Scanner(System.in);
			System.out.println("Enter r1's center x-, y-coordinates, width, and heigth: ");
			double r1CenterX = input.nextDouble();
			double r1CenterY = input.nextDouble();
			double r1Width = input.nextDouble();
			double r1Height = input.nextDouble();
			
			System.out.println("Enter r2's center x-, y-coordinates, width, and heigth: ");
			double r2CenterX = input.nextDouble();
			double r2CenterY = input.nextDouble();
			double r2Width = input.nextDouble();
			double r2Height = input.nextDouble();
			input.close();
			
			
			
			if ((r1Width/2 + r1CenterX) > (r2Width/2 + r2CenterX)	&&  
					(r1Height/2 + r1CenterY) > (r2Height/2 + r2CenterY)) {
				System.out.println("r2 is inside r1");
			} else if (Math.abs(r1CenterX - r2CenterX) <= (r1Width + r2Width) / 2 &&
						Math.abs(r1CenterY - r2CenterY) <= (r1Height + r2Height) / 2) {
				System.out.println("r2 overlaps r1");
			}  else {
				System.out.println("r2 doesn't overlap r1");
			}
			
	}
}
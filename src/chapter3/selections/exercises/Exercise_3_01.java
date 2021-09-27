/*********************************************************************************************************
 * (Algebra: solve quadratic equations) The two roots of a quadratic equation
 * ax2 + bx + c = 0 can be obtained. If discriminant is positive, the
 * equation has two real roots. If it is zero, the equation has one root. If it is negative,
 * the equation has no real roots.
 * Write a program that prompts the user to enter values for a, b, and c and displays
 * the result based on the discriminant. If the discriminant is positive, display two
 * roots. If the discriminant is 0, display one root. Otherwise, display “The equation
 * has no real roots.”
 ********************************************************************************************************/
package chapter3.selections.exercises;

import java.util.Scanner;

public class Exercise_3_01 {

	public static void main(String[] args) {


		// Prompt user to enter a, b, c
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a, b, c");
		double a = input.nextDouble();
		double b = input.nextDouble();
		double c = input.nextDouble();
		input.close();

		// Calculate roots using discriminant formula  ax2 + bx + c = 0
		double discriminant = Math.pow(b, 2) - 4 * a * c;
		double root1 = (-b + Math.pow(discriminant, 0.5)) / 2 * a;
		double root2 = (-b - Math.pow(discriminant, 0.5)) / 2 * a;

		// if the discriminant positive display two roots
		// if the discriminant zero display one root
		// if the discriminant is negative display no real roots
		if (discriminant > 0) {
			System.out.println("Root 1: " + root1 + " and root 2: " + root2);
		} else if (discriminant == 0) {
			System.out.println("Root: " + root1);
		} else {
			System.out.println("The equation has no real roots.");
		}


	}

}

/* OUTPUT
Enter a, b, c
1,0 3 1
Root 1: -0.3819660112501051 and root 2: -2.618033988749895

Enter a, b, c
1 2,0 1
Root: -1.0

Enter a, b, c
1 2 3
The equation has no real roots.
 */
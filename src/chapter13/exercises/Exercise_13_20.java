/*
(Algebra: solve quadratic equations) Rewrite Programming Exercise 3.1 to obtain
imaginary roots if the determinant is less than 0 using the Complex class in
Programming Exercise 13.17.
 */
package chapter13.exercises;

import chapter13.exercises.Exercise_13_17.Complex;

import java.util.Scanner;

public class Exercise_13_20 {

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
            Complex imgRoot1 = new Complex(-b / 2 * a, Math.pow(-discriminant, 0.5) / 2 * a);
            Complex imgRoot2 = new Complex(-b / 2 * a, -Math.pow(-discriminant, 0.5) / 2 * a);
            System.out.println("The roots are " + imgRoot1 + " and " + imgRoot2);
        }


    }
}

/* OUTPUT
Enter a, b, c
1 3 1
Root 1: -0.3819660112501051 and root 2: -2.618033988749895

Enter a, b, c
1 2 1
Root: -1.0




 */


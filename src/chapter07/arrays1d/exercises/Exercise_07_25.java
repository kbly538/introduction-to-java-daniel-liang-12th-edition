/*
(Algebra: solve quadratic equations) Write a method for solving a quadratic equation
using the following header:
public static int solveQuadratic(double[] eqn, double[] roots)
The coefficients of a quadratic equation ax2 + bx + c = 0 are passed to the array
eqn and the real roots are stored in roots. The method returns the number of real
roots. See Programming Exercise 3.1 on how to solve a quadratic equation.
Write a program that prompts the user to enter values for a, b, and c and displays
the number of real roots and all real roots.
*/
package chapter07.arrays1d.exercises;

import java.util.Scanner;

public class Exercise_07_25 {
    public static void main(String[] args) {
        // Prompt user to enter a, b, c
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a, b, c");
        double a = input.nextDouble();
        double b = input.nextDouble();
        double c = input.nextDouble();
        input.close();
        double[] eqn = {a, b, c};
        double[] roots = {-1, -1};

        solveQuadratic(eqn, roots);

    }

    public static int solveQuadratic(double[] eqn, double[] roots) {
        // Calculate roots using discriminant formula  ax2 + bx + c = 0
        double discriminant = Math.pow(eqn[1], 2) - 4 * eqn[0] * eqn[2];
        double root1 = (-eqn[1] + Math.pow(discriminant, 0.5)) / 2 * eqn[0];
        double root2 = (-eqn[1] - Math.pow(discriminant, 0.5)) / 2 * eqn[0];

        // if the discriminant positive display two roots
        // if the discriminant zero display one root
        // if the discriminant is negative display no real roots
        if (discriminant > 0) {
            System.out.println("Root 1: " + root1 + " and root 2: " + root2);
            roots[0] = root1;
            roots[1] = root2;
            return 1;
        } else if (discriminant == 0) {
            System.out.println("Root: " + root1);
            roots = new double[1];
            roots[0] = root1;
            return 1;
        } else {
            System.out.println("The equation has no real roots.");
        }
        return -1;
    }
}

/* OUTPUT
Enter a, b, c
1 31 1
Root 1: -0.032291701741980816 and root 2: -30.967708298258017

 */
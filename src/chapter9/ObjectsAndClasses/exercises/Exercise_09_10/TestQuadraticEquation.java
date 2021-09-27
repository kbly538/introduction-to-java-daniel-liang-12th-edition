/*
(Algebra: quadratic equations) Design a class named QuadraticEquation for
a quadratic equation ax2 + bx + c = 0. The class contains:
■■ Private data fields a, b, and c that represent three coefficients.
■■ A constructor with the arguments for a, b, and c.
■■ Three getter methods for a, b, and c.
■■ A method named getDiscriminant() that returns the discriminant, which
is b2 - 4ac.
■■ The methods named getRoot1() and getRoot2() for returning two roots
of the equation
Draw the UML diagram for the class then implement the class. Write a test program
that prompts the user to enter values for a, b, and c and displays the result
based on the discriminant. If the discriminant is positive, display the two roots. If
the discriminant is 0, display the one root. Otherwise, display “The equation has
no roots.”
 */

package chapter9.ObjectsAndClasses.exercises.Exercise_09_10;

public class TestQuadraticEquation {

    public static void main(String[] args) {
        QuadraticEquation e1 = new QuadraticEquation(1.0, 3, 1);
        QuadraticEquation e2 = new QuadraticEquation(1, 2.0, 1);
        QuadraticEquation e3 = new QuadraticEquation(1, 2, 3);

        showResults(e1);
        showResults(e2);
        showResults(e3);

    }

    private static void showResults(QuadraticEquation e) {
        System.out.println("For a: " + e.getA() + ", b: " + e.getB() + ", c: " + e.getC());
        if (e.getDiscriminant() > 0) {
            System.out.println("Root 1 is " + e.getRoot1());
            System.out.println("Root 2 is " + e.getRoot2());
        } else if (e.getDiscriminant() == 0) {
            System.out.println("Root 1 is " + e.getRoot1());
        } else {
            System.out.println("The equation has no solution.");
        }
        System.out.println();
    }
}


/* OUTPUT
For a: 1.0, b: 3.0, c: 1.0
Root 1 is -0.3819660112501051
Root 2 is -2.618033988749895

For a: 1.0, b: 2.0, c: 1.0
Root 1 is -1.0

For a: 1.0, b: 2.0, c: 3.0
The equation has no solution.
*/
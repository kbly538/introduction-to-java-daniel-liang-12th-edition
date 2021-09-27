/*
(Algebra: 2 * 2 linear equations) Design a class named LinearEquation for a
2 * 2 system of linear equations:
         ax + by = e        x = ed - bf  /  ad - bc
		 cx + dy = f        y = af - ec / ad - bc
The class contains:
■■ Private data fields a, b, c, d, e, and f.
■■ A constructor with the arguments for a, b, c, d, e, and f.
■■ Six getter methods for a, b, c, d, e, and f.
■■ A method named isSolvable() that returns true if ad - bc is not 0.
■■ Methods getX() and getY() that return the solution for the equation.
Draw the UML diagram for the class then implement the class. Write a test program
that prompts the user to enter a, b, c, d, e, and f and displays the result.
If ad - bc is 0, report that “The equation has no solution.”
 */
package chapter09.ObjectsAndClasses.exercises.Exercise_09_11;

public class TestLinearEquation {
    public static void main(String[] args) {
        LinearEquation e1 = new LinearEquation(9.0, 4.0, 3.0, -5.0, -6.0, -21.0);
        LinearEquation e2 = new LinearEquation(1.0, 2.0, 2.0, 4.0, 4.0, 5.0);

        System.out.println("Equation 1: ");
        if (e1.isSolvable())
            System.out.println("X: " + e1.getX() + " Y: " + e1.getY());
        else
            System.out.println("The equation ahs no solution");

        System.out.println("Equation 2: ");
        if (e2.isSolvable())
            System.out.println("X: " + e2.getX() + "Y: " + e2.getY());
        else
            System.out.println("The equation has no solution");

    }
}

/* OUTPUT

Equation 1:
X: -2.0 Y: 3.0
Equation 2:
The equation has no solution

 */

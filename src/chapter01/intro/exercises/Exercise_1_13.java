/*****************************************************************************************************
 * (Algebra: solve 2 * 2 linear equations) You can use Cramer’s rule to solve the
 * following 2 * 2 system of linear equation provided that ad – bc is not 0:
 * ax + by = e
 * cx + dy = f
 *
 * 			ed - bf
 * x =	-------------
 * 			ad - bc
 *
 *			af - ec
 * y =	________________
 * 			ad - bc
 *
 * Write a program that solves the following equation and displays the value for x and
 * y: (Hint: replace the symbols in the formula with numbers to compute x and y. This
 * exercise can be done in Chapter 1 without using materials in later chapters.)
 *****************************************************************************************************/
package chapter01.intro.exercises;

public class Exercise_1_13 {
		public static void main(String[] args) {
			
			// 3.4x + 50.2y = 44.5
			// 2.1x + .55y = 5.9
			
			double solutionForX = (44.5 * 0.55 - 50.2 * 5.9) / (3.4 * 0.55 - 50.2 * 2.1); 
			double solutionForY = (3.4 * 5.9 - 2.1 * 44.5) / (3.4 * 0.55 - 50.2 * 2.1);
			
			System.out.println("x = " + solutionForX + " y = " + solutionForY);
			
			
		}
}

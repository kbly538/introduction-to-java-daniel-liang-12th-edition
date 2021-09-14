/*****************************************************************************************************
 * (Print a table) Write a program that displays the following table:
 * a a^2 a^3
 * 1  1	  1
 * 2  4   8
 * 3  9   27
 * 4  16  64
 *****************************************************************************************************/
package chapter1.intro.exercises;


public class Exercise_1_04 {
	public static void main(String[] args) {


		// Prints a table
		System.out.println("a      a^2      a^3");
		System.out.println(1 + "       " + 1 + "        " + 1);
		System.out.println(2 + "       " + 2 * 2 + "        " + 2 * 2 * 2);
		System.out.println(3 + "       " + 3 * 3 + "        " + 3 * 3 * 3);
		System.out.println(4 + "       " + 4 * 4 + "       " + 4 * 4 * 4);


	}
}


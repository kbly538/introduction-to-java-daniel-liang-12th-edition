/*
(Random character) Write a program that displays a random uppercase letter
using the Math.random() method.
 */
package chapter4.mathcharstring.exercises;

import java.util.Scanner;

public class Exercise_4_16 {

	public static void main(String[] args) {

		int randomUppercaseChar = (int) 'A' + (int) (Math.random() * ('Z' - 'A' + 1));

		System.out.println((char) randomUppercaseChar);

	}
}

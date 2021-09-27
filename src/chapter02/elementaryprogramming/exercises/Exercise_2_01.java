/*********************************************************************************************************
 * (Convert Celsius to Fahrenheit) Write a program that reads a Celsius degree in a
 * double value from the console, then converts it to Fahrenheit, and displays the
 * result.
 ********************************************************************************************************/
package chapter02.elementaryprogramming.exercises;

import java.util.Scanner;

public class Exercise_2_01 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.println("Enter a degree in Celcius: ");
		double degreeInCelcius = input.nextDouble();

		double degreeInFahrenheit = (9 / 5.0) * degreeInCelcius + 32;

		System.out.println(degreeInCelcius + " Celcius is " + degreeInFahrenheit + " Fahrenheit. ");
		input.close();
	}

}

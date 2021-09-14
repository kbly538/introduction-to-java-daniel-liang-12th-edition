/*********************************************************************************************************
 * (Population projection) Rewrite Programming Exercise 1.11 to prompt the user
 * to enter the number of years and display the population after the number of years.
 * Use the hint in Programming Exercise 1.11 for this program.
 ********************************************************************************************************/


package chapter2.elementaryprogramming.exercises;

import java.util.Scanner;

public class Exercise_2_11 {
	public static void main(String[] args) {
			
			Scanner input = new Scanner(System.in);
			
			System.out.println("Enter the number of years: ");
			byte numberOfYears = input.nextByte();
			input.close();
			
			double currentPopulation = 312_032_486;
			
			double secondsInYear = 60 * 60 * 24 * 365;
			
			double births = secondsInYear / 7.0;
			double deaths = secondsInYear / 13.0;
			double newImmigrants = secondsInYear / 45.0;
			
			double totalChangeAYear = births + newImmigrants - deaths;
			double totalChangeInFiveYears = totalChangeAYear * numberOfYears;
			
			System.out.println("Current populatiom: " + currentPopulation + ". Estimated population in 5 years: " + (long)(currentPopulation + totalChangeInFiveYears));
			
	}
}

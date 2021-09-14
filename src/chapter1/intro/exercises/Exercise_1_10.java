/*****************************************************************************************************
 * (Average speed in miles) Assume that a runner runs 14 kilometers in 45 minutes
 * and 30 seconds. Write a program that displays the average speed in miles per
 * hour. (Note 1 mile is equal to 1.6 kilometers.)
 *****************************************************************************************************/
package chapter1.intro.exercises;

public class Exercise_1_10 {
		public static void main(String[] args) {
			
				// 14 kms in 45.5 / 60 hrs
				// 14 km == 14 / 1.6 miles
			System.out.println("Average speed: " + 14/1.6/(45.5/60));
		}
}

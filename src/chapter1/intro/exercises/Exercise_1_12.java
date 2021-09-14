/*****************************************************************************************************
 * (Average speed in kilometers) Assume that a runner runs 24 miles in 1 hour, 40
 * minutes, and 35 seconds. Write a program that displays the average speed in
 * kilometers per hour. (Note 1 mile is equal to 1.6 kilometers.)
 *****************************************************************************************************/
package chapter1.intro.exercises;

public class Exercise_1_12 {
		public static void main(String[] args) {
			
			// speed 24 miles / 1 hr 40 min 35 sec
			// 24 miles = 24 * 1.6 km
			// Average speed = total distance / total time
			// total distance = 24 * 16
			// total time in mins = 60 + 40 + (35/60) 
			// total hours = (60 + 40 + (35/60))  / 60
			System.out.println("Average speed: "  + 24.0 * 1.6 / ((60.0 + 40.0 + 35.0 / 60.0) / 60.0));
			
			
			
		}
}

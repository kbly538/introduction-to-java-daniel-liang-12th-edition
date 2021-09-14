/*********************************************************************************************************
 * (Current time) Listing 2.7, ShowCurrentTime.java, gives a program that displays
 * the current time in GMT. Revise the program so it prompts the user to enter the
 * time zone offset to GMT and displays the time in the specified time zone.
 ********************************************************************************************************/

package chapter2.elementaryprogramming.exercises;

import java.util.Scanner;


public class Exercise_2_08 {
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.println("Enter timezone offset to GMT: ");
		int timezoneOffset = input.nextInt();
		input.close();

		long timezoneOffsetInMillis = timezoneOffset * 60 * 60 * 1000;

		long totalMillis = System.currentTimeMillis() + timezoneOffsetInMillis;
		long totalSeconds = totalMillis / 1000;
		long currentSecond = totalSeconds % 60;
		long totalMinutes = totalSeconds / 60;
		long currentMinute = totalMinutes % 60;
		long totalHours = totalMinutes / 60;
		long currentHour = totalHours % 24;

		System.out.println("Current time is " + currentHour + ":" + currentMinute + ":" + currentSecond);


	}
}

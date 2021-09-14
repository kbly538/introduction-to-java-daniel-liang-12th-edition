/*********************************************************************************************************
 * (Current time) Revise Programming Exercise 2.8 to display the hour using a
 * 12-hour clock.
 ********************************************************************************************************/
package chapter3.selections.exercises;

import java.util.Scanner;

public class Exercise_3_30 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter timezone offset to GMT: ");
		int timezoneOffset = input.nextInt();
		input.close();
		
		long timezoneOffsetInMillis = timezoneOffset * 60 * 60 * 1000;
	
		long totalMillis = System.currentTimeMillis() + timezoneOffsetInMillis; 
		long totalSeconds = totalMillis  / 1000;
		long currentSecond = totalSeconds % 60;
		long totalMinutes = totalSeconds / 60;
		long currentMinute = totalMinutes % 60;
		long totalHours = totalMinutes / 60;
		long currentHour = totalHours % 12;
		
		int period = totalHours % 24 >= 12? 1 : 0;
		
		if (currentHour == 0) currentHour = 12;
		
		System.out.print("Current time is " + currentHour + ":" + currentMinute 
				+ ":" + currentSecond );
		System.out.print(period == 0? " AM": " PM");
		
	}
	
}
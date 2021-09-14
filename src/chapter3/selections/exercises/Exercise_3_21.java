/*********************************************************************************************************
 * (Science: day of the week) Zeller’s congruence is an algorithm developed by
 * Christian
 * Zeller to calculate the day of the week.
 ********************************************************************************************************/
package chapter3.selections.exercises;

import java.util.Scanner;

public class Exercise_3_21 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter year: (e.g., 2012) ");
		int year = input.nextInt();
		
		System.out.println("Enter month: (1 - 12) ");
		int month = input.nextInt();
	
		System.out.println("Enter day of the month: (1 - 31) ");
		int dayOfMonth= input.nextInt();
		input.close();

		month = month == 1? 13 : month==2? 14 : month;
		int k = year % 100;
		int j = year / 100;
		
		
		int dayOfWeek = (dayOfMonth + (26*(month+1) / 10) + k +  (k / 4) + (j / 4) + (5 * j)) % 7;
		
		switch(dayOfWeek) {
		case 0: System.out.println("Day of the week is Saturday."); break;
		case 1: System.out.println("Day of the week is Sunday."); break;
		case 2: System.out.println("Day of the week is Monday."); break;
		case 3: System.out.println("Day of the week is Tuesday."); break;
		case 4: System.out.println("Day of the week is Wednesday."); break;
		case 5: System.out.println("Day of the week is Thursday."); break;
		case 6: System.out.println("Day of the week is Friday."); break;
		}
	}
}
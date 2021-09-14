/** Listing 2.5 */
package chapter2.elementaryprogramming.listings;

import java.util.Scanner;


public class DisplayTime {


	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter an integer for seconds: ");
		int seconds = input.nextInt();
		
		int minutes = seconds / 60;
		int remainingSeconds = seconds % 60;
		
		System.out.println(seconds  + " seconds is " + minutes + " minutes and " + remainingSeconds + " seconds.");
		input.close();
	}

}

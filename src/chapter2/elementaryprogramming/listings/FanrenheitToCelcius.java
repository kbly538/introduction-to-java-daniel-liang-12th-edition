/** Listing  2.6 */
package chapter2.elementaryprogramming.listings;
import java.util.Scanner;

public class FanrenheitToCelcius {


	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter a degree in fahrenheit: ");
		double fahrenheit = input.nextDouble();
		
		double celcius = (5.0 / 9) * (fahrenheit - 32);
		System.out.println("Fahrenheit " + fahrenheit  + " is " + celcius + " in Celcius.");
		input.close();
		
	}

}

/** Listing: 4.2 */
package chapter04.mathcharstring.listings;

import java.util.Scanner;

/**
 * *******************************************************************************************************
 * Listing: 4.4
 * 
 * @author Kubilay Bilgili | kubilay.bilgili@gmail.com
 * Local Date: 8 Eyl 2021
 * 
 *******************************************************************************************************
 */
public class HexDigit2Dec {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a hex digit: ");
		String hexString = input.nextLine();
		
		if (hexString.length() != 1) {
			System.out.println("You must enter exactly 1 character.");
			System.exit(0);
		}
		
		char ch = Character.toUpperCase(hexString.charAt(0));
		if (ch >= 'A' && ch <= 'F') {
			int value = ch - 'A' + 10;
			System.out.println("The decimal value for hex digit " + hexString + " is: " + value);
		} else if ( Character.isDigit(ch)) {
			System.out.println("The decimal value for hex digit " + ch + " is: " + ch);
		} else {
			System.out.println(hexString + " is an invalid input.	");
		}
		
		input.close();
		
	}

}

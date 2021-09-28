/** Listing: 4.2 */
package chapter04.mathcharstring.listings;

import java.util.Scanner;

/**
 * *******************************************************************************************************
 * Listing: 4.1
 *
 * @author Kubilay Bilgili | kubilay.bilgili@gmail.com
 * Local Date: 8 Eyl 2021
 * 
 *******************************************************************************************************
 */
public class ComputeAngles {
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter three points: ");
		double x1 = input.nextDouble();
		double y1 = input.nextDouble();
		double x2 = input.nextDouble();
		double y2 = input.nextDouble();
		double x3 = input.nextDouble();
		double y3 = input.nextDouble();
		input.close();
		
		double a = Math.sqrt((x2-x3) * (x2-x3) + (y2-y3) * (y2 - y3));
		double b = Math.sqrt((x1-x3) * (x1-x3) + (y1-y3) * (y1 - y3));
		double c = Math.sqrt((x1-x2) * (x1-x2) + (y1-y2) * (y1 - y2));
		
		double angleA = Math.toDegrees(Math.acos((a *  a - b *  b - c * c) / (-2 * b * c)));
		double angleB = Math.toDegrees(Math.acos((b * b - a *  a - c * c) / (-2 * a * c)));
		double angleC = Math.toDegrees(Math.acos((c *  c - b *  b - a * a) / (-2 * b * a)));
		
		System.out.println("The three angles are : " + Math.round(angleA * 100) / 100.0 + " " +
				Math.round(angleB * 100) / 100.0 + " " + Math.round(angleC * 100) / 100.0 );
	}
}
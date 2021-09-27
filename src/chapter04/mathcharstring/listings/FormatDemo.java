/** Listing: 4.2 */
package chapter04.mathcharstring.listings;
/**
 * *******************************************************************************************************
 * Listing: 4.6
 * 
 * @author Kubilay Bilgili | kubilay.bilgili@gmail.com
 * Local Date: 8 Eyl 2021
 * 
 *******************************************************************************************************
 */
public class FormatDemo {

	public static void main(String[] args) {
		System.out.printf("%-10s%-10s%-10s%-10s%-10s\n", "Degrees",
				 "Radians", "Sine", "Cosine", "Tangent");
		
		int degrees = 30;
		double radians = Math.toRadians(degrees);
		System.out.printf("%-10d%-10.4f%-10.4f%-10.4f%-10.4f\n", degrees,
				 radians, Math.sin(radians), Math.cos(radians), Math.tan(radians));
		
		degrees = 60;
		radians = Math.toRadians(degrees);
		System.out.printf("%-10d%-10.4f%-10.4f%-10.4f%-10.4f\n", degrees,
				 radians, Math.sin(radians), Math.cos(radians), Math.tan(radians));
		
		degrees = 90;
		radians = Math.toRadians(degrees);
		System.out.printf("%-10d%-10.4f%-10.4f%-10.4f%-10.4f\n", degrees,
				 radians, Math.sin(radians), Math.cos(radians), Math.tan(radians));
	}

}

/*********************************************************************************************************
 * (Random point) Write a program that displays a random coordinate in a rectangle.
 * The rectangle is centered at (0, 0) with width 100 and height 200.
 ********************************************************************************************************/
package chapter03.selections.exercises;

public class Exercise_3_16 {

	public static void main(String[] args) {
		
		double originX = 0;
		double originY = 0;
		
		double rectangleWidth = 100;
		double rectangleHeight = 200;
	
		

		for (int i = 0; i < 2000; i++) {
			double pointRangeX = (double) (Math.random() * 100);
			double pointRangeY = (double) (Math.random() * 200);
			
			double pointX = (originX - (rectangleWidth / 2) + pointRangeX);
			double pointY = (originY -(rectangleHeight / 2) + pointRangeY);
			System.out.println( i + "===>" + "(" + pointX + ", " + pointY + ") ");
		}

	}
}

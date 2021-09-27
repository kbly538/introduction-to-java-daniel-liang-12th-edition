/*********************************************************************************************************
 * (Geometry: points in triangle?) Suppose a right triangle is placed in a plane as
 * shown below. The right-angle point is placed at (0, 0), and the other two points
 * are placed at (200, 0) and (0, 100). Write a program that prompts the user to enter
 * a point with x- and y-coordinates and determines whether the point is inside the
 * triangle.
 ********************************************************************************************************/
package chapter03.selections.exercises;

import java.util.Scanner;

public class Exercise_3_27 {

	public static void main(String[] args) {
	
			Scanner input = new Scanner(System.in);
			System.out.println("Enter the point: x, y ");
			double pointX = input.nextDouble();
			double pointY = input.nextDouble();
			
			double width = 200;
			double height = 100;
			double area = (200 * 100) / 2;
			
			
			// Create 3 triangles 
			double areaOfTree = 0; 
			
			// 1st Triangle    BPC
			double side1 = Math.pow(Math.pow(Math.abs((pointX - 0 )), 2) + Math.pow(Math.abs(pointY - height), 2), 0.5);
			double side2 = Math.pow(Math.pow(Math.abs((pointX - width )), 2) + Math.pow(Math.abs(pointY - 0), 2), 0.5);
			double side3 = Math.pow(Math.pow(width, 2) + Math.pow(height, 2), 0.5);
			double s= (side1 + side2 + side3) / 2;
			areaOfTree += Math.pow( s * (s - side1) * (s - side2) * (s - side3), 0.5);
			
			//2nd triangle    APC
			side1 = Math.pow(Math.pow(Math.abs((pointX - 0 )), 2) + Math.pow(Math.abs(pointY - 0), 2), 0.5);
			side2 = Math.pow(Math.pow(Math.abs((pointX - width )), 2) + Math.pow(Math.abs(pointY - 0), 2), 0.5);
			side3 = width;
			s= (side1 + side2 + side3) / 2;
			areaOfTree += Math.pow( s * (s - side1) * (s - side2) * (s - side3), 0.5);
			
			// 3rd triangle		BPA
			side1 = Math.pow(Math.pow(Math.abs((pointX - 0 )), 2) + Math.pow(Math.abs(pointY - height), 2), 0.5);
			side2 = Math.pow(Math.pow(Math.abs((pointX - 0 )), 2) + Math.pow(Math.abs(pointY - 0), 2), 0.5);
			side3 = height;
			s= (side1 + side2 + side3) / 2;
			areaOfTree += Math.pow( s * (s - side1) * (s - side2) * (s - side3), 0.5);
			
			
			if ( areaOfTree == area ) {
				System.out.println("The point is inside the triangle. ");
			} else {
				System.out.println("The point is outside the triangle. ");
			}
			
			input.close();
	}
}
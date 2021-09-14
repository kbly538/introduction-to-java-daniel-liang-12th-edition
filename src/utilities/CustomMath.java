package utilities;

public class CustomMath {

	public static double getTriangleArea(double side1 , double side2, double side3) {
		double s = (side1 + side2 + side3) / 2;
		return Math.pow((s * (s - side1)*(s - side2)*(s - side3) ), 0.5);
	}

	public static double getHexagonArea(double side) {
		return 6 * Math.pow(side, 2) / (4 * Math.tan(Math.PI*6));
	}

	public static double getAreaOfRegularPolygon(int numberOfSides , double sideLength) {
		return  numberOfSides * Math.pow(sideLength, 2) / 4 * Math.tan(Math.PI/numberOfSides);
	}

	public static boolean isTriangle(double side1, double side2, double side3) {
		if (side1 + side2 > side3
				|| side1 + side3 > side2
				|| side2 + side3 > side1 ) {
			return true;
		}
		return false;
	}
	
	
}

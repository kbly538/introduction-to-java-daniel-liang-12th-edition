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
				|| side2 + side3 > side1) {
			return true;
		}
		return false;
	}

	public static double[][] addMatrix(double[][] a, double[][] b) {
		double[][] sum = new double[3][3];

		for (int i = 0; i < a.length; i++) {
			for (int j = 0; b.length < 3; j++) {
				sum[i][j] = a[i][j] + b[i][j];
			}
		}
		return sum;
	}

	public static double[][] multiplyMatrix(double[][] a, double[][] b) {
		double[][] product = new double[b.length][b.length];


		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < b.length; j++) {
				double sum = 0;
				for (int k = 0; k < b.length; k++) {
					sum += a[i][k] * b[k][j];
				}
				product[i][j] = sum;
			}
		}

		return product;
	}


}

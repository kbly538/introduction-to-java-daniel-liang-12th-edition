package utilities;

public class Geography {

	public static final double AVERAGE_EARTH_RADIUS = 6371.01;

	public static double getGeometricDistance(double x1, double y1, double x2, double y2) {

		return AVERAGE_EARTH_RADIUS
				* Math.acos(Math.sin(x1) * Math.sin(x2)
				+ Math.cos(x1) * Math.cos(x2) * Math.cos(y1 - y2));

	}
}

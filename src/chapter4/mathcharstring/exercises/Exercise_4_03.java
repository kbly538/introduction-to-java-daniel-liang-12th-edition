/*********************************************************************************************************
 * (Geography: estimate areas) Use the GPS locations for Atlanta, Georgia;
 * Orlando, Florida; Savannah, Georgia; and Charlotte, North Carolina in the figure
 * in Section 4.1 to compute the estimated area enclosed by these four cities.
 * (Hint: Use the formula in Programming Exercise 4.2 to compute the distance
 * between two cities. Divide the polygon into two triangles and use the formula in
 * Programming Exercise 2.19 to compute the area of a triangle.)
 ********************************************************************************************************/
package chapter4.mathcharstring.exercises;

public class Exercise_4_03 {

	public static void main(String[] args) {

		final double EARTH_RADIUS = 6371.01;

		// GPS Locations: 

		// Savannah (32.0835407, 281.0998342)
		// Orlando (28.5383355, 281.3792365)
		// Charlotte (35.2270869, 280.8431267)

		// Atlanta (33.7489954, 284.3879824)
		// Orlando (28.5383355, 281.3792365)
		// Charlotte (35.2270869, 280.8431267)


		double CharlotteLatitude = Math.toRadians(35.2270869);
		double CharlotteLongitude = Math.toRadians(280.8431267);
		double SavannahLatitude = Math.toRadians(32.0835407);
		double SavannahLongitude = Math.toRadians(281.0998342);
		double AtlantaLatitude = Math.toRadians(33.7489954);
		double AtlantaLongitude = Math.toRadians(284.3879824);
		double OrlandoLatitude = Math.toRadians(28.5383355);
		double OrlandoLongitude = Math.toRadians(281.3792365);

		double totalArea = 0;
		// First triangle's sides 
		// Savannah Orlando Charlotte
		double side1 = EARTH_RADIUS
				* Math.acos(Math.sin(SavannahLatitude) * Math.sin(OrlandoLatitude)
				+ Math.cos(SavannahLatitude) * Math.cos(OrlandoLatitude) * Math.cos(SavannahLongitude - OrlandoLongitude));
		double side2 = EARTH_RADIUS
				* Math.acos(Math.sin(SavannahLatitude) * Math.sin(CharlotteLatitude)
				+ Math.cos(SavannahLatitude) * Math.cos(CharlotteLatitude) * Math.cos(SavannahLongitude - CharlotteLongitude));
		double side3 = EARTH_RADIUS
				* Math.acos(Math.sin(CharlotteLatitude) * Math.sin(OrlandoLatitude)
				+ Math.cos(CharlotteLatitude) * Math.cos(OrlandoLatitude) * Math.cos(CharlotteLongitude - OrlandoLongitude));

		double s = (side1 + side2 + side3) / 2;
		totalArea += Math.pow((s * (s - side1) * (s - side2) * (s - side3)), 0.5);

		// Second  triangle's sides 
		// Atlanta Orlando Charlotte
		side1 = EARTH_RADIUS
				* Math.acos(Math.sin(AtlantaLatitude) * Math.sin(OrlandoLatitude)
				+ Math.cos(AtlantaLatitude) * Math.cos(OrlandoLatitude)
				* Math.cos(AtlantaLongitude - OrlandoLongitude));
		side2 = EARTH_RADIUS
				* Math.acos(Math.sin(AtlantaLatitude) * Math.sin(CharlotteLatitude)
				+ Math.cos(AtlantaLatitude) * Math.cos(CharlotteLatitude)
				* Math.cos(AtlantaLongitude - CharlotteLongitude));
		side3 = EARTH_RADIUS
				* Math.acos(Math.sin(CharlotteLatitude) * Math.sin(OrlandoLatitude)
				+ Math.cos(CharlotteLatitude) * Math.cos(OrlandoLatitude)
				* Math.cos(CharlotteLongitude - OrlandoLongitude));

		s = (side1 + side2 + side3) / 2;
		totalArea += Math.pow((s * (s - side1) * (s - side2) * (s - side3)), 0.5);

		System.out.println("Estimated area enclosed by Savannah, Orlando, Charlotte and Atlanta "
				+ "is " + totalArea + " km squares.");
	}


}

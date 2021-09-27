/*
(The Location class) Design a class named Location for locating a maximal
value and its location in a two-dimensional array. The class contains public data
fields row, column, and maxValue that store the maximal value and its indices in
a two-dimensional array with row and column as int types and maxValue as a
double type.
Write the following method that returns the location of the largest element in a
two-dimensional array:
public static Location locateLargest(double[][] a)
The return value is an instance of Location. Write a test program that prompts
the user to enter a two-dimensional array and displays the location of the largest
element in the array.
 */

package chapter09.ObjectsAndClasses.exercises.Exercise_09_13;

public class Location {
    public int row = 0;
    public int col = 0;
    public double maxValue = 0;

    public static Location locateLargest(double[][] a) {
        double maxValue = 0;
        int maxRow = 0;
        int maxCol = 0;

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[0].length; j++) {
                if (a[i][j] > maxValue) {
                    maxValue = a[i][j];
                    maxRow = i;
                    maxCol = j;
                }
            }
        }

        Location location = new Location();
        location.maxValue = maxValue;
        location.row = maxRow;
        location.col = maxCol;

        return location;
    }
}



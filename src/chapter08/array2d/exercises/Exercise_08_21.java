/*
(Central city) Given a set of cities, the central city is the city that has the shortest
total distance to all other cities. Write a program that prompts the user to enter
the number of cities and the locations of the cities (coordinates), and finds the
central city and its total distance to all other cities.
 */
package chapter08.array2d.exercises;

import java.util.Scanner;

public class Exercise_08_21 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter the number of cities: ");
        int numberOfCities = input.nextInt();

        double[][] cities = new double[numberOfCities][2];
        System.out.println("Enter the coordinates of the cities: ");
        for (int i = 0; i < numberOfCities; i++) {
            for (int j = 0; j < cities[0].length; j++) {
                cities[i][j] = input.nextDouble();
            }
        }

        double[] totalDistance = new double[numberOfCities];

        for (int i = 0; i < cities.length; i++) {
            for (int j = 0; j < cities.length; j++) {
                if (i != j)
                    totalDistance[i] += distance(cities[i][0], cities[i][1], cities[j][0], cities[j][1]);
            }
        }

        int centralCityIndex = min(totalDistance);
        System.out.println("The central city is at: (" + cities[centralCityIndex][0] + "," + cities[centralCityIndex][1] + ")");
        System.out.println("The total distance to all other cities is " + totalDistance[centralCityIndex]);


    }

    private static double distance(double x1, double y1, double x2, double y2) {
        return Math.sqrt((x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1));
    }

    private static int min(double[] array) {
        double min = 0;
        int minIndex = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] < min)
                minIndex = i;
        }
        return minIndex;
    }
}
/*
Enter the number of cities:
5
Enter the coordinates of the cities:
2,5 5 5,1 3 1 9 5,4 54 5,5 2,1
The central city is at: (2.5,5.0)
The total distance to all other cities is 60.810516285521615

*/
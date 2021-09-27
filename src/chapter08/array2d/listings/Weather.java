/* Listing 8.5 */
package chapter08.array2d.listings;

import java.util.Scanner;

public class Weather {
    public static void main(String[] args) {
        final int NUMBER_OF_DAYS = 10;
        final int NUMBER_OF_HOURS = 24;
        double[][][] data = new double[NUMBER_OF_DAYS][NUMBER_OF_HOURS][2];

        Scanner input = new Scanner(System.in);
        // Scan file
        for (int i = 0; i < NUMBER_OF_DAYS * NUMBER_OF_HOURS; i++) {
            int day = input.nextInt();
            int hour = input.nextInt();
            double temperature = input.nextDouble();
            double humidty = input.nextDouble();
            data[day - 1][hour - 1][0] = temperature;
            data[day - 1][hour - 1][1] = humidty;
        }

        // Daily average
        for (int i = 0; i < NUMBER_OF_DAYS; i++) {
            double dailyTemperatureTotal = 0, dailyHumidityTotal = 0;
            for (int j = 0; j < NUMBER_OF_HOURS; j++) {
                dailyTemperatureTotal += data[i][j][0];
                dailyHumidityTotal += data[i][j][1];
            }
            System.out.println("Day " + i + "'s average temperature is " +
                    dailyTemperatureTotal / NUMBER_OF_HOURS);
            System.out.println("Day " + i + "'s average humidity is " +
                    dailyHumidityTotal / NUMBER_OF_HOURS);
        }
    }
}

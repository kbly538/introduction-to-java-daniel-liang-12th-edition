package chapter7.arrays1d.listings;

import java.util.Scanner;

public class AnalyzeNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Insert sample size: ");
        int sampleSize = input.nextInt();
        double[] pool = new double[sampleSize];
        double sum = 0;

        System.out.println("Enter data as numbers: ");
        for (int i = 0; i < sampleSize; i++) {
            pool[i] = input.nextDouble();
            sum += pool[i];
        }

        double average = sum / sampleSize;

        // count of numbers above average
        int count = 0;
        for (int i = 0; i < sampleSize; i++) {
            if (pool[i] > average) {
                count++;
            }
        }

        System.out.println("Average is: " + average);
        System.out.println("Number of elements above average is: " + count);

    }
}

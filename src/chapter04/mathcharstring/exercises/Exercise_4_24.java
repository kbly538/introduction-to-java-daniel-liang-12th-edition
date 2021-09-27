/*
(Order three cities) Write a program that prompts the user to enter three cities
and displays them in ascending order.
 */
package chapter04.mathcharstring.exercises;

import java.util.Scanner;

public class Exercise_4_24 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter first city: ");
        String city1 = input.nextLine();

        System.out.println("Enter second city: ");
        String city2 = input.nextLine();

        System.out.println("Enter third city: ");
        String city3 = input.nextLine();

        if (city2.compareTo(city1) < 0) {

            String temp = city1;
            city1 = city2;
            city2 = temp;
        }
        if (city3.compareTo(city2) < 0) {
            String temp = city2;
            city2 = city3;
            city3 = temp;
        }
        if (city2.compareTo(city1) < 0) {
            String temp = city1;
            city1 = city2;
            city2 = temp;
        }

        System.out.println("Three cities in alphabetical order are " + city1 + " " + city2 + " " + city3 + " ");
    }
}

/*
(Display matrix of 0s and 1s) Write a method that displays an n-by-n matrix
using the following header: Here is a sample run:
public static int printMatrix(int year)
that prompts the user to enter n and displays an n-by-n matrix.
 */
package chapter06.methods.exercises;


import java.util.Scanner;

public class Exercise_6_17 {
    public static void main(String[] args) {

        Scanner inout = new Scanner(System.in);
        System.out.println("Enter n: ");
        int n = inout.nextInt();
        printMatrix(n);
    }
    public static void printMatrix(int n){
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                byte randomBit = (byte) (Math.random() * 2);
                if (j == n-1)
                    System.out.print(randomBit + " \n");
                else
                    System.out.print(randomBit + " ");

            }
        }
    }

}

/* OUTPUT
2000 366 days
2001 365 days
2002 365 days
2003 365 days
2004 366 days
...
2014 365 days
2015 365 days
2016 366 days
2017 365 days
2018 365 days
2019 365 days
2020 366 days
*/
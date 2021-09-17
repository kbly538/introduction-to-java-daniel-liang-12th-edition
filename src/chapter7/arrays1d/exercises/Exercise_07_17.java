/*
(Sort students) Write a program that prompts the user to enter the number of students,
the students’ names, and their scores and prints student names in decreasing
order of their scores. Assume the name is a string without spaces, use the Scanner’s
next() method to read a name.
*/
package chapter7.arrays1d.exercises;

import java.util.Arrays;
import java.util.Scanner;

public class Exercise_07_17 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter number of students: ");
        int numberOfStudents = input.nextInt();

        String[] studentNames = new String[numberOfStudents];
        double[] scores = new double[numberOfStudents];
        System.out.println("Enter student names and scores (e.g. John 45): ");
        for (int i = 0; i < numberOfStudents; i++) {
            studentNames[i] = input.next();
            scores[i] = input.nextDouble();
        }


        for (int i = 0; i < numberOfStudents - 1; i++) {
            double currentMax = scores[i];
            int currentMaxIndex = i;
            String currentMaxStudent = studentNames[i];


            for (int j = i + 1; j < numberOfStudents; j++) {
                if (scores[j] > currentMax) {
                    currentMax = scores[j];
                    currentMaxStudent = studentNames[j];
                    currentMaxIndex = j;

                }
            }
            if (currentMaxIndex != i) {
                scores[currentMaxIndex] = scores[i];
                scores[i] = currentMax;
                studentNames[currentMaxIndex] = studentNames[i];
                studentNames[i] = currentMaxStudent;
            }
        }

        for (int i = 0; i < numberOfStudents; i++) {
            System.out.println(studentNames[i] + ": " + scores[i]);
        }
    }


}

/* OUTPUT

 */
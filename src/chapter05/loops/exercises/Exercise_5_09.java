/*
(Find the two highest scores) Write a program that prompts the user to enter the
number of students and each student’s name and score, and finally displays the
student with the highest score and the student with the second-highest score. Use
the next() method in the Scanner class to read a name rather than using the
nextLine() method. Assume that the number of students is at least 2.
 */
package chapter05.loops.exercises;


import java.util.Scanner;

public class Exercise_5_09 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter number of students: ");
        int numberOfStudents = input.nextInt();


        String highestScoreStudents = "";
        String secondHighestScoreStudents = "";
        int highestScore = 0;
        int secondHighestScore = 0;

        for (int i = 1; i <= numberOfStudents; i++) {
            System.out.println("Enter student's name and score(e.g. Eric 50): ");
            String studentName = input.next();
            int studentScore = input.nextInt();
            if (studentScore > highestScore) {
                highestScoreStudents = studentName + ": " + studentScore;
                highestScore = studentScore;
            } else if (studentScore == highestScore) {
                highestScoreStudents += ", " + studentName + ": " + studentScore;
            } else if (studentScore < highestScore && studentScore > secondHighestScore) {
                secondHighestScoreStudents = studentName + ": " + studentScore;
                secondHighestScore = studentScore;
            } else if (studentScore == secondHighestScore) {
                secondHighestScoreStudents += ", " + studentName + ": " + studentScore;
            }


        }

        System.out.println(highestScoreStudents);
        System.out.println(secondHighestScoreStudents);

        input.close();


    }
}
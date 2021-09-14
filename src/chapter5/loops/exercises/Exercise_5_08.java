/*
(Find the highest score) Write a program that prompts the user to enter the number
of students and each student’s name and score, and finally displays the name
of the student with the highest score. Use the next() method in the Scanner
class to read a name, rather than using the nextLine() method. Assume that the
number of students is at least 1.
 */
package chapter5.loops.exercises;


import java.util.Scanner;

public class Exercise_5_08 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter number of students: ");
        int numberOfStudents = input.nextInt();


        String highestScoreStudentList = "";
        int highestScore = 0;

        for (int i = 1; i <= numberOfStudents; i++) {
            System.out.println("Enter student's name and score(e.g. Eric 50): ");
            String studentName = input.next();
            int studentScore = input.nextInt();
            if (studentScore > highestScore) {
                highestScoreStudentList = studentName + ": " + studentScore;
                highestScore = studentScore;
            } else if (studentScore == highestScore) {
                highestScoreStudentList += ", " + studentName + ": " + studentScore;
            }
        }

        System.out.println(highestScoreStudentList);

        input.close();


    }
}
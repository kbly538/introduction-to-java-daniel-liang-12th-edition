/*
(Assign grades) Write a program that reads student scores, gets the best score, and
then assigns grades based on the following scheme:
Grade is A if score is >= best -10;
Grade is B if score is >= best -20;
Grade is C if score is >= best -30;
Grade is D if score is >= best -40;
Grade is F otherwise.
The program prompts the user to enter the total number of students, then prompts
the user to enter all of the scores, and concludes by displaying the grades.
*/
package chapter07.arrays1d.exercises;

import java.util.Scanner;

public class Exercise_07_01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of students: ");
        int numberOfStudents = input.nextInt();

        System.out.println("Enter 4 scores: ");
        double[] scores = new double[numberOfStudents];
        for (int i = 0; i < numberOfStudents; i++) {
            scores[i] = input.nextDouble();
        }

        double maxScore = findMax(scores);
        for (int i = 0; i < scores.length; i++) {
            System.out.println("Student " + i + " score is " + scores[i] + " and grade is " + gradeScore(scores[i], maxScore));
        }


    }

    public static double findMax(double[] list) {
        double max = list[0];
        for (int i = 0; i < list.length; i++) {
            if (list[i] > max)
                max = list[i];
        }

        return max;
    }

    public static String gradeScore(double score, double bestScore) {
        String grade = "";
        if (score >= bestScore - 10)
            grade = "A";
        else if (score >= bestScore - 20)
            grade = "B";
        else if (score >= bestScore - 30)
            grade = "C";
        else if (score >= bestScore - 40)
            grade = "D";
        else
            grade = "F";
        return grade;
    }
}

/*
Enter the number of students:
4
Enter 4 scores:
40
55
70
58
Student 0 score is 40.0 and grade is C
Student 1 score is 55.0 and grade is B
Student 2 score is 70.0 and grade is A
Student 3 score is 58.0 and grade is B
 */
/*
(Addition quiz) Rewrite Listing 5.1, RepeatAdditionQuiz.java, to alert the user
if an answer is entered again. (Hint: use an array list to store answers.)
 */
package chapter11.InheritenceAndPolymorphism.exercises;

import java.util.ArrayList;
import java.util.Scanner;

public class Exercise_11_16 {
    public static void main(String[] args) {
        int number1 = (int) (Math.random() * 10);
        int number2 = (int) (Math.random() * 10);
        // Create a Scanner
        Scanner input = new Scanner(System.in);
        ArrayList<Integer> invalidAnswers = new ArrayList<>();

        System.out.print(
                "What is " + number1 + " + " + number2 + "? ");
        int answer = input.nextInt();
        invalidAnswers.add(answer);

        while (number1 + number2 != answer || invalidAnswers.contains(answer)) {
            System.out.print("Wrong answer. Try again. What is "
                    + number1 + " + " + number2 + "? ");
            answer = input.nextInt();
            if (invalidAnswers.contains(answer)) {
                System.out.println("You already entered " + answer);
                continue;
            }
        }

        System.out.println("You got it!");
    }
}
/* OUTPUT
Enter number of point in the convex polygon:
3
Enter the points clockwise:
2 5 5 1 -4 3
Area of the convex polygon is : 15.0

Enter number of point in the convex polygon:
7
Enter the points clockwise:
-12 0 -8,5 10 0  11,4 5,5 7,8 6 -5,5 0  -7 -3,5 -5,5
[-12.0, 0.0, -8.5, 10.0, 0.0, 11.4, 5.5, 7.8, 6.0, -5.5, 0.0, -7.0, -3.5, -5.5, -12.0, 0.0]
Area of the convex polygon is : 244.575

 */
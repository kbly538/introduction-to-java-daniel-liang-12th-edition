/*
(Guess the capitals) Write a program that repeatedly prompts the user to enter
a capital for a state. Upon receiving the user input, the program reports whether
the answer is correct. Assume that 50 states and their capitals are stored in a
two-dimensional array, as shown in Figure 8.10. The program prompts the user to
answer all states’ capitals and displays the total correct count. The user’s answer
is not case-sensitive.
 */
package chapter8.array2d.exercises;

import java.util.Scanner;

public class Exercise_08_37 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[][] stateCapitals = {{"Alabama", "Montgomery"}, {"Alaska", "Juneau"},
                {"Arizona", "Phoenix"}, {"Arkansas", "Little Rock"},
                {"California", "Sacramento"}, {"Colorado", "Denver"}};


        String answer = "";
        int questionNumber = 0;
        int correctAnswers = 0;
        boolean[] answered = new boolean[stateCapitals.length];
        while (stateCapitals.length > questionNumber) {
            int randomState = (int) (Math.random() * stateCapitals.length);
            if (!answered[randomState]) {
                System.out.println("What is the capital of " + (stateCapitals[randomState][0]));
                answer = input.nextLine().toLowerCase();
                if (answer.equals(stateCapitals[randomState][1].toLowerCase())) {
                    answered[randomState] = true;
                    System.out.println("Correct answer!");
                    correctAnswers++;
                } else {
                    answered[randomState] = true;
                    System.out.println("Wrong! The correct answer is " + stateCapitals[randomState][1]);
                }
                questionNumber++;
            }

        }

        System.out.println("Correct answers: " + correctAnswers);

    }
}
/*
What is the capital of Arizona
Phoenix
Correct answer!

What is the capital of Colorado
Denvere
Wrong! The correct answer is Denver

What is the capital of Alabama
Montgomery
Correct answer!

What is the capital of Alaska
JUNEAU
Correct answer!

What is the capital of Arkansas
LITTLE ROCK
Wrong! The correct answer is Little Rock

What is the capital of California
SacramentO
Correct answer!

Correct answers: 4

Process finished with exit code 0

*/
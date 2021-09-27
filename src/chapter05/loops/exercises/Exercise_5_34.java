/*
(Game: scissor, rock, paper) Programming Exercise 3.17 gives a program that
plays the scissor–rock–paper game. Revise the program to let the user continuously
play until either the user or the computer wins more than two times than its
opponent.
 */

package chapter05.loops.exercises;

import java.util.Scanner;

public class Exercise_5_34 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int userWins = 0;
        int computerWins = 0;

        while (userWins < 2 && computerWins < 2) {
            byte hand = (byte) (Math.random() * 3);


            System.out.println("Enter your choice 0 for scissor, 1 for frock or 2 for paper: ");
            byte guess = input.nextByte();

            switch (guess) {
                case 0:
                    System.out.println("You: scissor");
                    break;
                case 1:
                    System.out.println("You: rock");
                    break;
                case 2:
                    System.out.println("You: paper");
                    break;
                default:
                    System.out.println("Invalid input");
            }

            switch (hand) {
                case 0:
                    System.out.println("Computer: scissor");
                    break;
                case 1:
                    System.out.println("Computer: rock");
                    break;
                case 2:
                    System.out.println("Computer: paper");
                    break;
            }

            // 0: scissor 1: rock 2: paper
            // 0 > 2
            // 1 > 0
            // 2 > 1
            if (guess == hand) {
                System.out.println("Draw.");
            } else if (guess == 0 && hand == 2 ||
                    guess == 1 && hand == 0 ||
                    guess == 2 && hand == 1) {
                System.out.println("You win");
                userWins++;
                System.out.println("Your win count: " + userWins);
            } else {
                System.out.println("You lose.");
                computerWins++;
                System.out.println("Computer win count: " + computerWins);

            }

            if (userWins == 2) {
                System.out.println("You have won the game with 2 wins.");
            } else if (computerWins == 2) {
                System.out.println("Computer has won the game with 2 wins.");
            }


        }
        input.close();
    }
}

/* OUTPUT
Enter your choice 0 for scissor, 1 for frock or 2 for paper:
1
You: rock
Computer: paper
You lose.
Computer win count: 1

Enter your choice 0 for scissor, 1 for frock or 2 for paper:
1
You: rock
Computer: paper
You lose.
Computer win count: 2

Computer has won the game with 2 wins.

*/
/*
(Game: craps) Craps is a popular dice game played in casinos. Write a program
to play a variation of the game, as follows:
Roll two dice. Each die has six faces representing values 1, 2, . . ., and 6, respectively.
Check the sum of the two dice. If the sum is 2, 3, or 12 (called craps), you
lose; if the sum is 7 or 11 (called natural), you win; if the sum is another value
(i.e., 4, 5, 6, 8, 9, or 10), a point is established. Continue to roll the dice until either
a 7 or the same point value is rolled. If 7 is rolled, you lose. Otherwise, you win.
Your program acts as a single player.
 */
package chapter06.methods.exercises;

public class Exercise_6_30 {
    public static void main(String[] args) {
        startGame();
    }

    public static int rollDice() {
        int die1 = 1 + (int) (Math.random() * 7);
        int die2 = 1 + (int) (Math.random() * 7);
        System.out.println("You rolled " + die1 + " + " + die2 + " = " + (die1 + die2));
        return die1 + die2;
    }

    public static void startGame() {
        boolean gameIsRunning = true;
        int diceSum = rollDice();
        while (gameIsRunning) {
            if (checkResult(diceSum) == -1) {
                System.out.println("You lose");
                gameIsRunning = false;
            } else if (checkResult(diceSum) == 1) {
                System.out.println("You win");
                gameIsRunning = false;
            } else {
                int nextRoll = rollDice();
                if (nextRoll == 7) {
                    System.out.println("You lose");
                    gameIsRunning = false;
                } else if (nextRoll == diceSum) {
                    System.out.println("You win.");
                    gameIsRunning = false;
                }
            }
        }
    }

    public static int checkResult(int sum) {
        if (sum == 2 || sum == 3 || sum == 12) {
            return -1;
        } else if (sum == 7 || sum == 11) {
            return 1;
        }

        return sum;
    }

}
/* OUTPUT
You rolled 3 + 4 = 7
You win
--------------------------
You rolled 4 + 6 = 10
You rolled 2 + 7 = 9
You rolled 1 + 3 = 4
You rolled 2 + 7 = 9
You rolled 4 + 3 = 7
You lose
--------------------------
You rolled 3 + 5 = 8
You rolled 4 + 7 = 11
You rolled 6 + 7 = 13
You rolled 4 + 7 = 11
You rolled 5 + 3 = 8
You win.
--------------------------
You rolled 1 + 1 = 2
You lose

*/
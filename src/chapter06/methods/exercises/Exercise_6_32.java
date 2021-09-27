/*
(Game: chance of winning at craps) Revise Programming Exercise 6.30 to run it
10,000 times and display the number of winning games.
*/

package chapter06.methods.exercises;

public class Exercise_6_32 {
    public static void main(String[] args) {
        int games = 1000;
        int winCount = 0;

        for (int i = 0; i < games; i++) {
            int result = startGame();
            if (result == 1)
                winCount++;
        }
        System.out.println("Wins: " + winCount);
        System.out.println("Win ratio: " + 1.0 * winCount / games);
    }

    public static int rollDice() {
        int die1 = 1 + (int) (Math.random() * 7);
        int die2 = 1 + (int) (Math.random() * 7);
        return die1 + die2;
    }

    public static int startGame() {
        boolean gameIsRunning = true;
        int diceSum = rollDice();
        while (gameIsRunning) {
            if (checkResult(diceSum) == -1) {
                gameIsRunning = false;
                return -1;
            } else if (checkResult(diceSum) == 1) {
                gameIsRunning = false;
                return -1;
            } else {
                int nextRoll = rollDice();
                if (nextRoll == 7) {
                    gameIsRunning = false;
                    return -1;
                } else if (nextRoll == diceSum) {
                    return 1;
                }
            }
        }
        return 0;
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

Enter a credit card number as a long integer:
4388576018410707
4388576018410707 is valid.


*/
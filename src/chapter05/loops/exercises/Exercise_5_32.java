/*
(Game: lottery) Revise Listing 3.8, Lottery.java, to generate a lottery of a two digit
number. The two digits in the number are distinct. (Hint: Generate the first
digit. Use a loop to continuously generate the second digit until it is different
from the first digit.)
 */

package chapter05.loops.exercises;

import java.util.Scanner;

public class Exercise_5_32 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);


        // concatenate the digits
        String lotteryNumber = "";

        // Generate random lottery number
        int randomSecondDigit = (int) (Math.random() * 10);
        int randomFirstDigit = (int) (Math.random() * 10);
        lotteryNumber += randomSecondDigit;

        // if the digits are the same or tens digit is 0 generate a new number
        while (randomFirstDigit == randomSecondDigit || randomFirstDigit == 0) {
            randomFirstDigit = (int) (Math.random() * 10);
            System.out.println(randomFirstDigit);
        }

        lotteryNumber = randomFirstDigit + lotteryNumber;
        int lottery = Integer.parseInt(lotteryNumber);

        System.out.println(lottery);

        // Get user guess
        System.out.println("Enter your bet as a two-digit number: ");
        int bet = input.nextInt();
        input.close();

        // Get digits of guess and lottery
        int onesDigit = randomSecondDigit;
        int tensDigit = randomFirstDigit;

        int betOnesDigit = bet % 10;
        int betTensDigit = bet / 10;

        // rules for winning a prize
        if (lottery == bet) { // if guess and lottery numbers are the same
            System.out.println("You won $10,000!");
        } else if (onesDigit == betTensDigit && // if numbers are the same but different order
                tensDigit == betOnesDigit) {
            System.out.println("You won $3,000");
        } else if (onesDigit == betOnesDigit || // if only one number is the same
                onesDigit == betTensDigit ||
                tensDigit == betOnesDigit ||
                tensDigit == betTensDigit) {
            System.out.println("You won $1,000!");
        } else {
            System.out.println("Sorry. No math.");
        }

        System.out.println("Lottery numbers were: " + lottery);
    }
}

/* OUTPUT
Enter your bet as a two-digit number: 90
You won $1,000!
Lottery numbers were: 80
*/
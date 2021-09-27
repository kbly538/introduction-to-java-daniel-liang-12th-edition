/* Listing 5.2 */
package chapter05.loops.listings;

import java.util.Scanner;

public class GuessNumberOneTime {
    public static void main(String[] args) {
        // Generate random number to be guessed
        int randomNumber = (int) (Math.random() * 101);

        Scanner input = new Scanner(System.in);
        System.out.println("Guess a magic number between 0 and 100");

        // Prompt the user to guess the number
        System.out.println("\nEnter your guess: ");
        int guess = input.nextInt();

        if (guess == randomNumber) {
            System.out.println("Yes, the number is " + randomNumber);
        } else if (guess > randomNumber) {
            System.out.println("Your guess is too high.");
        } else {
            System.out.println("Your guess is too low.");
        }
    }
}

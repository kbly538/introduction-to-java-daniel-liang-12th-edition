/*
(Game: ATM machine) Use the Account class created in Programming Exercise
9.7 to simulate an ATM machine. Create 10 accounts in an array with id
0, 1, . . . , 9, and an initial balance of $100. The system prompts the user to
enter an id. If the id is entered incorrectly, ask the user to enter a correct id.
Once an id is accepted, the main menu is displayed as shown in the sample
run. You can enter choice 1 for viewing the current balance, 2 for withdrawing
money, 3 for depositing money, and 4 for exiting the main menu. Once
you exit, the system will prompt for an id again. Thus, once the system starts,
it will not stop.
 */
package chapter10.oothinking.exercises.Exercise_10_07;

import java.util.Scanner;

public class TestAtmMachine {
    public static void main(String[] args) {

        AtmMachine atmMachine = new AtmMachine();
        Scanner input = new Scanner(System.in);

        while (true) {
            atmMachine.displayLogin();
            atmMachine.displayMenu();
            int choice = input.nextInt();
            if ((choice >= 1 || choice <= 3)) {
                do {
                    atmMachine.chooseMenuItem(choice);
                    atmMachine.displayMenu();
                    choice = input.nextInt();
                } while (choice != 4);
            }
        }


    }
}

/* OUTPUT
Prime numbers less than 120 are
113 109 107 103 101 97 89 83 79 73 71 67 61 59 53 47 43 41 37 31 29 23 19 17 13 11 7 5 3 2
 */

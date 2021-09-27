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

import chapter9.ObjectsAndClasses.exercises.Exercise_09_07.Account;

import java.util.Scanner;

public class AtmMachine {

    Scanner input = new Scanner(System.in);
    private Account[] accounts;
    private Account activeAccount;

    public AtmMachine() {
        accounts = new Account[10];
        for (int i = 0; i < accounts.length; i++) {
            Account acc = new Account(i, 100, 0);
            accounts[i] = acc;
        }
    }

    public Account[] getAccount() {
        return accounts;
    }

    public void displayMenu() {
        System.out.println("Main menu: ");
        System.out.println("1: Check Balance ");
        System.out.println("2: Withdraw ");
        System.out.println("3: Deposit ");
        System.out.println("4: Exit ");
    }

    public Account displayLogin() {
        System.out.println("Enter the ID: ");
        int id = input.nextInt();
        while (id < 0 || id > 9) {
            System.out.println("Wrong ID. Enter the ID again.");
            displayLogin();
        }

        activeAccount = getAccount()[id];
        return getAccount()[id];
    }

    public void logout() {
        displayLogin();
    }

    public void chooseMenuItem(int choice) {
        double amount;
        switch (choice) {
            case 1:
                System.out.println(activeAccount.getBalance());
                break;
            case 2:
                System.out.println("Enter amount to withdraw: ");
                amount = input.nextDouble();
                activeAccount.withdraw(amount);
                System.out.println("Current balance: ");
                System.out.println(activeAccount.getBalance());
                break;
            case 3:
                System.out.println("Enter amount to deposit: ");
                amount = input.nextDouble();
                activeAccount.deposit(amount);
                System.out.println("Current balance: ");
                System.out.println(activeAccount.getBalance());
                break;
            case 4:
                logout();
                break;
        }
    }
}

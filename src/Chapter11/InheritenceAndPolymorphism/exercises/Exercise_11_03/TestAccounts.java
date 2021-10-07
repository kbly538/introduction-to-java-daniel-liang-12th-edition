package Chapter11.InheritenceAndPolymorphism.exercises.Exercise_11_03;

import chapter09.ObjectsAndClasses.exercises.Exercise_09_07.Account;

public class TestAccounts {
    public static void main(String[] args) {

        Account savingAccount = new SavingAccount(1, 5000, 4.5);
        Account checkingAccount = new CheckingAccount(2, 10000, 4.5, 2000);

        System.out.println("Saving account balance: " + checkingAccount.getBalance());
        savingAccount.withdraw(1000);
        savingAccount.withdraw(1000);
        savingAccount.withdraw(1000);
        System.out.println("Saving account balance after withdrawing 3k: " + savingAccount.getBalance());
        savingAccount.withdraw(1000);
        System.out.println("Saving account balance after withdrawing 1k more: " + savingAccount.getBalance());
        savingAccount.withdraw(1000);
        System.out.println("Saving account balance after withdrawing 1k more " + savingAccount.getBalance());
        System.out.println("Trying to withdraw $1: ");
        savingAccount.withdraw(1);
        System.out.println();

        System.out.println("Checking account balance: " + checkingAccount.getBalance());
        checkingAccount.withdraw(10000);
        System.out.println("Checking account balance after withdrawing 10k: " + checkingAccount.getBalance());
        checkingAccount.withdraw(1000);
        System.out.println("Checking account balance after withdrawing 1k more: " + checkingAccount.getBalance());
        System.out.println("Tring to withdraw $1001");
        checkingAccount.withdraw(1001);

    }
}

/* OUTPUT
Saving account balance: 10000.0
Saving account balance after withdrawing 3k: 2000.0
Saving account balance after withdrawing 1k more: 1000.0
Saving account balance after withdrawing 1k more 0.0
Trying to withdraw $1:
You can't withdraw specified amount. Current Balance: 0.0

Checking account balance: 10000.0
Checking account balance after withdrawing 10k: 0.0
Checking account balance after withdrawing 1k more: -1000.0
Tring to withdraw $1001
You have already reached the draft limit.
 */

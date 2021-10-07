/*
(Subclasses of Account) In Programming Exercise 9.7, the Account class was
defined to model a bank account. An account has the properties account number,
balance, annual interest rate, and date created, and methods to deposit and withdraw
funds. Create two subclasses for checking and saving accounts. A checking
account has an overdraft limit, but a savings account cannot be overdrawn.
Draw the UML diagram for the classes and implement them. Write a test program
that creates objects of Account, SavingsAccount, and CheckingAccount and
invokes their toString() methods.
 */
package Chapter11.InheritenceAndPolymorphism.exercises.Exercise_11_03;

import chapter09.ObjectsAndClasses.exercises.Exercise_09_07.Account;

public class CheckingAccount extends Account {
    double draftLimit;

    public CheckingAccount() {
        this(0, 0, 0, 2000);
    }

    public CheckingAccount(int id, double balance, double annualInterestRate, double draftLimit) {
        super(id, balance, annualInterestRate);
        this.draftLimit = draftLimit;
    }

    @Override
    public void withdraw(double amount) {
        if (this.getBalance() - 2000 < -draftLimit) {
            System.out.println("You have already reached the draft limit.");
            return;
        } else {
            super.withdraw(amount);
        }
    }

}

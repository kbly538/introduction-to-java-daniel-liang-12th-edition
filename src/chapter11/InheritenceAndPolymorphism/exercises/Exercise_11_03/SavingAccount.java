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
package chapter11.InheritenceAndPolymorphism.exercises.Exercise_11_03;

import chapter09.ObjectsAndClasses.exercises.Exercise_09_07.Account;

public class SavingAccount extends Account {

    public SavingAccount() {
    }

    public SavingAccount(int id, double balance, double annualInterestRate) {
        super(id, balance, annualInterestRate);
    }

    @Override
    public void withdraw(double amount) {
        if (getBalance() - amount < 0) {
            System.out.println("You can't withdraw specified amount. Current Balance: " + getBalance());
            return;
        } else {
            super.withdraw(amount);
        }
    }
}

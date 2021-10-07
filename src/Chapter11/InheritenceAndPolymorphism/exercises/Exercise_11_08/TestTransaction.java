package Chapter11.InheritenceAndPolymorphism.exercises.Exercise_11_08;

public class TestTransaction {

    public static void main(String[] args) {

        Account acc1 = new Account("George", 1122, 1000);
        acc1.setAnnualInterestRate(1.5);

        acc1.deposit(30);
        acc1.deposit(40);
        acc1.deposit(50);
        acc1.withdraw(5);
        acc1.withdraw(4);
        acc1.withdraw(2);

        System.out.println("Account summary: ");
        System.out.println("Account holder: " + acc1.getName());
        System.out.println("Interest rate: " + acc1.getAnnualInterestRate());
        System.out.println("Balance: " + acc1.getBalance());
        System.out.println("Transactions: ");
        for (int i = 0; i < acc1.getTransactions().size(); i++) {
            String transactionInfo = acc1.getTransactions().get(i).getDescription();
            System.out.println((i + 1) + ": " + transactionInfo);
        }
    }
}

/* OUTPUT
Account summary:
Account holder: George
Interest rate: 1.5
Balance: 1109.0
Transactions:
1: Action: deposit
Amount: 30.0
Remaining balance: 1030.0
Customer: George
2: Action: deposit
Amount: 40.0
Remaining balance: 1070.0
Customer: George
3: Action: deposit
Amount: 50.0
Remaining balance: 1120.0
Customer: George
4: Action: withdraw
Amount: 5.0
Remaining balance: 1115.0
Customer: George
5: Action: withdraw
Amount: 4.0
Remaining balance: 1111.0
Customer: George
6: Action: withdraw
Amount: 2.0
Remaining balance: 1109.0
Customer: George

 */

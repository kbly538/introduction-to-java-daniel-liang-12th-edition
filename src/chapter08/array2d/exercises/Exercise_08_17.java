/*
(Financial tsunami) Banks lend money to each other. In tough economic times, if a
bank goes bankrupt, it may not be able to pay back the loan. A bank’s total assets are
its current balance plus its loans to other banks. The diagram in Figure 8.8 shows
five banks. The banks’ current balances are 25, 125, 175, 75, and 181 million dollars,
respectively. The directed edge from node 1 to node 2 indicates that bank 1
lends 40 million dollars to bank 2.
If a bank’s total assets are under a certain limit, the bank is unsafe. The money it
borrowed cannot be returned to the lender, and the lender cannot count the loan in
its total assets. Consequently, the lender may also be unsafe, if its total assets are
under the limit. Write a program to find all the unsafe banks. Your program reads
the input as follows. It first reads two integers n and limit, where n indicates the
number of banks and limit is the minimum total assets for keeping a bank safe. It
then reads n lines that describe the information for n banks with IDs from 0 to n−1.
The first number in the line is the bank’s balance, the second number indicates
the number of banks that borrowed money from the bank, and the rest are pairs
of two numbers. Each pair describes a borrower. The first number in the pair is
the borrower’s ID and the second is the amount borrowed. For example, the input
for the five banks in Figure 8.8 is as follows (note the limit is 201):
5 201
25 2 1 100.5 4 320.5
125 2 2 40 3 85
175 2 0 125 3 75
75 1 0 125
181 1 2 125
The total assets of bank 3 are (75 + 125), which is under 201, so bank 3 is unsafe.
After bank 3 becomes unsafe, the total assets of bank 1 fall below (125 + 40).
Thus, bank 1 is also unsafe. The output of the program should be
Unsafe banks are 3 1
(Hint: Use a two-dimensional array borrowers to represent loans. borrowers[
i][j] indicates the loan that bank i provides to bank j. Once bank j
becomes unsafe, borrowers[i][j] should be set to 0.)
 */
package chapter08.array2d.exercises;

import java.util.Scanner;

public class Exercise_08_17 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter number of banks: ");
        int numberOfBanks = input.nextInt();

        System.out.println("Enter safe limit: ");
        int limit = input.nextInt();


        int[][] banks = new int[numberOfBanks][6];

        // fill info
        System.out.println("Enter bank info as (bank_balance #_of_Borrowers borrower_id amount borrower_id amount)" +
                "\ne.g. 123 2 0 75 3 121");

        for (int i = 0; i < numberOfBanks; i++) {
            System.out.print(">>> ");
            for (int j = 0; j < banks[0].length; j++) {
                banks[i][j] = input.nextInt();
            }
        }


        // create borrowers list with corresponding lenders
        // lender = borrower1 amount borrower2 amount
        int[][] borrowers = new int[numberOfBanks][4];
        for (int lender = 0; lender < borrowers.length; lender++) {
            for (int i = 0; i < 4; i++) {
                borrowers[lender][i] = banks[lender][i + 2];
            }
        }

        int[] unsafeBanks = {-1, -1, -1, -1, -1};
        for (int i = 0; i < banks.length; i++) {
            if (notSafe(banks, i, borrowers, limit) && unsafeBanks[i] != i) {
                unsafeBanks[i] = i;
                deduceFromLenders(borrowers, i);
                i = -1;
            }
        }

        System.out.print("Unsafe banks are: ");
        for (int unsafeBank : unsafeBanks) {
            if (unsafeBank != -1)
                System.out.print(unsafeBank + " ");
        }

    }

    public static boolean notSafe(int[][] banks, int bankIndex, int[][] borrowers, int limit) {
        return getTotalAssets(banks, borrowers, bankIndex) <= limit;
    }

    public static double getBalance(int[][] banks, int bankIndex) {
        return banks[bankIndex][0];
    }

    public static double getTotalAssets(int[][] banks, int[][] borrowers, int bankIndex) {
        return getBalance(banks, bankIndex) + borrowers[bankIndex][1] + borrowers[bankIndex][3];
    }

    public static void deduceFromLenders(int[][] borrowers, int lenderIndex) {
        for (int i = 0; i < borrowers.length; i++) {
            for (int j = 0; j < borrowers[0].length - 1; j++) {
                if (borrowers[i][j] == lenderIndex)
                    borrowers[i][j + 1] = 0;
            }
        }
    }
}
/* OUTPUT
Enter number of banks:
5
Enter safe limit:
201
Enter bank info as (bank_balance #_of_Borrowers borrower_id amount borrower_id amount)
e.g. 123 2 0 75 3 121
>>> 25 2 1 101 4 321
>>> 125 2 2 40 3 85
>>> 175 2 0 125 3 75
>>> 75 1 0 125 0 0
>>> 181 1 2 125 0 0
Unsafe banks are: 1 3

Enter number of banks:
5
Enter safe limit:
9920 0 0 0 0 0
Enter bank info as (bank_balance #_of_Borrowers borrower_id amount borrower_id amount)
e.g. 123 2 0 75 3 121
>>> 98 2 1 50 3 20
>>> 50 0 0 0 0 0
>>> 100 0 0 0 0 0
>>> 20 0 0 0 0 0
>>> 100 0 0 0 0 0
Unsafe banks are: 0 1 3
*/
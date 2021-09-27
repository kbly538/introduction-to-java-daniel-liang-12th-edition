/*
(Simulation: coupon collector’s problem) Coupon collector is a classic statistics
problem with many practical applications. The problem is to repeatedly pick
objects from a set of objects and find out how many picks are needed for all the
objects to be picked at least once. A variation of the problem is to pick cards from
a shuffled deck of 52 cards repeatedly, and find out how many picks are needed
before you see one of each suit. Assume a picked card is placed back in the deck before picking another.
Write a program to simulate the number of picks needed
to get four cards from each suit and display the four cards picked (it is possible a
card may be picked twice).
*/
package chapter07.arrays1d.exercises;

public class Exercise_07_24 {
    public static void main(String[] args) {


        int[] deck = new int[52];
        createDeck(deck);
        shuffleDeck(deck);

        int[] suits = {0, 1, 2, 3};
        int[] foundSuits = new int[4];


        int totalPicks = 0;
        int startIndex = 0;
        String[] currentPicks = new String[4];

        while (!equals(suits, foundSuits)) {
            // reset suits found
            for (int i = 0; i < suits.length; i++) {
                foundSuits[i] = -1;
            }

            // shuffle deck if all cards are used
            if (startIndex >= 52)
                startIndex = 0;
            shuffleDeck(deck);


            currentPicks = getCards(deck, foundSuits, startIndex);

            totalPicks++;
            startIndex += 4;
        }
        if (equals(suits, foundSuits)) {
            for (int i = 0; i < 4; i++) {
                System.out.println(currentPicks[i]);
            }
            System.out.println("Found all suits. Counter: " + totalPicks);
        }


    }

    public static String[] getCards(int[] deck, int[] foundSuits, int startIndex) {

        String[] suits = {"Spades", "Hearts", "Diamonds", "Clubs"};
        String[] ranks = {"Ace", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King"};
        String[] pick = new String[4];

        for (int i = startIndex; i < startIndex + 4; i++) {
            String suit = suits[deck[i] / 13];
            String rank = ranks[deck[i] % 13];

            // Fill found suits
            foundSuits[deck[i] / 13] = deck[i] / 13;
            // Store found card
            pick[deck[i] / 13] = rank + " of " + suit;
        }

        // return founds cards as a string array
        return pick;
    }

    public static void createDeck(int[] deck) {
        for (int i = 0; i < deck.length; i++) {
            deck[i] = i;
        }

    }

    public static void shuffleDeck(int[] deck) {
        // Shuffle deck
        for (int i = 0; i < deck.length; i++) {
            int randomIndex = (int) (Math.random() * deck.length);
            int temp = deck[i];
            deck[i] = deck[randomIndex];
            deck[randomIndex] = temp;
        }
    }

    public static boolean equals(int[] array1, int[] array2) {
        for (int i = 0; i < array1.length; i++) {
            for (int j = 0; j < array2.length; j++) {
                if (array1[i] != array2[i])
                    return false;
            }
        }
        return true;
    }


}

/* OUTPUT
8 of Spades
9 of Hearts
1 of Diamonds
5 of Clubs
Found all suits. Counter: 22

Jack of Spades
Queen of Hearts
10 of Diamonds
4 of Clubs
Found all suits. Counter: 4


2 of Spades
8 of Hearts
9 of Diamonds
3 of Clubs
Found all suits. Counter: 2

 */
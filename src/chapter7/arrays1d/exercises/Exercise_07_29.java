/*
(Game: pick four cards) Write a program that picks four cards from a deck of 52
cards and computes their sum. An Ace, King, Queen, and Jack represent 1, 13, 12,
and 11, respectively. Your program should display the number of picks that yields
the sum of 24.
*/
package chapter7.arrays1d.exercises;


public class Exercise_07_29 {
    public static void main(String[] args) {
        int[] deck = new int[52];
        createDeck(deck);
        shuffleDeck(deck);
        System.out.println("Sum of the cards is " + getCards(deck));

    }

    // Get a set of four cards and return their sum
    public static int getCards(int[] deck) {

        String[] suits = {"Spades", "Hearts", "Diamonds", "Clubs"};
        String[] ranks = {"Ace", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King"};
        int sum = 0;

        for (int i = 0; i < 4; i++) {
            String suit = suits[deck[i] / 13];
            String rank = ranks[deck[i] % 13];
            int rankPoint = deck[i] % 13;
            switch (rankPoint) {
                case 0:
                    sum += 1;
                    break;
                default:
                    sum += rankPoint;
            }
            System.out.println(rank + " of " + suit);
        }

        return sum;
    }

    // Deck initialization
    public static void createDeck(int[] deck) {
        for (int i = 0; i < deck.length; i++) {
            deck[i] = i;
        }

    }

    // Shuffle method
    public static void shuffleDeck(int[] deck) {
        // Shuffle deck
        for (int i = 0; i < deck.length; i++) {
            int randomIndex = (int) (Math.random() * deck.length);
            int temp = deck[i];
            deck[i] = deck[randomIndex];
            deck[randomIndex] = temp;
        }
    }

}

/* OUTPUT
6 of Diamonds
2 of Hearts
Ace of Clubs
6 of Spades
Sum of the cards is 15

7 of Clubs
2 of Spades
4 of Diamonds
6 of Spades
Sum of the cards is 19
 */
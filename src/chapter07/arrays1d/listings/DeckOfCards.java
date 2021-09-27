/* Listing 7.2 */
package chapter07.arrays1d.listings;

public class DeckOfCards {
    public static void main(String[] args) {

        String[] suits = {"Spades", "Hearts", "Diamonds", "Clubs"};
        String[] ranks = {"Ace", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King"};

        int[] deck = new int[52];

        // Initialize deck
        for (int i = 0; i < deck.length; i++) {
            deck[i] = i;
        }

        // Shuffle deck

        for (int i = 0; i < deck.length; i++) {
            int randomIndex = (int) (Math.random() * deck.length);
            int temp = deck[i];
            deck[i] = deck[randomIndex];
            deck[randomIndex] = temp;
        }

        // Display the first four cards
        for (int i = 0; i < 4; i++) {
            String suit = suits[deck[i] / 13];
            String rank = ranks[deck[i] % 13];
            System.out.println("Card number " + deck[i] + ": " + rank + " of " + suit);
        }


    }
}

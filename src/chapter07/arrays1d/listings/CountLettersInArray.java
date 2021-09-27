/* Listing 7.4 */
package chapter07.arrays1d.listings;

public class CountLettersInArray {
    public static void main(String[] args) {

        char[] chars = new char[100];

        for (int i = 0; i < chars.length; i++) {
            chars[i] = getRandomLowerCaseLetter();
        }

        int[] counts = new int[26];
        for (int i = 0; i < chars.length; i++) {
            counts[chars[i] - 'a'] += 1;
        }

        for (int i = 0; i < counts.length; i++) {
            if (counts[i] != 0)
                System.out.println(counts[i] + " " + (char) (i + 'a'));
        }

    }

    private static char getRandomLowerCaseLetter() {
        return (char) ('a' + (int) (Math.random() * 26));
    }

}

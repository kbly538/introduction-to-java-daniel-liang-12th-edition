/*
(Culture: Chinese Zodiac) Simplify Listing 3.9 using an array of strings to store
the animal names.
*/
package chapter07.arrays1d.exercises;


import java.util.Scanner;

public class Exercise_07_33 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a year: ");
        int year = input.nextInt();
        String[] zodiac = {"monkey", "rooster", "dog", "pig", "rat", "ox", "tiger", "rabbit"
                , "dragon", "snake", "horse", "sheep"};

        System.out.println(zodiac[year % 12]);
    }

}

/* OUTPUT
Enter a year:
1990
horse
 */
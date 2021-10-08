/*
(Baby name popularity ranking) The popularity ranking of baby names from
years 2001 to 2010 is downloaded from www.ssa.gov/oact/babynames and stored
in files named babynameranking2001.txt, babynameranking2002.txt, . . . ,
babynameranking2010.txt. You can download these files using the URL such
as http://liveexample.pearsoncmg.com/data/babynamesranking2001.txt. Each file
contains 1,000 lines. Each line contains a ranking, a boy’s name, number for the
boy’s name, a girl’s name, and number for the girl’s name.

Therefore, the boy’s name Jacob and girl’s name Isabella are ranked #1 and the
boy’s name Ethan and girl’s name Sophia are ranked #2; 21,875 boys are named
Jacob, and 22,731 girls are named Isabella. Write a program that prompts the
user to enter the year, gender, followed by a name, and displays the ranking
of the name for the year. Your program should read the data directly from the
Web.
 */
package Chapter12.ExceptionHandlingTextIO.exercises;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.net.URL;
import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class Exercise_12_31 {
    public static void main(String[] args) throws IOException {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the year: ");
        int year = input.nextInt();
        if (year < 2001 || year > 2010) {
            System.out.println("Year must be between 2001 and 2010");
            System.exit(1);
        }


        System.out.println("Enter the gender: ");
        String gender = input.next();


        System.out.println("Enter the name: ");
        String name = input.next().toLowerCase(Locale.ROOT);

        URL url = new URL("http://liveexample.pearsoncmg.com/data/babynamesranking" + year + ".txt");

        try (Scanner urlStream = new Scanner(url.openStream())) {
            while (urlStream.hasNext()) {
                String nextline = urlStream.nextLine();
                String[] nextlineContent = nextline.split("\t"); // index 0: rank
                // index 1-3: name
                // index 2-4: number

                for (int i = 0; i < nextlineContent.length; i++) {
                    nextlineContent[i] = nextlineContent[i].trim().toLowerCase(Locale.ROOT);
                }

                if (Character.toLowerCase(gender.charAt(0)) == 'm')
                    if (name.equals(nextlineContent[1])) {
                        System.out.println(name + " is ranked #" + nextlineContent[0] + " in year " + year);
                        System.exit(1);
                    } else if (Character.toLowerCase(gender.charAt(0)) == 'f')
                        if (name.equals(nextlineContent[3])) {
                            System.out.println(name + " is ranked " + nextlineContent[0] + "in year " + year);
                            System.exit(1);
                        } else {
                            System.out.println("Enter M for male and F for female.");
                            System.exit(0);
                        }
            }
        }
        System.out.println(name + " is not ranked in year " + year);
    }
}


/*
Enter the year:
2010
Enter the gender:
M
Enter the name:
JAVIER
javier is ranked #190 in year 2010

 Enter the year:
2010
Enter the gender:
m
Enter the name:
kl
kl is not ranked in year 2010
 */
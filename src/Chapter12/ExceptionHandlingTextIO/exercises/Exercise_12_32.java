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

import java.io.IOException;
import java.net.URL;
import java.util.Locale;
import java.util.Scanner;

public class Exercise_12_32 {
    public static void main(String[] args) throws IOException {


        System.out.printf("%-13s%-13s%-13s%-13s%-13s%-13s%-13s%-13s%-13s%-13s%-13s\n",
                "Year",
                "Rank 1", "Rank 2", "Rank 3", "Rank 4", "Rank 5",
                "Rank 1", "Rank 2", "Rank 3", "Rank 4", "Rank 5");
        for (int i = 2001; i <= 2010; i++) {
            URL url = new URL("http://liveexample.pearsoncmg.com/data/babynamesranking" + i + ".txt");
            System.out.printf("%-13d", i);
            try (Scanner urlStream = new Scanner(url.openStream())) {
                for (int j = 0; j < 5; j++) {
                    String nextline = urlStream.nextLine();
                    String[] nextlineContent = nextline.split("\t"); // index 0: rank
                    // index 1-3: name
                    // index 2-4: number
                    for (int k = 0; k < nextlineContent.length; k++)
                        nextlineContent[k] = nextlineContent[k].trim();

                    System.out.printf("%-13s", nextlineContent[3]);
                }
                for (int j = 0; j < 5; j++) {
                    String nextline = urlStream.nextLine();
                    String[] nextlineContent = nextline.split("\t"); // index 0: rank
                    // index 1-3: name
                    // index 2-4: number
                    for (int k = 0; k < nextlineContent.length; k++)
                        nextlineContent[j] = nextlineContent[j].trim();

                    System.out.printf("%-13s", nextlineContent[1]);
                }
            }
            System.out.println();
        }
    }
}


/*
Year         Rank 1       Rank 2       Rank 3       Rank 4       Rank 5       Rank 1       Rank 2       Rank 3       Rank 4       Rank 5
2001         Emily        Madison      Hannah       Ashley       Alexis       Nicholas     Andrew       Joseph       Daniel       William
2002         Emily        Madison      Hannah       Emma         Alexis       Andrew       Joseph       Christopher  Nicholas     Daniel
2003         Emily        Emma         Madison      Hannah       Olivia       Ethan        Joseph       Daniel       Christopher  Anthony
2004         Emily        Emma         Madison      Olivia       Hannah       Andrew       Daniel       William      Joseph       Christopher
2005         Emily        Emma         Madison      Abigail      Olivia       Andrew       Daniel       Anthony      Joseph       Christopher
2006         Emily        Emma         Madison      Isabella     Ava          Daniel       Andrew       Christopher  Anthony      William
2007         Emily        Isabella     Emma         Ava          Madison      Christopher  Anthony      William      Matthew      Andrew
2008         Emma         Isabella     Emily        Olivia       Ava          Alexander    Anthony      William      Christopher  Matthew
2009         Isabella     Emma         Olivia       Sophia       Ava          Joshua       Daniel       Jayden       Noah         Christopher
2010         Isabella     Sophia       Emma         Olivia       Ava          Alexander    Noah         Daniel       Aiden        Anthony
 */
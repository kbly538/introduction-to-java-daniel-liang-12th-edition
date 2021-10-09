/*
(Search Web) Modify Listing 12.18 WebCrawler.java to search for the word
(e.g., Computer Programming) starting from a URL (e.g., http://cs.armstrong
.edu/liang). Your program prompts the user to enter the word and the starting
URL and terminates once the word is found. Display the URL for the page that
contains the word.
 */
package chapter12.ExceptionHandlingTextIO.exercises;

import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Scanner;

public class Exercise_12_33 {
    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);
        System.out.println("Enter the string you want to search for: ");
        String wordToSearch = input.nextLine().trim();

        System.out.println("Enter URL: ");
        String url = input.nextLine();
        crawler(url, wordToSearch);
    }

    private static void crawler(String startingURL, String wordToSearch) {
        ArrayList<String> listOfPendingURLs = new ArrayList<>();
        ArrayList<String> listOfTraversedURLs = new ArrayList<>();
        boolean found = false;
        listOfPendingURLs.add(startingURL);
        while (!listOfPendingURLs.isEmpty() && 100 >= listOfTraversedURLs.size() || !found) {
            String urlString = listOfPendingURLs.remove(0);
            if (!listOfTraversedURLs.contains(urlString)) {
                listOfTraversedURLs.add(urlString);
                System.out.println("Crawl " + urlString);

                for (String s : getSubURLs(urlString, wordToSearch)) {
                    if (!listOfTraversedURLs.contains(s)) {
                        listOfPendingURLs.add(s);
                    }
                }
            }
        }

    }

    private static ArrayList<String> getSubURLs(String urlString, String word) {
        ArrayList<String> list = new ArrayList<>();

        try {
            URL url = new URL(urlString);
            Scanner input = new Scanner(url.openStream());
            int current = 0;
            boolean wordFound = false;
            while (input.hasNext()) {
                String line = input.nextLine();
                current = line.indexOf("http:", current);
                while (current > 0) {
                    if (line.contains(word)) {
                        System.out.println("Word found.");
                        System.out.println("URL: " + url.toString());
                        System.exit(1);
                    }
                    int endIndex = line.indexOf("\"", current);
                    if (endIndex > 0) {
                        list.add(line.substring(current, endIndex));
                        current = line.indexOf("http:", endIndex);
                    } else {
                        current = -1;
                    }
                }
            }
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }

        return list;
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
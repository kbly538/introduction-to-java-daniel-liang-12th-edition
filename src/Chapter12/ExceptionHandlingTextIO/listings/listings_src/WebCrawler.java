/* Listing 12.18 */

package Chapter12.ExceptionHandlingTextIO.listings.listings_src;

import java.net.URL;
import java.util.ArrayList;
import java.util.Scanner;

public class WebCrawler {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter URL: ");
        String url = input.nextLine();
        crawler(url);
    }

    private static void crawler(String startingURL) {
        ArrayList<String> listOfPendingURLs = new ArrayList<>();
        ArrayList<String> listOfTraversedURLs = new ArrayList<>();

        listOfPendingURLs.add(startingURL);
        while (!listOfPendingURLs.isEmpty() && 100 >= listOfTraversedURLs.size()) {
            String urlString = listOfPendingURLs.remove(0);
            if (!listOfTraversedURLs.contains(urlString)) {
                listOfTraversedURLs.add(urlString);
                System.out.println("Crawl " + urlString);

                for (String s : getSubURLs(urlString)) {
                    if (!listOfTraversedURLs.contains(s)) {
                        listOfPendingURLs.add(s);
                    }
                }
            }
        }

    }

    private static ArrayList<String> getSubURLs(String urlString) {
        ArrayList<String> list = new ArrayList<>();

        try {
            URL url = new URL(urlString);
            Scanner input = new Scanner(url.openStream());
            int current = 0;
            while (input.hasNext()) {
                String line = input.nextLine();
                current = line.indexOf("http:", current);
                while (current > 0) {
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

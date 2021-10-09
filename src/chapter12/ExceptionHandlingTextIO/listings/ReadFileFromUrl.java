package chapter12.ExceptionHandlingTextIO.listings;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Scanner;

public class ReadFileFromUrl {
    public static void main(String[] args) throws Exception {
        System.out.println("Enter URL: ");
        String URLString = new Scanner(System.in).next();

        try {
            URL url = new URL(URLString);
            int count = 0;
            Scanner input = new Scanner(url.openStream());
            while (input.hasNext()) {
                String line = input.nextLine();
                System.out.println(line);
                count += line.length();
            }
            System.out.println("The filse size is " + count + " characters.");
        } catch (MalformedURLException e) {
            System.out.println("Invalid URL.");
        } catch (IOException e) {
            System.out.println("I/O Errors: no such file.");
        }

    }
}

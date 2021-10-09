/*
(Process large dataset) A university posts its employees’ salaries at http://
liveexample.pearsoncmg.com/data/Salary.txt. Each line in the file consists of
a faculty member’s first name, last name, rank, and salary (see Programming
Exercise 12.24). Write a program to display the total salary for assistant professors,
associate professors, full professors, and faculty, respectively, and display
the average salary for assistant professors, associate professors, full professors,
and faculty, respectively.
 */
package chapter12.ExceptionHandlingTextIO.exercises.Exercise_12_25;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Scanner;

public class ProcessLargeDataSet {
    public static void main(String[] args) throws MalformedURLException {
        URL url = new URL("http://liveexample.pearsoncmg.com/data/Salary.txt");

        try (Scanner input = new Scanner(url.openStream())) {
            int numberOfAssistants = 0;
            int numberOfAssociates = 0;
            int numberOfFulls = 0;
            float totalAssistantSalary = 0;
            float totalAssociateSalary = 0;
            float totalFullSalary = 0;
            while (input.hasNext()) {
                String[] employee = input.nextLine().split(" ");
                float employeeSalary = Float.parseFloat(employee[3]);


                switch (employee[2]) {
                    case "assistant":
                        totalAssistantSalary += employeeSalary;
                        numberOfAssistants++;
                        break;
                    case "associate":
                        totalAssociateSalary += employeeSalary;
                        numberOfAssociates++;
                        break;
                    case "full":
                        totalFullSalary += employeeSalary;
                        numberOfFulls++;
                        break;

                }
            }

            System.out.println("Total assistant salary: " + totalAssistantSalary);
            System.out.println("Average assistant salary: " + totalAssistantSalary / numberOfAssistants);
            System.out.println("Total associate salary: " + totalAssociateSalary);
            System.out.println("Average associate salary: " + totalAssociateSalary / numberOfAssociates);
            System.out.println("Total full salary: " + totalFullSalary);
            System.out.println("Average full salary: " + totalFullSalary / numberOfFulls);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

/* OUTPUT
Total assistant salary: 2.0246512E7
Average assistant salary: 65949.55
Total associate salary: 2.8844146E7
Average associate salary: 83849.26
Total full salary: 3.5678056E7
Average full salary: 102229.39

 */


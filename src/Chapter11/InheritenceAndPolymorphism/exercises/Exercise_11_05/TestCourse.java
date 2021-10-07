/*
(The Course class) Rewrite the Course class in Listing 10.6. Use an ArrayList
to replace an array to store students. Draw the new UML diagram for the class.
You should not change the original contract of the Course class (i.e., the definition
of the constructors and methods should not be changed, but the private
members may be changed.)
 */
package Chapter11.InheritenceAndPolymorphism.exercises.Exercise_11_05;

import java.util.ArrayList;

public class TestCourse {
    public static void main(String[] args) {
        Course course1 = new Course("Data Structures");
        Course course2 = new Course("Database Systems");

        course1.addStudent("Peter Jones");
        course1.addStudent("Brian Smith");
        course1.addStudent("Anne Kennedy");
        course1.addStudent("Susan Kennedy");
        course1.addStudent("John Kennedy");
        course1.addStudent("Kim Johnson");
        course1.addStudent("S1");
        course1.addStudent("S2");
        course1.addStudent("S3");
        course1.addStudent("S4");
        course1.addStudent("S5");
        course1.addStudent("S6");
        course1.addStudent("S7");

        course2.addStudent("Peter Jones");
        course2.addStudent("Steve Smith");

        System.out.println("Number of students in course1: "
                + course1.getNumberOfStudents());
        ArrayList<String> students = course1.getStudents();
        for (int i = 0; i < students.size(); i++)
            System.out.print(students.get(i) + (i < course1.getNumberOfStudents() - 1 ? ", " : " "));

        System.out.println();
        System.out.print("Number of students in course2: "
                + course2.getNumberOfStudents());

        course1.dropStudent("S1");
        System.out.println("\nNumber of students in course1: "
                + course1.getNumberOfStudents());
        students = course1.getStudents();
        for (int i = 0; i < course1.getNumberOfStudents(); i++)
            System.out.print(students.get(i) + (i < course1.getNumberOfStudents() - 1 ? ", " : " "));

        course1.clear();
        System.out.println("\nNumber of students in course1: "
                + course1.getNumberOfStudents());
        course2.clear();
        System.out.println("Number of students in course1: "
                + course2.getNumberOfStudents());
    }

}

/*OUTPUT
Number of students in course1: 13
Peter Jones, Brian Smith, Anne Kennedy, Susan Kennedy, John Kennedy, Kim Johnson, S1, S2, S3, S4, S5, S6, S7
Number of students in course2: 2
Number of students in course1: 12
Peter Jones, Brian Smith, Anne Kennedy, Susan Kennedy, John Kennedy, Kim Johnson, S2, S3, S4, S5, S6, S7
Number of students in course1: 0
Number of students in course1: 0

 */
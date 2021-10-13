/*
(Enable the Course class cloneable) Rewrite the Course class in Listing 10.6
to add a clone method to perform a deep copy on the students field.
 */
package chapter13.exercises.Exercise_13_13;

public class TestCourse {
    public static void main(String[] args) {
        Course course1 = new Course("Data Stuructures");
        Course course2 = new Course("Database Systems");

        course1.addStudent("Peter Johns");
        course1.addStudent("Kim Smith");
        course1.addStudent("Anne Kennedy");

        course2.addStudent("Peter Johns");
        course2.addStudent("Steve Smith");

        System.out.println("Number of students in course1: "
                + course1.getNumberOfStudents());
        String[] students = course1.getStudents();
        for (int i = 0; i < course1.getNumberOfStudents(); i++)
            System.out.print(students[i] + ((i == course1.getNumberOfStudents() - 1) ? " " : ", "));
        System.out.println();
        System.out.print("Number of students in course2: "
                + course2.getNumberOfStudents());

        Course course3 = course1.clone();
        course3.dropStudent("Kim Smith");

        System.out.println("Course1 ");
        System.out.println("Course1 number of students after clone drops one: " + course1.getNumberOfStudents());
        for (int i = 0; i < course1.getNumberOfStudents(); i++) {
            System.out.print(students[i] + " ");
        }

        System.out.println();
        System.out.println("Course3 Final");
        System.out.println("Course3 number of students: " + course3.getNumberOfStudents());
        for (int i = 0; i < course3.getNumberOfStudents(); i++) {
            System.out.print(course3.getStudents()[i] + " ");
        }

        System.out.println("Course1 Final");
        System.out.println("Course1 number of students after clone drops one: " + course1.getNumberOfStudents());
        for (int i = 0; i < course1.getNumberOfStudents(); i++) {
            System.out.print(students[i] + " ");
        }
    }
}

/*
Number of students in course1: 3
Peter Johns, Kim Smith, Anne Kennedy
Number of students in course2: 2Course1
Course1 number of students after clone drops one: 3
Peter Johns Kim Smith Anne Kennedy
Course3 Final
Course3 number of students: 2
Peter Johns Anne Kennedy Course1 Final
Course1 number of students after clone drops one: 3
Peter Johns Kim Smith Anne Kennedy
 */
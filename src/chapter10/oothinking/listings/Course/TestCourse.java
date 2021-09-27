/* Listing 10.5 */
package chapter10.oothinking.listings.Course;

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
    }

}

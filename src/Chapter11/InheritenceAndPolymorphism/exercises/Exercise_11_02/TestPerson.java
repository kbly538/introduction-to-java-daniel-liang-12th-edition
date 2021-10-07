/*
(The Person, Student, Employee, Faculty, and Staff classes) Design a class
named Person and its two subclasses named Student and Employee. Make
Faculty and Staff subclasses of Employee. A person has a name, address,
phone number, and e-mail address. A student has a class status (freshman, sophomore,
junior, or senior). Define the status as a constant. An employee has an
office, salary, and date hired. Use the MyDate class defined in Programming
Exercise 10.14 to create an object for date hired. A faculty member has office
hours and a rank. A staff member has a title. Override the toString method in
each class to display the class name and the person’s name.
Draw the UML diagram for the classes and implement them. Write a test program
that creates a Person, Student, Employee, Faculty, and Staff, and invokes
their toString() methods.
 */
package Chapter11.InheritenceAndPolymorphism.exercises.Exercise_11_02;

public class TestPerson {
    public static void main(String[] args) {

        Student student1 = new Student();
        student1.setName("John");

        Student student2 = new Student();
        student1.setName("Mary");


        Faculty faculty1 = new Faculty();
        faculty1.setName("Carter");

        Faculty faculty2 = new Faculty();
        faculty2.setName("Scully");

        Staff staff1 = new Staff();
        staff1.setName("Hafize");

        Staff staff2 = new Staff();
        staff2.setName("George");

        System.out.println(student1.toString());
        System.out.println(student2.toString());
        System.out.println(faculty1.toString());
        System.out.println(faculty2.toString());
        System.out.println(staff1.toString());
        System.out.println(staff2.toString());
    }
}

/* OUTPUT
Class: Person
Chapter11.InheritenceAndPolymorphism.exercises.Exercise_11_02.Student--- Person's name: Mary
Class: Person
Chapter11.InheritenceAndPolymorphism.exercises.Exercise_11_02.Student--- Person's name: null
Class: Person
Chapter11.InheritenceAndPolymorphism.exercises.Exercise_11_02.Faculty--- Person's name: Carter
Class: Person
Chapter11.InheritenceAndPolymorphism.exercises.Exercise_11_02.Faculty--- Person's name: Scully
Class: Person
Chapter11.InheritenceAndPolymorphism.exercises.Exercise_11_02.Staff--- Person's name: Hafize
Class: Person
Chapter11.InheritenceAndPolymorphism.exercises.Exercise_11_02.Staff--- Person's name: George
 */
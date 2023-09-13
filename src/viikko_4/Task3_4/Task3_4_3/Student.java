package viikko_4.Task3_4.Task3_4_3;

/*
    Task 3: Serialization of Course Enrollment

    Create a Java program that demonstrates the serialization
    and deserialization of a course enrollment system.
    You will create classes for students, courses, and enrollments,
    and then serialize and deserialize instances of these classes.

    Create a Student class with the following attributes:

    id (int)
    name (String)
    age (int)
    Create a Course class with the following attributes:

    courseCode (String)
    courseName (String)
    instructor (String)
    Create an Enrollment class that represents the enrollment of a student in a course.
    It should have attributes:

    student (Student)
    course (Course)
    enrollmentDate (String)
    Implement constructors, getters, and setters for all classes.

    Create a Main class with the main method to demonstrate serialization and deserialization.
    In the main method:

    Create instances of Student, Course, and Enrollment.
    Serialize and save the instances to a file named "enrollments.ser".
    Deserialize the instances from the "enrollments.ser" file and print their information.
    Here's a simplified example of how the code might look:

    import java.io.*;

    class Student implements Serializable {
        // Attributes and methods
    }

    class Course implements Serializable {
        // Attributes and methods
    }

    class Enrollment implements Serializable {
        // Attributes and methods
    }

    public class Main {
        public static void main(String[] args) {
            // Create instances of Student, Course, and Enrollment
            // Serialize and save the Enrollment instance
            // Deserialize and print the Enrollment instance
        }
    }
*/

import java.io.Serializable;

// Step 1: Create a Student class with attributes id, name, and age
public class Student implements Serializable {
    private int id;
    private String name;
    private int age;

    // Step 2: Implement a constructor to initialize the attributes
    public Student(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    // Step 3: Implement getters and setters for the attributes
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}


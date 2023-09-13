package viikko_4.Task3_4.Task3_4_3;

import java.io.*;

public class Main {
    public static void main(String[] args) {

        // Create instances of Student, Course, and Enrollment
        Student student = new Student(1, "Alice", 20);
        Course course = new Course("CS101", "Introduction to Java", "Prof. Vesa");
        Enrollment enrollment = new Enrollment(student, course, "21-08-2023");

        // Serialize and save the Enrollment instance to a file
        try (ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream("enrollments.ser"))) {
            outputStream.writeObject(enrollment);
            System.out.println("Enrollment object has been serialized and saved.");
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Deserialize and print the Enrollment instance from the file
        try (ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream("enrollments.ser"))) {
            Enrollment deserializedEnrollment = (Enrollment) inputStream.readObject();
            System.out.println("Enrollment object has been deserialized and printed:");
            System.out.println("Student: " + deserializedEnrollment.getStudent().getName());
            System.out.println("Course: " + deserializedEnrollment.getCourse().getCourseName());
            System.out.println("Enrollment Date: " + deserializedEnrollment.getEnrollmentDate());
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}


package viikko_4.Task3_4.Task3_4_3;

import java.io.Serializable;

// Step 1: Create an Enrollment class to represent the enrollment of a student in a course
public class Enrollment implements Serializable {
    private Student student;
    private Course course;
    private String enrollmentDate;

    // Step 2: Implement a constructor to initialize the attributes
    public Enrollment(Student student, Course course, String enrollmentDate) {
        this.student = student;
        this.course = course;
        this.enrollmentDate = enrollmentDate;
    }

    // Step 3: Implement getters and setters for the attributes
    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public Course getCourse() {
        return course;
    }

    public void setCourse(Course course) {
        this.course = course;
    }

    public String getEnrollmentDate() {
        return enrollmentDate;
    }

    public void setEnrollmentDate(String enrollmentDate) {
        this.enrollmentDate = enrollmentDate;
    }
}


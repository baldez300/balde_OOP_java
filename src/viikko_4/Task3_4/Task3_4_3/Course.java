package viikko_4.Task3_4.Task3_4_3;

import java.io.Serializable;

// Step 1: Create a Course class with attributes courseCode, courseName, and instructor
public class Course implements Serializable {
    private String courseCode;
    private String courseName;
    private String instructor;

    // Step 2: Implement a constructor to initialize the attributes
    public Course(String courseCode, String courseName, String instructor) {
        this.courseCode = courseCode;
        this.courseName = courseName;
        this.instructor = instructor;
    }

    // Step 3: Implement getters and setters for the attributes
    public String getCourseCode() {
        return courseCode;
    }

    public void setCourseCode(String courseCode) {
        this.courseCode = courseCode;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public String getInstructor() {
        return instructor;
    }

    public void setInstructor(String instructor) {
        this.instructor = instructor;
    }
}


// Student.java

import java.util.Arrays;

public class Student {
    private String studentID;
    private String studentName;
    private String[] extraActivities;

    // Constructor
    public Student(String studentID, String studentName, int numExtraActivities) {
        this.studentID = studentID;
        this.studentName = studentName;
        this.extraActivities = new String[numExtraActivities];
    }

    // Getter and Setter for studentID
    public String getStudentID() {
        return studentID;
    }

    public void setStudentID(String studentID) {
        this.studentID = studentID;
    }

    // Getter and Setter for studentName
    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    // Getter and Setter for extraActivities
    public String[] getExtraActivities() {
        return extraActivities;
    }

    public void setExtraActivities(String[] extraActivities) {
        this.extraActivities = extraActivities;
    }

    // Method to add extra activities
    public void addExtraActivity(String activity, int index) {
        if (index >= 0 && index < extraActivities.length) {
            extraActivities[index] = activity;
        } else {
            System.out.println("Invalid index");
        }
    }

    // Method to display student details
    public String toString() {
        return "Student ID: " + studentID + "\nStudent Name: " + studentName + "\nExtra Activities: " + Arrays.toString(extraActivities);
    }
}

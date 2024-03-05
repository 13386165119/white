// MainClass.java

import java.util.Scanner;

public class MainClass {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Enter student ID:");
            String studentID = scanner.nextLine();

            System.out.println("Enter student name:");
            String studentName = scanner.nextLine();

            System.out.println("Enter number of extra activities:");
            int numExtraActivities = scanner.nextInt();
            scanner.nextLine(); // Consume the newline character

            // Create a new student object
            Student student = new Student(studentID, studentName, numExtraActivities);

            // Add extra activities
            for (int i = 0; i < numExtraActivities; i++) {
                System.out.println("Enter extra activity " + (i + 1) + ":");
                String activity = scanner.nextLine();
                student.addExtraActivity(activity, i);
            }

            // Display student details
            System.out.println("Student details:\n" + student);

            System.out.println("Do you want to enter another student? (yes/no)");
            String continueInput = scanner.nextLine().toLowerCase();

            if (!continueInput.equals("yes")) {
                break;
            }
        }

        scanner.close();
    }
}

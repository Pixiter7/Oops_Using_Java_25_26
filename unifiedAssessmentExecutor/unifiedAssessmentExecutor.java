// UID: 24BCS12643
// Name: Himanshu Kumar

import java.util.Scanner;
import java.util.InputMismatchException;

public class StudentGradeEvaluation {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        try {
            // Taking input
            System.out.print("Enter Student Name: ");
            String name = sc.nextLine();

            System.out.print("Enter Marks (out of 100): ");
            int marks = sc.nextInt();

            // Checking valid marks range
            if (marks < 0 || marks > 100) {
                throw new IllegalArgumentException(
                        "Marks must be between 0 and 100.");
            }

            // Grade calculation
            String grade;

            if (marks >= 90)
                grade = "A";
            else if (marks >= 75)
                grade = "B";
            else if (marks >= 60)
                grade = "C";
            else if (marks >= 40)
                grade = "D";
            else
                grade = "Fail";

            // Display result
            System.out.println("\n--- Student Result ---");
            System.out.println("Student Name : " + name);
            System.out.println("Marks Entered: " + marks);
            System.out.println("Grade Obtained: " + grade);
        }

        // Handles non-numeric input
        catch (InputMismatchException e) {
            System.out.println(
                    "Invalid input. Please enter numeric marks only.");
        }

        // Handles invalid marks range
        catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

        // Always executed
        finally {
            System.out.println("Marks evaluation completed.");
            sc.close();
        }
    }
}
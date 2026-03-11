
// UID: 24BCS12643
// Name: Himanshu Kumar

//java program that performs the following operation using scanner input
//Take student name, roll number and course from the user using Scanner.
//Create a file named student.txt
//Write the entered details into the file.
//Read and display the contents of the file on the console.

// Example input 
// Enter the student name: Rahul
// Enter the roll number: 101
// Enter course: B.Tech
import java.io.*;
import java.util.Scanner;
public class creating_student_testfile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the student name: ");
        String name = scanner.nextLine();

        System.out.print("Enter the roll number: ");
        int rollNumber = scanner.nextInt();
        scanner.nextLine(); // Consume the newline character

        System.out.print("Enter course: ");
        String course = scanner.nextLine();

        try (BufferedWriter writer = new BufferedWriter(new FileWriter("student.txt"))) {
            writer.write("Name: " + name);
            writer.newLine();
            writer.write("Roll Number: " + rollNumber);
            writer.newLine();
            writer.write("Course: " + course);
            System.out.println("Student details written to file successfully.");
        } catch (IOException e) {
            System.err.println("Error writing to file: " + e.getMessage());
        }

        try (BufferedReader reader = new BufferedReader(new FileReader("student.txt"))) {
            String line;
            System.out.println("\nContents of student.txt:");
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.err.println("Error reading from file: " + e.getMessage());
        }
    }
}
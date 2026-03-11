
// UID: 24BCS12643
// Name: Himanshu Kumar

//create a file using java and write and read your name from it, use scanner and writer 
import java.io.*;
import java.util.Scanner;
public class file_handling {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();

        try (BufferedWriter writer = new BufferedWriter(new FileWriter("name.txt"))) {
            writer.write(name);
            System.out.println("Name written to file successfully.");
        } catch (IOException e) {
            System.err.println("Error writing to file: " + e.getMessage());
        }

        try (BufferedReader reader = new BufferedReader(new FileReader("name.txt"))) {
            String readName = reader.readLine();
            System.out.println("Name read from file: " + readName);
        } catch (IOException e) {
            System.err.println("Error reading from file: " + e.getMessage());
        }
    }
}
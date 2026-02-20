Design a Java program that evaluates a student's marks and assigns a grade using proper exception handling. The program should ask the user to enter the student's name and marks (out of 100). Based on the marks entered, the program should calculate the grade using the following criteria:
Marks ≥ 90 → Grade A
Marks ≥ 75 → Grade B
Marks ≥ 60 → Grade C
Marks ≥ 40 → Grade D
Marks < 40 → Fail
The program must use exception handling to ensure safe execution. If the user enters marks less than 0 or greater than 100, the program should throw and handle an IllegalArgumentException with an appropriate message such as "Marks must be between 0 and 100." If the user enters invalid input such as text instead of numbers, the program should handle the InputMismatchException and display "Invalid input. Please enter numeric marks only."
All input and grade calculation logic must be written inside the try block, exception handling must be done using appropriate catch blocks, and a finally block must always execute and display a message such as "Marks evaluation completed."
Additionally, you should display the following details if no exception occurs:
Student Name
Marks Entered
Grade Obtained
package com.course.main;
import com.course.model.*;
import com.course.service.*;
import com.course.exception.*;
public class Main {
    public static void main(String[] args) {
        CourseService service = new CourseService();
        Course c1 = new Course(101, "Java Programming", 2);
        Course c2 = new Course(102, "Python Programming", 3);
        service.addCourse(c1);
        service.addCourse(c2);
        Student s1 = new Student(1, "Rahul");
        Student s2 = new Student(2, "Aman");
        Student s3 = new Student(3, "Priya");
        try {
            service.enrollStudent(101, s1);
            service.enrollStudent(101, s2);
            service.enrollStudent(101, s1);
            service.enrollStudent(101, s3);
        } catch (CourseNotFoundException e) {
            System.out.println(e.getMessage());
        } catch (CourseFullException e) {
            System.out.println(e.getMessage());
        } catch (DuplicateEnrollmentException e) {
            System.out.println(e.getMessage());
        }
        System.out.println("\nCourse Details:");
        service.viewCourses();
        System.out.println("\nEnrollment File Data:");
        service.readEnrollments();
    }
}
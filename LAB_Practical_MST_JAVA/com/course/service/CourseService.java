package com.course.service;
import com.course.model.Course;
import com.course.model.Student;
import com.course.exception.*;
import java.io.*;
import java.util.*;
public class CourseService {
    private List<Course> courseList = new ArrayList<>();
    private Map<Integer, List<Integer>> enrollmentMap = new HashMap<>();
    public void addCourse(Course c) {
        courseList.add(c);
    }
    public void enrollStudent(int courseId, Student s)
            throws CourseNotFoundException, CourseFullException, DuplicateEnrollmentException {
        Course foundCourse = null;
        for (Course c : courseList) {
            if (c.getCourseId() == courseId) {
                foundCourse = c;
                break;
            }
        }
        if (foundCourse == null) {
            throw new CourseNotFoundException("Course ID not found");
        }
        if (foundCourse.getEnrolledStudents() >= foundCourse.getMaxSeats()) {
            throw new CourseFullException("Course is full");
        }
        List<Integer> students = enrollmentMap.getOrDefault(courseId, new ArrayList<>());
        if (students.contains(s.getStudentId())) {
            throw new DuplicateEnrollmentException("Student already enrolled in this course");
        }
        students.add(s.getStudentId());
        enrollmentMap.put(courseId, students);
        foundCourse.setEnrolledStudents(foundCourse.getEnrolledStudents() + 1);
        saveEnrollment(foundCourse, s);
    }
    public void viewCourses() {
        for (Course c : courseList) {
            c.displayCourse();
        }
    }
    private void saveEnrollment(Course c, Student s) {
        try {
            BufferedWriter bw = new BufferedWriter(new FileWriter("courses.txt", true));
            bw.write(c.getCourseId() + "," + c.getCourseName() + "," +
                    s.getStudentId() + "," + s.getStudentName());
            bw.newLine();
            bw.close();
        } catch (IOException e) {
            System.out.println("Error writing file");
        }
    }
    public void readEnrollments() {
        try {
            BufferedReader br = new BufferedReader(new FileReader("courses.txt"));
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
            br.close();
        } catch (IOException e) {
            System.out.println("Error reading file");
        }
    }
}
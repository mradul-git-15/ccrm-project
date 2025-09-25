package edu.ccrm.cli;

import edu.ccrm.domain.Student;
import edu.ccrm.domain.Course;
import edu.ccrm.service.impl.StudentServiceImpl;
import edu.ccrm.service.impl.CourseServiceImpl;
import edu.ccrm.service.StudentService;
import edu.ccrm.service.CourseService;
import edu.ccrm.io.BackupService;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StudentService studentService = new StudentServiceImpl();
        CourseService courseService = new CourseServiceImpl();
        boolean running = true;

        while (running) {
            System.out.println("\n===== College CRM Menu =====");
            System.out.println("1. Add Student");
            System.out.println("2. List Students");
            System.out.println("3. Add Course");
            System.out.println("4. List Courses");
            System.out.println("5. Backup Data");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");
            String choice = scanner.nextLine();

            switch (choice) {
                case "1":
                    System.out.print("Enter Student ID: ");
                    int id = 0;
                    try {
                        id = Integer.parseInt(scanner.nextLine());
                    } catch (NumberFormatException e) {
                        System.out.println("Invalid ID! Must be a number.");
                        break;
                    }

                    System.out.print("Enter Student Name: ");
                    String name = scanner.nextLine();
                    System.out.print("Enter Student Major: ");
                    String major = scanner.nextLine();

                    Student student = new Student(id, name, major);
                    studentService.addStudent(student);
                    break;

                case "2":
                    System.out.println("\nList of Students:");
                    for (Student s : studentService.listStudents()) {
                        System.out.println(s);
                    }
                    break;

                case "3":
                    System.out.print("Enter Course Code: ");
                    String code = scanner.nextLine();
                    System.out.print("Enter Course Title: ");
                    String title = scanner.nextLine();
                    System.out.print("Enter Credits: ");
                    int credits = Integer.parseInt(scanner.nextLine());
                    System.out.print("Enter Instructor: ");
                    String instructor = scanner.nextLine();
                    System.out.print("Enter Semester: ");
                    String semester = scanner.nextLine();
                    System.out.print("Enter Department: ");
                    String department = scanner.nextLine();

                    Course course = new Course(code, title, credits, instructor, semester, department);
                    courseService.addCourse(course);
                    break;

                case "4":
                    System.out.println("\nList of Courses:");
                    for (Course c : courseService.listCourses()) {
                        System.out.println(c);
                    }
                    break;

                case "5":
                    System.out.println("\nBacking up data...");
                    BackupService.backupData();
                    break;

                case "6":
                    running = false;
                    System.out.println("Exiting...");
                    break;

                default:
                    System.out.println("Invalid choice. Please enter 1-6.");
            }
        }

        scanner.close();
    }
}

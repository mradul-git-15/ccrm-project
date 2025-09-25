package edu.ccrm.config;

import edu.ccrm.domain.Student;
import edu.ccrm.domain.Course;
import java.io.*;
import java.util.HashMap;
import java.util.Map;

public class DataStore {
    private static DataStore instance;
    private Map<Integer, Student> students;
    private Map<String, Course> courses;
    private final String STUDENT_FILE = "students.dat";
    private final String COURSE_FILE = "courses.dat";

    private DataStore() {
        students = loadStudents();
        courses = loadCourses();
    }

    public static DataStore getInstance() {
        if(instance == null) instance = new DataStore();
        return instance;
    }

    public Map<Integer, Student> getStudents() { return students; }
    public Map<String, Course> getCourses() { return courses; }

    public void saveStudents() { saveToFile(STUDENT_FILE, students); }
    public void saveCourses() { saveToFile(COURSE_FILE, courses); }

    @SuppressWarnings("unchecked")
    private Map<Integer, Student> loadStudents() {
        Object obj = loadFromFile(STUDENT_FILE);
        return obj != null ? (Map<Integer, Student>) obj : new HashMap<>();
    }

    @SuppressWarnings("unchecked")
    private Map<String, Course> loadCourses() {
        Object obj = loadFromFile(COURSE_FILE);
        return obj != null ? (Map<String, Course>) obj : new HashMap<>();
    }

    private void saveToFile(String filename, Object obj) {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(filename))) {
            oos.writeObject(obj);
        } catch (IOException e) {
            System.out.println("Error saving data: " + e.getMessage());
        }
    }

    private Object loadFromFile(String filename) {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(filename))) {
            return ois.readObject();
        } catch (FileNotFoundException e) {
            return null;
        } catch (IOException | ClassNotFoundException e) {
            System.out.println("Error loading data: " + e.getMessage());
            return null;
        }
    }
}

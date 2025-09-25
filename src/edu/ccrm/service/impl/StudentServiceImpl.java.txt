package edu.ccrm.service.impl;

import edu.ccrm.config.DataStore;
import edu.ccrm.domain.Student;
import edu.ccrm.service.StudentService;

import java.util.ArrayList;
import java.util.List;

public class StudentServiceImpl implements StudentService {
    private final DataStore dataStore = DataStore.getInstance();

    @Override
    public void addStudent(Student student) {
        if(dataStore.getStudents().containsKey(student.getId())) {
            System.out.println("Student ID already exists!");
            return;
        }
        dataStore.getStudents().put(student.getId(), student);
        dataStore.saveStudents();
        System.out.println("Student " + student.getName() + " added successfully.");
    }

    @Override
    public List<Student> listStudents() {
        return new ArrayList<>(dataStore.getStudents().values());
    }
}

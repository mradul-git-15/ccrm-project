package edu.ccrm.domain;

import java.io.Serializable;

public class Student implements Serializable {
    private static final long serialVersionUID = 1L;
    private int id;
    private String name;
    private String major;

    public Student(int id, String name, String major) {
        this.id = id;
        this.name = name;
        this.major = major;
    }

    public int getId() { return id; }
    public String getName() { return name; }
    public String getMajor() { return major; }

    @Override
    public String toString() {
        return "ID: " + id + ", Name: " + name + ", Major: " + major;
    }
}

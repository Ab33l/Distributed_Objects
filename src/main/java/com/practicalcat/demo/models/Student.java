package com.practicalcat.demo.models;

public class Student {
    private int studentId;

    private String firstName;

    public Student(int studentId, String firstName) {
        this.studentId = studentId;
        this.firstName = firstName;
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
}

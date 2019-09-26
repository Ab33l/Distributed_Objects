package com.practicalcat.demo.models;

public class Matches {
    private Long studentId;
    private String gender;

    public Long getstudentId() {
        return studentId;
    }

    public void setstudentId(Long studentId) {
        this.studentId = studentId;
    }

    public String gender() {
        return gender;
    }

    public void setgender(String gender) {
        this.gender = gender;
    }
    public Matches(Long studentId, String gender){
        this.studentId = studentId;
        this.gender = gender;

    }

}

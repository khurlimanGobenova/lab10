package com.example.demo;

public class Student extends Person {
    private String studentId;

    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public static void main(String[] args) {
        Student student = new Student();
        student.setName("Sevara");
        student.setAge(20);
        student.setAddress("256 Navoi Str");
        student.setStudentId("PU202020");

        System.out.println("Student Name: " + student.getName() +
                ", Age: " + student.getAge() +
                ", Address: " + student.getAddress() +
                ", ID: " + student.getStudentId());
    }
}
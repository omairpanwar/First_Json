package com.example.umairpanwar.first_json;

import com.example.umairpanwar.first_json.Department;

public class Student {
    private String name;
    private int rollno;
    private String fname;
    private int age;
    private String[] subject;
    private Department department;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRollno() {
        return rollno;
    }

    public void setRollno(int rollno) {
        this.rollno = rollno;
    }

    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String[] getSubject() {
        return subject;
    }

    public void setSubject(String[] subject) {
        this.subject = subject;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    public Student(String name, int rollno, String fname, int age, String[] subject, Department department) {
        this.name = name;
        this.rollno = rollno;
        this.fname = fname;
        this.age = age;
        this.subject = subject;
        this.department = department;

    }
}

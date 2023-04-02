package com.java7.vision.oop.classes;

public class Student {
    int id;
    String name = "Sami";
    String major;

    public Student() {
    }

    public Student(int id, String name, String major) {
        this.id = id;
        this.name = name;
        this.major = major;
    }
    public void initData(int id, String name, String major){
        this.id = id;
        this.name = name;
        this.major = major;
    }

    public String printData() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", major='" + major + '\'' +
                '}';
    }
}

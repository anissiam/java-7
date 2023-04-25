package com.java7.vision.oop.interfaces;

public class Student extends Person{
    private String major;

    public Student() {
    }

    public Student(String major) {
        this.major = major;
    }

    public Student(String name, int age, String id, String major) {
        super(name, age, id);
        this.major = major;
    }

    public void printSuper(){
        System.out.println(super.toString());

    }
    @Override
    public String toString() {
        return "Student{" +
                "major='" + major + '\'' +
                '}' + " " +
                super.toString();
    }
}

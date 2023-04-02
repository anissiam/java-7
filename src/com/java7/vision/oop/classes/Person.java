package com.java7.vision.oop.classes;

public class Person {
    String name ;
    int age;
    int id;
    double tall;

    public Person(){
    }

    public Person(String name, int age, int id, double tall) {
        this.name = name;
        this.age = age;
        this.id = id;
        this.tall = tall;
    }

    public void printData(){
        System.out.println("Name: " + name + " Age: " +
                age + " ID: " + id + " Tall: " + tall);
    }

    public void checkName(String name) {
        System.out.println(this.name.equals(name));
    }
}

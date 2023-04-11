package com.java7.vision.oop.inhr;

public class Animal {
     int age;
     String name;

    public Animal(){

    }

    public Animal(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public void makeNoise() {
        System.out.println("This is my nice");
    }


}

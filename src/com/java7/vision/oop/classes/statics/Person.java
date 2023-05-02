package com.java7.vision.oop.classes.statics;

public class Person {
    String name;
    static int count ;
    public Person(){
        count++;
    }

    public static void addNumbers(int x, int y) {
        System.out.println(x + y);


    }
}

package com.java7.vision.oop.classes;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Person object = new Person();
        object.name = "Anis";
        System.out.println(object.name);
        object.printData();

        Person p1 = new Person();
        p1.printData();

        oooo();

    }

    public static void oooo(){
        Person person = new Person();
    }
}

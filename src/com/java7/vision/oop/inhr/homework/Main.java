package com.java7.vision.oop.inhr.homework;

public class Main {
    public static void main(String[] args) {
        Squre squre = new Squre();
        squre.setHeight(10);
        squre.setWidth(10);
        squre.area();
        squre.printData();
        squre.prameter();


        Circle circle = new Circle();
        circle.setRad(10);
        circle.area();

    }
}

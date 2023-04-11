package com.java7.vision.oop.inhr.homework;

public class Squre extends Shape {
    public void printData() {
        System.out.println(super.toString());
    }

    public void area(){
        System.out.println(getHeight() * getWidth());
    }
    public void prameter(){
        System.out.println(getHeight() * 4);
    }

}

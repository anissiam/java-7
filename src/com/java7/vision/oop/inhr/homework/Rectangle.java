package com.java7.vision.oop.inhr.homework;

public class Rectangle extends Shape{
    public void printData() {
        System.out.println(super.toString());
    }

    public void area(){
        System.out.println(getHeight() * getWidth());
    }
    public void prameter(){
        System.out.println(2*(getHeight()+getWidth()));
    }
}

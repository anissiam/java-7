package com.java7.vision.oop.inhr.homework;

public class Circle extends Shape {
    private int rad;
    private final double PI = 3.14;
    public int getRad() {
        return rad;
    }

    public void setRad(int rad) {
        this.rad = rad;
    }

    public void printData() {
        System.out.println(super.toString() + "  Rad:" + rad);

    }

    public void area(){
        System.out.println(PI * (rad * rad));
    }
    public void prameter(){
        System.out.println(2*PI*rad);
    }

}

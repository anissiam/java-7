package com.java7.vision.oop.inhr.shapeExample;

public class Squre extends Shape {
    public Squre() {
    }

    public Squre(int height, int width) {
        super(height, width);
    }

    @Override
    public double area() {
        return getHeight()*getWidth();
    }

    @Override
    public double prameter() {
        return 4 * getWidth();
    }
}

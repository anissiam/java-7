package com.java7.vision.oop.inhr.shapeExample;

public class Circle extends Shape {

    private final double PI = 3.14;

    public Circle() {
    }

    public Circle(int rad) {
        super(rad);
    }


    @Override
    public double area() {
        return PI * (getRad() * getRad());
    }

    @Override
    public double prameter() {
        return 2 * PI * getRad();
    }
}

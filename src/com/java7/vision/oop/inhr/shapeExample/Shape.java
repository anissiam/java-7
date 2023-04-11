package com.java7.vision.oop.inhr.shapeExample;

public class Shape {
    private int height;
    private int width;
    private int rad;

    public Shape() {
    }

    public Shape(int rad) {
        this.rad = rad;
    }

    public Shape(int height, int width) {
        this.height = height;
        this.width = width;
    }

    public Shape(int height, int width, int rad) {
        this.height = height;
        this.width = width;
        this.rad = rad;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getRad() {
        return rad;
    }

    public void setRad(int rad) {
        this.rad = rad;
    }
    public double area(){
        return 0.0;
    }
    public double prameter(){
        return 0.0;
    }

    @Override
    public String toString() {
        return "Shape{" +
                "height=" + height +
                ", width=" + width +
                ", rad=" + rad +
                '}';
    }
}

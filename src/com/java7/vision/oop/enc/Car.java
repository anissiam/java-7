package com.java7.vision.oop.enc;

public class Car {
    private String name;
    private String color;
    private double price;

    private Student student;  // Attr

    public Car() {
    }

    public Car(String name, String color, double price, Student student) {
        this.name = name;
        this.color = color;
        this.price = price;
        this.student = student;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    @Override
    public String toString() {
        return "Car{" +
                "name='" + name + '\'' +
                ", color='" + color + '\'' +
                ", price=" + price +
                ", student=" + student +
                '}';
    }
}

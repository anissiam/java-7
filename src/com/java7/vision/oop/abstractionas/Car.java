package com.java7.vision.oop.abstractionas;

 public abstract class Car {
    private String name;
    private double speed;

    public Car() {
    }

    public Car(String name, double speed) {
        this.name = name;
        this.speed = speed;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSpeed() {
        return speed;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }

    public abstract void convertSpeed();

    public abstract void printCarData();

}

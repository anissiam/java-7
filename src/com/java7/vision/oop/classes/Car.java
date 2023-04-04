package com.java7.vision.oop.classes;

class Car {
    int speed;
    String color;
    String type;
    String name;

    public Car() {

    }

    public Car(int speed, String color, String type, String name) {
        this.name = name;
        this.speed = speed;
        this.color = color;
        this.type = type;
    }

    public void convertSpeed() {
        double converter = speed * 0.621371;
        System.out.println(converter + " Miles");
    }

    public String printData() {
        return "Car{" + "speed=" + speed + ", color='" + color + '\'' + ", type='" + type + '\'' + ", name='" + name + '\'' + '}';
    }

    public void printSpeed() {
        for (int i = 0; i < speed; i++) {
            try {
                Thread.sleep(500);
                System.out.println(i);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
